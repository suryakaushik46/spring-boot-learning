package com.example.demo.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,String> {

    //getAllTopics()
    //getTopic(String id)     //stsndard methods
    //updateTopic(Topic t)
    //deleteTopic(String id)

}
