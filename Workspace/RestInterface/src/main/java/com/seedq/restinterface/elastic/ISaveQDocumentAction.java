package com.seedq.restinterface.elastic;

import java.util.Map;

import com.seedq.restinterface.elastic.bean.IQDocumentEEntity;

public interface ISaveQDocumentAction {
	public IQDocumentEEntity execute(Map<String, Object> qDocumentMap);
}
