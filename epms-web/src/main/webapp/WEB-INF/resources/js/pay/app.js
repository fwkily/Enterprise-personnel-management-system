Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'pay',
	appFolder : server_context + '/resources/js/pay/app',
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
