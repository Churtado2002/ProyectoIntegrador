package com.spring.music.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.music.model.Song;


// use your model and the type of your id property inside the <>
public interface MongoDbRepository extends MongoRepository<Song, String> {
}
