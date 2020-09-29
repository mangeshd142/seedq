package com.seedq.rest.elastic.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seedq.rest.elastic.model.QDocumentEEntity;
import com.seedq.rest.elastic.repository.QDocumentRepository;
import com.seedq.restinterface.elastic.IFetchQDocumentAction;
import com.seedq.restinterface.elastic.bean.IQDocumentEEntity;

@Service
public class FetchQDocumentAction implements IFetchQDocumentAction {

	@Autowired
	QDocumentRepository documentRepository;
	
	public List<IQDocumentEEntity> exectute() {
		Iterable<QDocumentEEntity> iterable = documentRepository.findAll();
		List<IQDocumentEEntity> documentEEntities = new ArrayList<>();
		
		for (QDocumentEEntity qDocumentEEntity : iterable) {
			documentEEntities.add(qDocumentEEntity);
		}
		
		return documentEEntities;
	}
}
