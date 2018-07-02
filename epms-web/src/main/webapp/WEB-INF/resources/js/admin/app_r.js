Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'role',
	appFolder : server_context + '/resources/js/admin/app_r',
	controllers : [ 'RoleController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'roleGrid'
			} ]
		});
	}
});
