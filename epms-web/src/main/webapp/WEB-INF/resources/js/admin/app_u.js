Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'user',
	appFolder : server_context + '/resources/js/admin/app_u',
	controllers : [ 'UserController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'userGrid'
			} ]
		});
	}
});
