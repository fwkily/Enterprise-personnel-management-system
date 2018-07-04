Ext.define('pay.view.StudentEdit', {
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
				xtype : 'textfield',
				name : 'username',
				fieldLabel : '用户姓名'
			}, {
				xtype : 'textfield',
				name : 'password',
				fieldLabel : '用户密码'
			}, {
				xtype : 'textfield',
				name : 'email',
				fieldLabel : '邮箱'
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
