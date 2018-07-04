Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'ensure',
	appFolder : server_context + '/resources/js/ensure/app',
	controllers : [ 'StudentController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'studentGrid'
			} ]
		});
	}
});
