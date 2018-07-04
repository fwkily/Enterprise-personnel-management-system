Ext.define('customer.model.StudentModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.studentModel',
	fields : [ {
		name : 'address',
		type : 'string',
		sortable : true
	}, {
		name : 'postcode',
		type : 'string',
		sortable : true
	},{
		name : 'dateCreated',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	}, {
		name : 'dateModified',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	} ]
});