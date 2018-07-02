Ext.define('ensure.model.StudentModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.ensureModel',
	fields : [ {
		name : 'name',
		type : 'string',
		sortable : true
	}, {
		name : 'date',
		type : 'string',
		sortable : true
	}, {
		name : 'info',
		type : 'string',
		sortable : true
	} ]
});