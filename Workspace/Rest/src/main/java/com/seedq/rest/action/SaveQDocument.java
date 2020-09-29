package com.seedq.rest.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seedq.rest.beans.QDocument;
import com.seedq.restinterface.action.ISaveQDocument;
import com.seedq.restinterface.bean.CommonInterface;
import com.seedq.restinterface.bean.IQDocument;
import com.seedq.restinterface.elastic.ISaveQDocumentAction;
import com.seedq.restinterface.elastic.bean.IQDocumentEEntity;

@Service
public class SaveQDocument implements ISaveQDocument {
	
	@Autowired
	ISaveQDocumentAction saveQDocumentAction;
	
	public List<CommonInterface> execute(Map<String, Object> qDocumentMap){
		List<CommonInterface> commonInterfaces = new ArrayList<>();
		
		IQDocumentEEntity documentEEntity = saveQDocumentAction.execute(qDocumentMap);
		
		IQDocument document = new QDocument();
		document.setComment(documentEEntity.getComment());
		document.setDescription(documentEEntity.getDescription());
		document.setTitle(documentEEntity.getTitle());
		document.setUserId(documentEEntity.getUserId());
		commonInterfaces.add(document);
		return commonInterfaces;
	}
}
