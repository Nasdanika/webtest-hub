/** 
 * jQuery AMD module for RequireJS. It returns global jQuery to avoid double-loading and mess
 * associated with it. Use it in applications which declare global jQuery.
 */
define([], function() {
	return jQuery;
});
