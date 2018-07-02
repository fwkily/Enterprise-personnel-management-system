Ext.define('group.model.StudentModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.groupModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'name',
		type : 'string',
		sortable : true
	} ]
});