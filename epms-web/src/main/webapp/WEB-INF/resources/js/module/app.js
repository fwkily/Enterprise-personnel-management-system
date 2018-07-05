Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'module',
	appFolder : server_context + '/resources/js/module/app',
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
