Ext.define('ensure.controller.EnsureController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.ensureController',
	stores : [ 'EnsureStore' ],
	models : [ 'EnsureModel' ],
	views : [ 'EnsureGrid', 'EnsureEdit' ],
	init : function() {
		this.control({
			'ensureGrid' : {
				itemdblclick : this.editEnsure
			},
			'ensureEdit button[action=save]' : {
				click : this.updateEnsure
			}
		});
	},
	editEnsure : function(grid, record) {
		var view = Ext.widget('ensureEdit');
		view.down('form').loadRecord(record);
	},
	updateEnsure : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
