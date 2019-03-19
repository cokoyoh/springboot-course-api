package io.javabrains.springbootstarter.topic;

public class Topic {
	private String id;
	private String name;
	private String deacription;
	
	public Topic() {
	
	}
	
	public Topic(String id, String name, String deacription) {
		super();
		this.id = id;
		this.name = name;
		this.deacription = deacription;
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
	
	public String getDeacription() {
		return deacription;
	}
	
	public void setDeacription(String deacription) {
		this.deacription = deacription;
	}
	
	
}
