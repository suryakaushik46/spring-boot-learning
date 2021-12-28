package com.example.demo.couses;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course,String> {

    //getAllTopics()
    //getTopic(String id)     //stsndard methods
    //updateTopic(Topic t)
    //deleteTopic(String id)

    public List<Course> findByTopicId(String topicID);//automatically implemeted buy jpa
}
