Ext.define('role.controller.RoleController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.roleController',
	stores : [ 'RoleStore' ],
	models : [ 'RoleModel' ],
	views : [ 'RoleGrid', 'RoleEdit' ],
	init : function() {
		this.control({
			'roleGrid' : {
				itemdblclick : this.editRole
			},
			'roleEdit button[action=save]' : {
				click : this.updateRole
			}
		});
	},
	editRole : function(grid, record) {
		var view = Ext.widget('roleEdit');
		view.down('form').loadRecord(record);
	},
	updateRole : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
