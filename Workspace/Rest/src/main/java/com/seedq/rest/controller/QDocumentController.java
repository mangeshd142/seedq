package com.seedq.rest.controller;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seedq.restinterface.action.IFetchQDocument;
import com.seedq.restinterface.action.ISaveQDocument;
import com.seedq.restinterface.bean.CommonInterface;
import com.seedq.restinterface.bean.ErrorBeanInterface;
import com.seedq.restinterface.bean.PrepareResponseInterface;
import com.seedq.restinterface.bean.ResponseBeanInterface;

@RestController
public class QDocumentController {

	@Autowired
	PrepareResponseInterface prepareResponseInterface;
	
	@Autowired
	IFetchQDocument fetchQDocument;
	
	@Autowired
	ISaveQDocument saveQDocument;
	
	
	@CrossOrigin(origins = "*")
	@RequestMapping("/fetchDoc")
	public ResponseBeanInterface<CommonInterface, ErrorBeanInterface> getUsers(HttpServletResponse servletResponse) throws Exception {
		return prepareResponseInterface.excute(servletResponse, fetchQDocument.execute());
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping("/savehDoc")
	public ResponseBeanInterface<CommonInterface, ErrorBeanInterface> addUser(HttpServletResponse servletResponse, 
			@RequestBody Map<String, Object> qDocument) throws Exception {
		
		return prepareResponseInterface.excute(servletResponse, saveQDocument.execute(qDocument));
	}
	
}
