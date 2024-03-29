package io.javabrains.springbootstater.courseapi.topics;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;
    
    public List<Topic> getAllTopics() {
        //return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
        .forEach(topics::add);
        return topics;
    }    
    
    public Topic getTopic(String id) {
        return topicRepository.findById(id).orElse(null);
    }

    public void addTopic(Topic topic) {
       topicRepository.save(topic);
    }

    public void updateTopic(Topic topic, String id) {
        // for (int i = 0; i < topics.size(); i++) {
        //     // Topic t = topics.get(i);
        //     if (topics.get(i).getId().equals(id)) {
        //         topics.set(i,topic);
        //         return;
        //     }
        // }   
        topicRepository.save(topic);              
    }

    public void deleteTopic(String id) {
        // for (int i = 0; i < topics.size(); i++) {
        //     Topic t = topics.get(i);
        //     if(t.getId().equals(id)) {
        //         topics.remove(i);
        //     }
        // } 
        topicRepository.deleteById(id);
    }
}

