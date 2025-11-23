package Structures;

public class FeedbackStructure {
	
	private int id;
	private String email;
	private String name;
	private String feedbackmsg;
	private String phone;
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFeedbackmsg() {
		return feedbackmsg;
	}
	public void setFeedbackmsg(String feedbackmsg) {
		this.feedbackmsg = feedbackmsg;
	}
	@Override
	public String toString() {
		return "FeedbackStructure [id=" + id + ", email=" + email + ", name=" + name + ", feedbackmsg=" + feedbackmsg
				+ ", phone=" + phone + ", getPhone()=" + getPhone() + ", getId()=" + getId() + ", getEmail()="
				+ getEmail() + ", getName()=" + getName() + ", getFeedbackmsg()=" + getFeedbackmsg() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	

}
