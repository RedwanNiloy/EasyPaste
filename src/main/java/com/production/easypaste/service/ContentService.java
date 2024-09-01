package com.production.easypaste.service;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.production.easypaste.entity.ContentEntity;
import com.production.easypaste.repository.ContentRepo;




@Component
public class ContentService{

  @Autowired
  private ContentRepo repo;
    public String saveContent(ContentEntity entry)
    {

      //System.out.println("Hello");
       ContentEntity saved=repo.save(entry);

       
     Optional<ContentEntity> q= repo.findByContentAndTime(saved.getContent(),saved.getTime());

      String s= q.get().getId();
     // System.out.println(s);

       return "localhost:8080/easypaste/id/"+s;
       
    }



    


    public  String getPaste(String s){
       ObjectId _id = new ObjectId(s);
       return repo.findById(_id).get().getContent();

    }
   




}