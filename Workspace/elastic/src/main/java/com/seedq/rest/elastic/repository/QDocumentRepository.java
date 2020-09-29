package com.seedq.rest.elastic.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.seedq.rest.elastic.model.QDocumentEEntity;

public interface QDocumentRepository extends ElasticsearchRepository<QDocumentEEntity, String>{

}
