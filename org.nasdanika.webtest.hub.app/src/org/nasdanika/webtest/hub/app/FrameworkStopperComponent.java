package org.nasdanika.webtest.hub.app;

import java.util.Timer;
import java.util.TimerTask;

import org.osgi.framework.BundleContext;

/**
 * This component listens for org.nasdanika.webtest.hub.app.shutdown system property to be set to true and then shuts down the framework.
 * @author Pavel
 *
 */
public class FrameworkStopperComponent {
	
	private Timer timer;
	
	public void activate(final BundleContext context) {
		timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				if ("true".equals(System.getProperty("org.nasdanika.webtest.hub.app.shutdown", "false"))) {
					System.out.println("Stopping the framework");
					try {
						context.getBundle(0).stop();
					} catch (Exception e) {
						System.err.println("Error stopping the framework");
						e.printStackTrace();
					}					
					cancel();
					FrameworkStopperComponent.this.timer.cancel();
				}
				
			}
		}, 1000, 100); // TODO - from configuration?
	}

	public void deactivate(BundleContext context) {
		timer.cancel();
	}

}
