var pageSize = 20;

Ext.define('pay.store.StudentStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.studentStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'pay.model.StudentModel',
	proxy : {
		url : server_context + '/pay/pay/.json',
		type : 'ajax',
		api : {
			read : server_context + '/pay/pay/.json',
			update : server_context + '/pay/pay/.json'
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