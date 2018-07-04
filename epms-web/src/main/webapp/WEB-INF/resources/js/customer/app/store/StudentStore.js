var pageSize = 20;

Ext.define('customer.store.StudentStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.studentStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'customer.model.StudentModel',
	proxy : {
		url : server_context + '/customer/customer/.json',
		type : 'ajax',
		api : {
			read : server_context + '/customer/customer/.json',
			update : server_context + '/customer/customer/.json'
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