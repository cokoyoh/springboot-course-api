package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	 
	private List<Topic> topics = new ArrayList <>(Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("java", "Core Java", "Core Java Description"),
			new Topic("javaScript", "JavaScript", "JavaScript Description")
		));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics
				.stream()
				.filter(topic -> topic.getId().equals(id))
				.findFirst()
				.get();
	}

	public void addTopic(Topic topic) {
		 topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		for(int index = 0; index < topics.size(); index++) {
			Topic tpc = topics.get(index);
			
			if(tpc.getId().equals(id)) {
				topics.set(index, topic);
				
				return;
			}
		}
	}

	public void deleteTopic(String id) {
		topics.removeIf(topic -> topic.getId().equals(id));
	}
}
