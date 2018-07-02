Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'ensure',
	appFolder : server_context + '/resources/js/ensure/app',
	controllers : [ 'EnsureController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'ensureGrid'
			} ]
		});
	}
});
