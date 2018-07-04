Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'customer',
	appFolder : server_context + '/resources/js/customer/app',
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
