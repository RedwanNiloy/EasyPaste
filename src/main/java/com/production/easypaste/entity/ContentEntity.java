package com.production.easypaste.entity;

import java.time.Instant;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Document(collection="content_entries")
public class ContentEntity{


@Id
private String id;
@NonNull
private String content;

@CreatedDate
private Instant time;





}



