Ext.define('user.controller.UserController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.userController',
	stores : [ 'UserStore' ],
	models : [ 'UserModel' ],
	views : [ 'UserGrid', 'UserEdit' ],
	init : function() {
		this.control({
			'userGrid' : {
				itemdblclick : this.editUser
			},
			'userEdit button[action=save]' : {
				click : this.updateUser
			}
		});
	},
	editUser : function(grid, record) {
		var view = Ext.widget('userEdit');
		view.down('form').loadRecord(record);
	},
	updateUser : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
