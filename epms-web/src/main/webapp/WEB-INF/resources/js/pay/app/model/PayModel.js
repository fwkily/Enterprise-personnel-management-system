Ext.define('pay.model.PayModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.payModel',
	fields : [ {
		name : 'name',
		type : 'int',
		sortable : true
	}, {
		name : 'work',
		type : 'string',
		sortable : true
	}, {
		name : 'time',
		type : 'string',
		sortable : true
	}, {
		name : 'money',
		type : 'string',
		sortable : true
	} ]
});