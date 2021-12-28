package com.example.demo.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService{
   @Autowired
   private TopicRepository topicRepository;
//   List<Topic> topics=new ArrayList<>( Arrays.asList(new Topic("spring","spring framework ","spring description"),
//           new Topic("java","core java","core java description"),
//           new Topic("spring","spring  boot framework ","spring boot description")));

   public List<Topic> getAllTopics(){

      // return topics;
      List<Topic> topics=new ArrayList<>();
      topicRepository.findAll().forEach(topics::add);//lambda expression
      return topics;
   }
   public Topic getTopic(String id){

      //return topics.stream().filter(t->t.getId().equals(id)).findAny().get();
      return topicRepository.findById(id).orElse(null);
   }
   public void addTopic(Topic topic ){
      //topics.add(topic);
      topicRepository.save(topic);
   }
   public void updateTopic(Topic topic,String id){
//       for(int i=0;i<topics.size();i++){
//          if(topics.get(i).getId().equals(id)){
//             topics.set(i,topic);
//
//             return;
//          }
//       }

      topicRepository.save(topic);  //save can both add and update

   }
   public void deleteTopic(String id){
      //topics.removeIf(t->t.getId().equals(id));
      topicRepository.deleteById(id);
   }
}
