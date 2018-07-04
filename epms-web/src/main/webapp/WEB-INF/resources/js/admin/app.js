Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'user',
	appFolder : server_context + '/resources/js/admin/app',
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
