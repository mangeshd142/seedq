package com.seedq.rest.elastic.action;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seedq.rest.elastic.model.QDocumentEEntity;
import com.seedq.rest.elastic.repository.QDocumentRepository;
import com.seedq.restinterface.elastic.ISaveQDocumentAction;
import com.seedq.restinterface.elastic.bean.IQDocumentEEntity;

@Service
public class SaveQDocumentAction implements ISaveQDocumentAction{
	
	@Autowired
	QDocumentRepository documentRepository;
	
	public IQDocumentEEntity execute(Map<String, Object> qDocumentMap) {
		
		QDocumentEEntity document = new QDocumentEEntity();
		
		document.setComment((String)qDocumentMap.get("comment"));
		document.setDescription((String)qDocumentMap.get("description"));
		document.setTitle((String)qDocumentMap.get("title"));
		document.setUserId((String)qDocumentMap.get("userId"));
		
		
		return documentRepository.save(document);
	}

}
