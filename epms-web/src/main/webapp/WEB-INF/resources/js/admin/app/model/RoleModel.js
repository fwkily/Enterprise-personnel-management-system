Ext.define('role.model.RoleModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.roleModel',
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