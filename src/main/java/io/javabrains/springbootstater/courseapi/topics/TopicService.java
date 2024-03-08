package io.javabrains.springbootstater.courseapi.topics;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service

public class TopicService {

    private List<Topic> topics = new ArrayList<>(List.of(
            new Topic("spring", "Spring Framework", "SFD"),
            new Topic("java", "Core Java", "CJD")
            ));
    
    public List<Topic> getAllTopics() {
        return topics;
    }    
    
    public Topic getTopic(String id) {
        // return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if (t.getId().equals(id)) {
                return t;       
            }
        } 
        return null;   
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(Topic topic, String id) {
        for (int i = 0; i < topics.size(); i++) {
            // Topic t = topics.get(i);
            if (topics.get(i).getId().equals(id)) {
                topics.set(i,topic);


                return;
            }
        }
    }

    public void deleteTopic(String id) {
        for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if(t.getId().equals(id)) {
                topics.remove(i);
            }
        } 
    }
}

