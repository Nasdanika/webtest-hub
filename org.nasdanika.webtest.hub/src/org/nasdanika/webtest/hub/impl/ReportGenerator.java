//package org.nasdanika.webtest.hub.impl;
//
//import java.io.BufferedInputStream;
//import java.io.BufferedOutputStream;
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.io.Writer;
//import java.lang.annotation.Annotation;
//import java.lang.reflect.Constructor;
//import java.lang.reflect.Field;
//import java.lang.reflect.Method;
//import java.text.MessageFormat;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.TreeMap;
//import java.util.zip.ZipEntry;
//import java.util.zip.ZipInputStream;
//
//import org.apache.commons.lang3.StringEscapeUtils;
//import org.apache.commons.lang3.StringUtils;
//import org.junit.runners.Parameterized.Parameter;
//import org.nasdanika.html.ApplicationPanel;
//import org.nasdanika.html.ApplicationPanel.ContentPanel;
//import org.nasdanika.html.Carousel;
//import org.nasdanika.html.Container;
//import org.nasdanika.html.HTMLFactory;
//import org.nasdanika.html.HTMLFactory.Glyphicon;
//import org.nasdanika.html.HTMLFactory.Placement;
//import org.nasdanika.html.Table;
//import org.nasdanika.html.Table.Row;
//import org.nasdanika.html.Table.Row.Cell;
//import org.nasdanika.html.Tabs;
//import org.nasdanika.html.Tag;
//import org.nasdanika.html.UIElement.Color;
//import org.nasdanika.html.UIElement.DeviceSize;
//import org.nasdanika.html.UIElement.Style;
//import org.nasdanika.html.impl.DefaultHTMLFactory;
//import org.nasdanika.webtest.TestResult.TestStatus;
//import org.openqa.selenium.WebDriver;
//
//class ReportGenerator {
//
//	private Class<?> klass;
//	private List<? extends TestResult> testResults;
//	private File outputDir;
//	private List<ActorResult> actorResults;
//	private List<PageResult> pageResults;
//
//	@SuppressWarnings("unchecked")
//	ReportGenerator(Class<?> klass, File outputDir, IdGenerator idGenerator, Collection<? extends TestResult> testResults) {
//		this.klass = klass;
//		this.outputDir = outputDir;
//		
//		this.testResults = new ArrayList<>(testResults);
//		Collections.sort(this.testResults, new Comparator<TestResult>() {
//
//			@Override
//			public int compare(TestResult o1, TestResult o2) {
//				return classTitle(o1.getTestClass()).compareTo(classTitle(o2.getTestClass()));
//			}
//			
//		});
//		
//		Map<Class<?>, ActorResult> actorResultCollector = new HashMap<>();
//		Map<Class<?>, PageResult> pageResultCollector = new HashMap<>();
//		Report reportAnnotation = klass.getAnnotation(Report.class);
//		if (reportAnnotation!=null) {
//			for (Class<?> cc: reportAnnotation.coverage()) {
//				if (Actor.class.isAssignableFrom(cc)) {
//					ActorResult aar = actorResultCollector.get(cc);
//					if (aar==null) {
//						aar = new ActorResult((Class<? extends Actor<WebDriver>>) cc, idGenerator.genId(cc.getName(), null));
//						actorResultCollector.put(cc, aar);
//					}
//				}
//				
//				if (Page.class.isAssignableFrom(cc)) {
//					PageResult apr = pageResultCollector.get(cc);
//					if (apr==null) {
//						apr = new PageResult((Class<? extends Page<WebDriver>>) cc, idGenerator.genId(cc.getName(), null), 0);
//						pageResultCollector.put(cc, apr);
//					}
//				}
//			}
//		}	
//		
//		for (TestResult tr: testResults) {
//			for (ActorResult car: tr.getActorResults()) {
//				ActorResult aar = actorResultCollector.get(car.getActorInterface());
//				if (aar==null) {
//					aar = new ActorResult(car.getActorInterface(), idGenerator.genId(car.getActorInterface().getName(), null));
//					actorResultCollector.put(car.getActorInterface(), aar);
//				}
//				aar.merge(car);
//			}
//		}
//		actorResults = new ArrayList<>(actorResultCollector.values());
//		Collections.sort(actorResults, new Comparator<ActorResult>() {
//
//			@Override
//			public int compare(ActorResult o1, ActorResult o2) {
//				return classTitle(o1.getActorInterface()).compareTo(classTitle(o2.getActorInterface()));
//			}
//		});
//
//		for (TestResult tr: testResults) {
//			for (PageResult cpr: tr.getPageResults()) {
//				PageResult apr = pageResultCollector.get(cpr.getPageInterface());
//				if (apr==null) {
//					apr = new PageResult(cpr.getPageInterface(), idGenerator.genId(cpr.getPageInterface().getName(), null), cpr.size());
//					pageResultCollector.put(cpr.getPageInterface(), apr);
//				}
//				apr.merge(cpr);
//			}
//		}
//		pageResults = new ArrayList<>(pageResultCollector.values());
//		Collections.sort(pageResults, new Comparator<PageResult>() {
//
//			@Override
//			public int compare(PageResult o1, PageResult o2) {
//				return classTitle(o1.getPageInterface()).compareTo(classTitle(o2.getPageInterface()));
//			}
//		});
//	}
//	
//	
//	void generate() throws Exception {
//		
//		try (InputStream resourcesZipStream = new BufferedInputStream(TestClassResult.class.getResourceAsStream("WebContent.zip"))) {
//			if (resourcesZipStream!=null) {
//				try (ZipInputStream resourceStream = new ZipInputStream(resourcesZipStream)) {
//					ZipEntry entry;
//					while ((entry = resourceStream.getNextEntry())!=null) {
//						File rOutFile = new File(outputDir, entry.getName().replace('/', File.separatorChar));
//						if (entry.isDirectory()) {
//							rOutFile.mkdirs();
//						} else {
//							try (OutputStream rOut = new BufferedOutputStream(new FileOutputStream(rOutFile))) {
//								for (int data = resourceStream.read(); data!=-1; data = resourceStream.read()) {
//									rOut.write(data);
//								}
//							}
//						}
//					}
//				}
//			}
//		}
//		
//		DefaultHTMLFactory htmlFactory = new DefaultHTMLFactory();
//		
//		htmlFactory.getStylesheets().add("bootstrap/css/bootstrap.min.css");
//		htmlFactory.getStylesheets().add("bootstrap/css/bootstrap-theme.min.css");
//		htmlFactory.getStylesheets().add("css/lightbox.css");
//		
//		htmlFactory.getScripts().add("js/jquery-1.11.1.min.js");
//		htmlFactory.getScripts().add("js/underscore-min.js");
//		htmlFactory.getScripts().add("js/backbone-min.js");
//		htmlFactory.getScripts().add("bootstrap/js/bootstrap.min.js");
//		htmlFactory.getScripts().add("js/require.js");
//		htmlFactory.getScripts().add("js/lightbox.min.js");
//		
//		Title titleAnnotation = klass.getAnnotation(Title.class);
//		String title;
//		if (titleAnnotation==null) {
//			String className = klass.getName();
//			title = "Test report: "+className.substring(className.lastIndexOf('.')+1);
//		} else {
//			title = titleAnnotation.value();
//		}
//		
//		Report reportAnnotation = klass.getAnnotation(Report.class);
//		
//		generateSummary(htmlFactory, contentDir);
//		
//		for (TestResult testResult: testResults) {
//			generateTestResultDetails(testResult, htmlFactory, contentDir, slideWidth);
//		}
//		
//		for (ActorResult actorResult: actorResults) {
//			generateActorResultDetails(actorResult, htmlFactory, contentDir, slideWidth);			
//		}
//				
//		for (PageResult pageResult: pageResults) {
//			generatePageResultDetails(pageResult, htmlFactory, contentDir, slideWidth);			
//		}		
//		
//		System.out.println("Nasdanika Web Test Report generated in "+outputDir.getAbsolutePath());		
//	}
//
//	protected void generateTestResultDetails(
//			TestResult testResult, 
//			DefaultHTMLFactory htmlFactory, 
//			File contentDir, 
//			int slideWidth) throws IOException {
//		
//		try (FileWriter testResultWriter = new FileWriter(new File(contentDir, "class_"+testResult.getId()+".html"))) {
//			writeTitleAndDescription(testResult, htmlFactory, testResultWriter);
//			if (testResult instanceof TestClassResult) {
//				generateTestClassResultDetails((TestClassResult) testResult, htmlFactory, testResultWriter, contentDir, slideWidth);
//			} else {
//				generateTestSuiteResultDetails((TestSuiteResult) testResult, htmlFactory, testResultWriter, contentDir, slideWidth);
//			}
//		}
//	}
//	
//	protected void generateTestSuiteResultDetails(
//			TestSuiteResult testSuiteResult, 
//			DefaultHTMLFactory htmlFactory, 
//			Writer testResultWriter, 
//			File contentDir, 
//			int slideWidth) throws IOException {
//
//		if (testSuiteResult instanceof ParameterizedTestResult) {
//			testResultWriter.write(genParameterizedTestResultTable(htmlFactory, testSuiteResult).toString());
//		} else {
//			List<TestResult> children = new ArrayList<>(testSuiteResult.getChildren());
//			Collections.sort(children, new Comparator<TestResult>() {
//
//				@Override
//				public int compare(TestResult o1, TestResult o2) {
//					return classTitle(o1.getTestClass()).compareTo(classTitle(o2.getTestClass()));
//				}
//				
//			});
//			testResultWriter.write(genTestResultTable(htmlFactory, children).toString());
//		}
//		for (TestResult tr: testSuiteResult.getChildren()) {
//			generateTestResultDetails(tr, htmlFactory, contentDir, slideWidth);
//		}
//	}
//
//	protected void generateTestClassResultDetails(
//			TestClassResult testClassResult, 
//			DefaultHTMLFactory htmlFactory, 
//			Writer testResultWriter, 
//			File contentDir, 
//			int slideWidth) throws IOException {
//		
//		Table methodTable = htmlFactory.table().bordered();
//		Row headerRow = methodTable.row().style(Style.INFO);
//		headerRow.header(htmlFactory.glyphicon(Glyphicon.cog), " Method");
//		headerRow.header(htmlFactory.glyphicon(Glyphicon.file), " Description");
//		headerRow.header(htmlFactory.glyphicon(Glyphicon.time), " Duration");
//		for (TestMethodResult tmr: testClassResult.getTestMethodResults()) {
//			tmr.genRow(htmlFactory, methodTable);
//		}
//		
//		testResultWriter.write("<P>"+methodTable.toString());			
//		
//		for (TestMethodResult tmr: testClassResult.getTestMethodResults()) {
//			generateTestMethodResultDetails(tmr, htmlFactory, contentDir, slideWidth);
//		}		
//	}
//
//	private void writeTitleAndDescription(TestResult testResult, HTMLFactory htmlFactory, FileWriter testResultWriter) throws IOException {
//		testResultWriter.write("<H3>");
//		if (testResult instanceof TestClassResult) {
//			testResultWriter.write(htmlFactory.glyphicon(Glyphicon.search).toString());
//		} else if (testResult instanceof ParameterizedTestResult) {
//			testResultWriter.write(htmlFactory.glyphicon(Glyphicon.tasks).toString());			
//		} else {
//			testResultWriter.write(htmlFactory.glyphicon(Glyphicon.folder_open).toString());
//		}
//		testResultWriter.write(" ");
//		testResultWriter.write(classTitle(testResult.getTestClass())); // TODO - format for parameterized
//		testResultWriter.write("</H3>");
//		
//		Description description = klass.getAnnotation(Description.class);
//		if (description!=null) {
//			if (description.html()) {
//				for (String str: description.value()) {
//					testResultWriter.write(str);
//					testResultWriter.write(" ");
//				}
//			} else {
//				testResultWriter.write("<pre>");
//				int idx = 0;
//				for (String str: description.value()) {
//					if (idx++>0) {
//						testResultWriter.write(System.lineSeparator());
//					}
//					testResultWriter.write(StringEscapeUtils.escapeHtml4(str));
//				}
//				testResultWriter.write("</pre>");			
//			}
//		}
//	}	
//
//	protected void generateTestMethodResultDetails(
//			TestMethodResult testMethodResult, 
//			DefaultHTMLFactory htmlFactory, 
//			File contentDir, 
//			int slideWidth) throws IOException {
//		
//		try (FileWriter testMethodResultWriter = new FileWriter(new File(contentDir, "operation_"+testMethodResult.id+".html"))) {
//			
//			testMethodResultWriter.write("<H3>");
//			testMethodResultWriter.write(htmlFactory.glyphicon(testMethodResult.getGlyphicon()).toString());
//			testMethodResultWriter.write(" ");
//			testMethodResultWriter.write(testMethodResult.getName());
//			testMethodResultWriter.write("</H3>");
//			
//			StringBuilder initScript = new StringBuilder();
//			Carousel screenshotCarousel = htmlFactory.carousel()
//					.ride(false)
//					.indicatorsBackground(Color.GRAY)
//					.attribute("data-interval", "false")
//					.id(htmlFactory.nextId()+"_screenshotCarousel");
//			List<ScreenshotEntry> allScreenshots = testMethodResult.allScreenshots();
//			for (ScreenshotEntry se: allScreenshots) {
//				String imageLocation = "screenshots/screenshot_"+se.id+".png";
//				Tag imageTag = htmlFactory.tag("img").attribute("src", imageLocation).style("margin", "auto");
//				Tag link = htmlFactory.link(imageLocation, imageTag)
//						.attribute("data-lightbox", "test-"+testMethodResult.id)
//						.attribute("data-title", StringEscapeUtils.escapeHtml4(se.getTextCaption()));
//				String caption = se.getHTMLCaption();
//				if (se.operationResult!=null) {
//					String descr = se.operationResult.getDescriptionHTML();
//					if (descr!=null) {
//						Tag comment = htmlFactory.glyphicon(Glyphicon.comment);
//						comment.id(htmlFactory.nextId()+"_slide_comment");
//						htmlFactory.tooltip(comment, Placement.TOP, descr);
//						initScript.append("jQuery('#"+comment.getId()+"').tooltip({html:true});");
//						caption+="&nbsp;";
//						caption+=comment;		
//					}
//				}
//				screenshotCarousel.slide()
//					.content(link)
//					.caption(htmlFactory.label(Style.INFO, caption).style("opacity", "0.7"));
//			}
//			testMethodResultWriter.write("<a name='carousel_"+screenshotCarousel.getId()+"'/>");
//			testMethodResultWriter.write(screenshotCarousel.toString());
//			
//			Table methodTable = htmlFactory.table().bordered();
//			Row headerRow = methodTable.row().style(Style.INFO);
//			headerRow.header(htmlFactory.glyphicon(Glyphicon.cog), " Method");
//			headerRow.header(htmlFactory.glyphicon(Glyphicon.file), " Description");
//			headerRow.header(htmlFactory.glyphicon(Glyphicon.time), " Duration");
//			testMethodResult.genRows(htmlFactory, methodTable, screenshotCarousel.getId(), allScreenshots, 0);
//			testMethodResultWriter.write("<P>"+methodTable.toString());			
//			if (initScript.length()>0) {
//				testMethodResultWriter.write("<script>");
//				testMethodResultWriter.write(initScript.toString());
//				testMethodResultWriter.write("</script>");				
//			}
//		}
//	}
//	
//	static String classTitle(Class<?> klass) {
//		if (klass==null) {
//			return "";
//		}
//		Title ta = klass.getAnnotation(Title.class);
//		String className = klass.getName().substring(klass.getName().lastIndexOf('.')+1);		
//		if (!klass.isInterface() && className.endsWith("Impl")) {
//			className = className.substring(0, className.length()-4);
//		}
//		return ta==null ? title(className) : ta.value();		
//	}
//
//	protected void generateSummary(HTMLFactory htmlFactory, File contentDir) throws IOException {
//		try (FileWriter summaryWriter = new FileWriter(new File(contentDir, "summary.html"))) {
//			summaryWriter.write("<H3>Summary</H3>");
//			if (actorResults.size()+pageResults.size()>0) {				
//				// Tabs
//				Tabs tabs = htmlFactory.tabs();
//				tabs.item("Tests", genTestResultTable(htmlFactory, this.testResults));
//				if (!actorResults.isEmpty()) {
//					tabs.item("Actors", genActorTable(htmlFactory));
//				}
//				if (!pageResults.isEmpty()) {
//					tabs.item("Pages", genPageTable(htmlFactory));
//				}
//				summaryWriter.write(tabs.toString());
//			} else {			
//				Table classTable = genTestResultTable(htmlFactory, this.testResults);			
//				summaryWriter.write(classTable.toString());
//			}
//		}
//	}
//
//	private Table genTestResultTable(HTMLFactory htmlFactory, Collection<? extends TestResult> testResults) {
//		Table classTable = htmlFactory.table().bordered();
//		Row header = classTable.row().style(Style.INFO);
//		int[] totals = {0, 0, 0, 0};
//		header.header(htmlFactory.glyphicon(Glyphicon.search), "&nbsp;Test class");
//		for (TestResult tr: testResults) {
//			Row classRow = classTable.row();
//			classRow.cell(routeLink(tr, htmlFactory));
//			Cell descriptionCell = classRow.cell();
//			Description description = tr.getTestClass().getAnnotation(Description.class);
//			if (description==null) {
//				descriptionCell.content("&nbsp;");
//			} else if (description.html()) {
//				for (String str: description.value()) {
//					descriptionCell.content(str, " ");
//				}
//			} else {
//				descriptionCell.content("<pre>");
//				int idx = 0;
//				for (String str: description.value()) {
//					if (idx++>0) {
//						descriptionCell.content(System.lineSeparator());
//					}
//					descriptionCell.content(StringEscapeUtils.escapeHtml4(str));
//				}
//				descriptionCell.content("</pre>");			
//			}
//			Map<TestStatus, Integer> stats = tr.getStats();
//			classRow.cell(stats.get(TestStatus.Pass)).attribute("align", "center");
//			classRow.cell(stats.get(TestStatus.Fail)).attribute("align", "center");
//			classRow.cell(stats.get(TestStatus.Error)).attribute("align", "center");
//			classRow.cell(stats.get(TestStatus.Pending)).attribute("align", "center");
//			for (int i=0; i<totals.length; ++i) {
//				totals[i]+=stats.get(TestStatus.values()[i]);
//			}
//		}
//		Row totalsRow = classTable.row().style(Style.INFO);
//		totalsRow.cell("Total").colspan(2);
//		totalsRow.cell(totals[0]).attribute("align", "center");
//		totalsRow.cell(totals[1]).attribute("align", "center");
//		totalsRow.cell(totals[2]).attribute("align", "center");
//		totalsRow.cell(totals[3]).attribute("align", "center");
//		return classTable;
//	}
//	
//	@SuppressWarnings("unchecked")
//	private <T extends Annotation> T getParameterAnnotation(Annotation[] panns, Class<T> annType) {
//		for (Annotation a: panns) {
//			if (annType.isInstance(a)) {
//				return (T) a;
//			}
//		}
//		
//		return null;
//	}
//	
//	private Object genParameterizedTestResultTable(HTMLFactory htmlFactory, TestSuiteResult testSuiteResult) {
//		Table classTable = htmlFactory.table().bordered();
//		Row header = classTable.row().style(Style.INFO);
//		int[] totals = {0, 0, 0, 0};
//		
//		List<Field> paramFields = new ArrayList<>();
//		for (Field f: testSuiteResult.getTestClass().getFields()) {
//			if (f.getAnnotation(Parameter.class)!=null) {
//				paramFields.add(f);
//			}
//		}
//		
//		// { title, description}
//		List<String[]> paramInfo = new ArrayList<>();
//		
//		if (paramFields.isEmpty()) {
//			Constructor<?> constructor = testSuiteResult.getTestClass().getConstructors()[0];
//			Annotation[][] pann = constructor.getParameterAnnotations();
//			Class<?>[] pt = constructor.getParameterTypes();
//			for (int i=0; i<pt.length; ++i) {
//				 paramInfo.add(createParamInfo(String.valueOf(i), getParameterAnnotation(pann[i], Title.class), getParameterAnnotation(pann[i], Description.class)));
//			}
//		} else {
//			Collections.sort(paramFields, new Comparator<Field>() {
//
//				@Override
//				public int compare(Field o1, Field o2) {
//					return o1.getAnnotation(Parameter.class).value() - o2.getAnnotation(Parameter.class).value();
//				}
//				
//			});
//			
//			for (Field f: paramFields) {
//				 paramInfo.add(createParamInfo(f.getName(), f.getAnnotation(Title.class), f.getAnnotation(Description.class)));
//			}
//		}
//		
//		header.header("#").rowspan(2);
//		
//		header.header("Parameters").colspan(paramInfo.size()).style("text-align", "center").attribute("nowrap", "true");
//		
//		header.header(htmlFactory.glyphicon(Glyphicon.ok), "&nbsp;Pass").rowspan(2).style("text-align", "center").attribute("nowrap", "true");
//		header.header(htmlFactory.glyphicon(Glyphicon.remove), "&nbsp;Fail").rowspan(2).style("text-align", "center").attribute("nowrap", "true");
//		header.header(htmlFactory.glyphicon(Glyphicon.warning_sign), "&nbsp;Error").rowspan(2).style("text-align", "center").attribute("nowrap", "true");
//		header.header(htmlFactory.glyphicon(Glyphicon.time), "&nbsp;Pending").rowspan(2).style("text-align", "center").attribute("nowrap", "true");
//		
//		StringBuilder tooltipInitializers = new StringBuilder();
//		
//		Row paramNamesRow = classTable.row().style(Style.INFO);
//		for (String[] pi: paramInfo) {
//			Object prmHeader = pi[0];
//			if (pi[1] != null && pi[1].trim().length()!=0) {
//				prmHeader = htmlFactory.span(prmHeader);
//				htmlFactory.tooltip((Tag) prmHeader, Placement.TOP, pi[1]);
//				((Tag) prmHeader).id("parameterHeader_"+htmlFactory.nextId());
//				tooltipInitializers.append("$('#"+((Tag) prmHeader).getId()+"').tooltip();");
//			}
//			paramNamesRow.header(prmHeader);
//		}
//		int testIdx = 1;
//		for (TestResult tr: testSuiteResult.getChildren()) {
//			TestClassResult tcr = (TestClassResult) tr;
//			if (!tcr.getTestMethodResults().isEmpty()) {
//				Row classRow = classTable.row();
//				classRow.cell(htmlFactory.routeLink("main", "content/class_"+tr.getId()+".html", testIdx++));
//
//				TestMethodResult firstTest = tcr.getTestMethodResults().get(0);
//				int idx = 0;
//				for (Object prm: firstTest.getParameters()) {
//					if (firstTest.getTarget() instanceof ParameterRenderer) {
//						prm = ((ParameterRenderer) firstTest.getTarget()).renderParameter(idx, prm, outputDir);
//					}
//					classRow.cell(prm);
//					idx++;
//				}
//				
//				Map<TestStatus, Integer> stats = tr.getStats();
//				// TODO - parameter values, render to HTML.
//				classRow.cell(stats.get(TestStatus.Pass)).attribute("align", "center");
//				classRow.cell(stats.get(TestStatus.Fail)).attribute("align", "center");
//				classRow.cell(stats.get(TestStatus.Error)).attribute("align", "center");
//				classRow.cell(stats.get(TestStatus.Pending)).attribute("align", "center");
//				for (int i=0; i<totals.length; ++i) {
//					totals[i]+=stats.get(TestStatus.values()[i]);
//				}
//			}
//		}
//		Row totalsRow = classTable.row().style(Style.INFO);
//		totalsRow.cell("Total").colspan(paramInfo.size()+1);
//		totalsRow.cell(totals[0]).attribute("align", "center");
//		totalsRow.cell(totals[1]).attribute("align", "center");
//		totalsRow.cell(totals[2]).attribute("align", "center");
//		totalsRow.cell(totals[3]).attribute("align", "center");
//		
//		if (tooltipInitializers.length()==0) {
//			return classTable;
//		}
//		
//		return classTable+" "+htmlFactory.tag("script", tooltipInitializers);
//	}
//
//	private String[] createParamInfo(String name, Title title, Description description) {
//		String[] pi = { null, null };
//		if (title==null) {
//			pi[0] = title(name);
//		} else {
//			pi[0] = title.value();
//		}
//		
//		if (description!=null) {
//			StringBuilder descriptionBuilder = new StringBuilder();
//			if (description.html()) {
//				for (String str: description.value()) {
//					descriptionBuilder.append(str);
//					descriptionBuilder.append(" ");
//				}
//			} else {
//				descriptionBuilder.append("<pre>");
//				int idx = 0;
//				for (String str: description.value()) {
//					if (idx++>0) {
//						descriptionBuilder.append(System.lineSeparator());
//					}
//					descriptionBuilder.append(StringEscapeUtils.escapeHtml4(str));
//				}
//				descriptionBuilder.append("</pre>");			
//			}
//			pi[1] = descriptionBuilder.toString();
//		}
//		return pi;
//	}
//		
//	private void generatePageResultDetails(
//			PageResult pageResult,
//			DefaultHTMLFactory htmlFactory, 
//			File contentDir, 
//			int slideWidth) throws Exception {
//		
//		try (FileWriter pageResultWriter = new FileWriter(new File(contentDir, "page_"+pageResult.getId()+".html"))) {
//			pageResultWriter.write("<H3>");
//			pageResultWriter.write(htmlFactory.glyphicon(Glyphicon.list_alt).toString());
//			pageResultWriter.write(" ");
//			pageResultWriter.write(classTitle(pageResult.getPageInterface()));
//			pageResultWriter.write("</H3>");
//			
//			Description description = pageResult.getPageInterface().getAnnotation(Description.class);
//			if (description!=null) {
//				if (description.html()) {
//					for (String str: description.value()) {
//						pageResultWriter.write(str);
//						pageResultWriter.write(" ");
//					}
//				} else {
//					pageResultWriter.write("<pre>");
//					int idx = 0;
//					for (String str: description.value()) {
//						if (idx++>0) {
//							pageResultWriter.write(System.lineSeparator());
//						}
//						pageResultWriter.write(StringEscapeUtils.escapeHtml4(str));
//					}
//					pageResultWriter.write("</pre>");			
//				}
//			}
//			
//			Map<String, Object[]> strCoverage = new TreeMap<>();			
//			for (Entry<Method, Integer> ce: pageResult.getCoverage().entrySet()) {
//				String descr = "";
//				Description mDescription = ce.getKey().getAnnotation(Description.class);
//				if (mDescription==null) {
//					descr = "&nbsp;";
//				} else {
//					if (mDescription.html()) {
//						for (String str: mDescription.value()) {
//							descr+=str;
//							descr+=" ";
//						}
//					} else {
//						descr+="<pre>";
//						int idx = 0;
//						for (String str: mDescription.value()) {
//							if (idx++>0) {
//								descr+=System.lineSeparator();
//							}
//							descr+=StringEscapeUtils.escapeHtml4(str);
//						}
//						descr+="</pre>";			
//					}
//				}
//
//				Title mTitle = ce.getKey().getAnnotation(Title.class);
//				if (mTitle==null) {
//					StringBuilder pListBuilder = new StringBuilder();
//					for (Class<?> pt: ce.getKey().getParameterTypes()) {
//						if (pListBuilder.length()>0) {
//							pListBuilder.append(", ");
//						}
//						pListBuilder.append(pt.getName().substring(pt.getName().lastIndexOf('.')+1));
//					}
//					strCoverage.put(ce.getKey().getName()+"("+pListBuilder+")", new Object[] {descr, ce.getValue()});
//				} else {
//					strCoverage.put(mTitle.value(), new Object[] {descr, ce.getValue()});					
//				}
//			}
//			
//			Table methodTable = htmlFactory.table().bordered();
//			Row headerRow = methodTable.row().style(Style.INFO);
//			headerRow.header(htmlFactory.glyphicon(Glyphicon.cog), " Method");
//			headerRow.header(htmlFactory.glyphicon(Glyphicon.file), " Description");
//			headerRow.header(htmlFactory.glyphicon(Glyphicon.file), " Calls");
//			for (Entry<String, Object[]> ce: strCoverage.entrySet()) {
//				Row methodRow = methodTable.row();
//				methodRow.cell(ce.getKey());
//				methodRow.cell(ce.getValue()[0]);				
//				methodRow.cell(ce.getValue()[1]).attribute("align", "right");
//			}
//			
//			pageResultWriter.write("<P>"+methodTable.toString());			
//		}
//	}
//
//
//	private void generateActorResultDetails(
//			ActorResult actorResult,
//			DefaultHTMLFactory htmlFactory, 
//			File contentDir, 
//			int slideWidth) throws Exception {
//		
//		try (FileWriter actorResultWriter = new FileWriter(new File(contentDir, "actor_"+actorResult.getId()+".html"))) {
//			actorResultWriter.write("<H3 title='"+actorResult.getActorClass().getName()+"'>");
//			actorResultWriter.write(htmlFactory.glyphicon(Glyphicon.user).toString());
//			actorResultWriter.write(" ");
//			actorResultWriter.write(classTitle(actorResult.getActorInterface()));
//			actorResultWriter.write("</H3>");
//			
//			Description description = actorResult.getActorInterface().getAnnotation(Description.class);
//			if (description!=null) {
//				if (description.html()) {
//					for (String str: description.value()) {
//						actorResultWriter.write(str);
//						actorResultWriter.write(" ");
//					}
//				} else {
//					actorResultWriter.write("<pre>");
//					int idx = 0;
//					for (String str: description.value()) {
//						if (idx++>0) {
//							actorResultWriter.write(System.lineSeparator());
//						}
//						actorResultWriter.write(StringEscapeUtils.escapeHtml4(str));
//					}
//					actorResultWriter.write("</pre>");			
//				}
//			}
//			
//			Map<String, Object[]> strCoverage = new TreeMap<>();			
//			for (Entry<Method, Integer> ce: actorResult.getCoverage().entrySet()) {
//				String descr = "";
//				Description mDescription = ce.getKey().getAnnotation(Description.class);
//				if (mDescription==null) {
//					descr = "&nbsp;";
//				} else {
//					if (mDescription.html()) {
//						for (String str: mDescription.value()) {
//							descr+=str;
//							descr+=" ";
//						}
//					} else {
//						descr+="<pre>";
//						int idx = 0;
//						for (String str: mDescription.value()) {
//							if (idx++>0) {
//								descr+=System.lineSeparator();
//							}
//							descr+=StringEscapeUtils.escapeHtml4(str);
//						}
//						descr+="</pre>";			
//					}
//				}
//
//				Title mTitle = ce.getKey().getAnnotation(Title.class);
//				if (mTitle==null) {
//					StringBuilder pListBuilder = new StringBuilder();
//					for (Class<?> pt: ce.getKey().getParameterTypes()) {
//						if (pListBuilder.length()>0) {
//							pListBuilder.append(", ");
//						}
//						pListBuilder.append(pt.getName().substring(pt.getName().lastIndexOf('.')+1));
//					}
//					strCoverage.put(ce.getKey().getName()+"("+pListBuilder+")", new Object[] {descr, ce.getValue()});
//				} else {
//					strCoverage.put(mTitle.value(), new Object[] {descr, ce.getValue()});					
//				}
//			}
//			
//			Table methodTable = htmlFactory.table().bordered();
//			Row headerRow = methodTable.row().style(Style.INFO);
//			headerRow.header(htmlFactory.glyphicon(Glyphicon.cog), " Method");
//			headerRow.header(htmlFactory.glyphicon(Glyphicon.file), " Description");
//			headerRow.header(htmlFactory.glyphicon(Glyphicon.file), " Calls");
//			for (Entry<String, Object[]> ce: strCoverage.entrySet()) {
//				Row methodRow = methodTable.row();
//				methodRow.cell(ce.getKey());
//				methodRow.cell(ce.getValue()[0]);				
//				methodRow.cell(ce.getValue()[1]).attribute("align", "right");
//			}
//			
//			actorResultWriter.write("<P>"+methodTable.toString());			
//		}
//	}
//
//	private Object generatePagesLeftPanel(DefaultHTMLFactory htmlFactory, File contentDir) {
//		Tag container = htmlFactory.tag("dl");		
//		for (PageResult pr: pageResults) {
//			Tag pageNameDD = htmlFactory.tag("dd", htmlFactory.routeLink("main", "content/page_"+pr.getId()+".html", classTitle(pr.getPageInterface()))).style("font-weight", "bold");
//			container.content(pageNameDD);
//		}
//		return container;
//	}
//	
//	private Object generateActorsLeftPanel(DefaultHTMLFactory htmlFactory, File contentDir) {
//		Tag container = htmlFactory.tag("dl");		
//		for (ActorResult ar: actorResults) {
//			Tag actorNameDD = htmlFactory.tag("dd", htmlFactory.routeLink("main", "content/actor_"+ar.getId()+".html", classTitle(ar.getActorInterface()))).style("font-weight", "bold");
//			container.content(actorNameDD);
//		}
//		return container;
//	}
//	
//	private Table genPageTable(HTMLFactory htmlFactory) {
//	}
//
//
//	
//}