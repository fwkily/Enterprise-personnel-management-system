var pageSize = 20;

Ext.define('ensure.store.EnsureStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.ensureStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'ensure.model.EnsureModel',
	proxy : {
		url : server_context + '/teach/ensure/.json',
		type : 'ajax',
		api : {
			read : server_context + '/teach/ensure/.json',
			update : server_context + '/teach/ensure/.json'
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