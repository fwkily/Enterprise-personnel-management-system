Ext.define('ensure.view.StudentEdit', {
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
				name : 'name',
				fieldLabel : '维护名称'
			}, {
				xtype : 'textfield',
				name : 'date',
				fieldLabel : '维护日期'
			}, {
				xtype : 'textfield',
				name : 'info',
				fieldLabel : '维护描述'
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
