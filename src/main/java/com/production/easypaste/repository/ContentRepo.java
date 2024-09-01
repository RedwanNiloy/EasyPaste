package com.production.easypaste.repository;

import java.time.Instant;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.production.easypaste.entity.ContentEntity;


@Repository
public interface ContentRepo extends MongoRepository<ContentEntity,String>{

public Optional<ContentEntity> findByContentAndTime(String c, Instant t);

public Optional<ContentEntity> findById(ObjectId o);






}