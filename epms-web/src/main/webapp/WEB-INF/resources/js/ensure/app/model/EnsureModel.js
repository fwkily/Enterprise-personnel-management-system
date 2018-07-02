Ext.define('ensure.model.EnsureModel', {
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