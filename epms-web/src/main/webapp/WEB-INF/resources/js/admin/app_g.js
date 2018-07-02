Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'group',
	appFolder : server_context + '/resources/js/admin/app_g',
	controllers : [ 'GroupController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'groupGrid'
			} ]
		});
	}
});
