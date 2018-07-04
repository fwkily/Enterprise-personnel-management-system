Ext.define('pay.model.StudentModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.studentModel',
	fields : [ {
		name : 'name',
		type : 'string',
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