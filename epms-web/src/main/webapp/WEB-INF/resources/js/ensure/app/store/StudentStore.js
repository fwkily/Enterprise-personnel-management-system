var pageSize = 20;

Ext.define('ensure.store.StudentStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.studentStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'ensure.model.StudentModel',
	proxy : {
		url : server_context + '/ensure/ensure/.json',
		type : 'ajax',
		api : {
			read : server_context + '/ensure/ensure/.json',
			update : server_context + '/ensure/ensure/.json'
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