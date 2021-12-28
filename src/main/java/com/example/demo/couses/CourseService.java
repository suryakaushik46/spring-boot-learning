package com.example.demo.couses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
   @Autowired
   private CourseRepository courseRepository;
//   List<Topic> topics=new ArrayList<>( Arrays.asList(new Topic("spring","spring framework ","spring description"),
//           new Topic("java","core java","core java description"),
//           new Topic("spring","spring  boot framework ","spring boot description")));

   public List<Course> getAllCourses(String topicId){

      // return topics;
      List<Course> courses=new ArrayList<>();
      courseRepository.findByTopicId(topicId).forEach(courses::add);//lambda expression
      return courses;
   }
   public Course getCourse(String id){

      //return topics.stream().filter(t->t.getId().equals(id)).findAny().get();
      return courseRepository.findById(id).orElse(null);
   }
   public void addCourse(Course course ){
      //topics.add(topic);
      courseRepository.save(course);
   }
   public void updateCourse(Course course, String id){
//       for(int i=0;i<topics.size();i++){
//          if(topics.get(i).getId().equals(id)){
//             topics.set(i,topic);
//
//             return;
//          }
//       }

      courseRepository.save(course);  //save can both add and update

   }
   public void deleteCourse(String id){
      //topics.removeIf(t->t.getId().equals(id));
      courseRepository.deleteById(id);
   }
}
