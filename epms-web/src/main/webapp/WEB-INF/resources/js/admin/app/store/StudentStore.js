var pageSize = 20;

Ext.define('user.store.StudentStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.studentStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'user.model.StudentModel',
	proxy : {
		url : server_context + '/user/user/.json',
		type : 'ajax',
		api : {
			read : server_context + '/user/user/.json',
			update : server_context + '/user/user/.json'
		},
		reader : {
			type : 'json',
			root : 'content',
			totalProperty : 'totalElements'
		},
		writer : {
			type : 'json'
		}
	},
	// 每页显示的记录行数
	pageSize : pageSize
});