package com.seedq.restinterface.action;

import java.util.List;
import java.util.Map;

import com.seedq.restinterface.bean.CommonInterface;

public interface ISaveUser {
	public List<CommonInterface> execute(Map<String, Object> userMap);
}
