package io.javabrains.springbootstater.courseapi.course;

import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootstater.courseapi.topics.Topic;

import java.util.List;
// import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;


    @GetMapping("/topic/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id) {
        return courseService.getAllCourses(id);
    }
 
    @GetMapping("/topic/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable String id) {
        return courseService.getCourse(id);    
    }

    @PostMapping("topic/topicId/courses")
    public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
        course.setTopic(new Topic(topicId, "", ""));
        courseService.addCourse(course);
        // System.out.println(course);
    }

    @PutMapping("topic/topicId/courses/{id}")
    public void updateCourse (@RequestBody Course course, @PathVariable String id, @PathVariable String topicId) {
        course.setTopic(new Topic(topicId, "", ""));
        courseService.updateCourse(course);       
    }

    @DeleteMapping("topic/topicId/courses/{id}")
    public void deleteCourse(@PathVariable String id) {
        courseService.deleteCourse(id);
    }
}
    
