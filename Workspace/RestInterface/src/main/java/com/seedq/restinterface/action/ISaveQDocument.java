package com.seedq.restinterface.action;

import java.util.List;
import java.util.Map;

import com.seedq.restinterface.bean.CommonInterface;

public interface ISaveQDocument extends CommonInterface{
	public List<CommonInterface> execute(Map<String, Object> qDocumentMap);
}
