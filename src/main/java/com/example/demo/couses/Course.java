package com.example.demo.couses;

import com.example.demo.topic.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {
    @Id
    private String id;//col 1 (@Id represent it as primary key)
    private String name;//col 2
    private String description;//col 2

    @ManyToOne
    private Topic topic;//foreigen key(many to one relation)

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Course() {
    }

    public Course(String id, String name, String description,String topicID) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic=new Topic(topicID,"","");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}

