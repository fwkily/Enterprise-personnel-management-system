Ext.define('customer.view.StudentEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.studentEdit',
	title : '用户信息',
	layout : 'fit',
	autoShow : true,
	initComponent : function() {
		this.items = [ {
			xtype : 'form',
			height : 300,
			width : 300,
			border : false,
			items : [ {
				xtype : 'address',
				name : 'name',
				fieldLabel : '地址'
			}, {
				xtype : 'postcode',
				name : 'work',
				fieldLabel : '邮编'
			}]
		} ];
		this.buttons = [ {
			text : '保存',
			action : 'save'
		}, {
			text : '取消',
			scope : this,
			handler : this.close
		} ];
		this.callParent(arguments);
	}
});
