package com.seedq.rest.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seedq.rest.beans.QDocument;
import com.seedq.restinterface.action.IFetchQDocument;
import com.seedq.restinterface.bean.CommonInterface;
import com.seedq.restinterface.bean.IQDocument;
import com.seedq.restinterface.elastic.IFetchQDocumentAction;
import com.seedq.restinterface.elastic.bean.IQDocumentEEntity;

@Service
public class FetchQDocument implements IFetchQDocument{
	
	@Autowired
	IFetchQDocumentAction fetchQDocumentAction;
	
	public List<CommonInterface> execute(){
		
		List<CommonInterface> commonInterfaces = new ArrayList<CommonInterface>();
		
		List<IQDocumentEEntity> documentEEntities = fetchQDocumentAction.exectute();
		for (IQDocumentEEntity qDocumentEEntity : documentEEntities) {
			IQDocument document = new QDocument();
			document.setComment(qDocumentEEntity.getComment());
			document.setDescription(qDocumentEEntity.getDescription());
			document.setTitle(qDocumentEEntity.getTitle());
			document.setUserId(qDocumentEEntity.getUserId());
			
			commonInterfaces.add(document);
		}
		
		
		return commonInterfaces;
	}

}
