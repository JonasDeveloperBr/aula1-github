package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private Date moment;
	private String title;
	private String content;
	private Integer likes = 0;
	
	private List<Comment> comment = new ArrayList<>();
		
	public Post(Date moment, String title, String content){
		this.moment = moment;
		this.title = title;
		this.content = content;
	}
	
	public Date getMoment() {
		return moment;
	}
	
	public String getTitle() {
		return title;
	}
	
	public Integer getLikes() {
		return likes;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setLikes(Integer likes) {
		this.likes += likes;
	}
	
	public void addComment(Comment comment) {
		this.comment.add(comment);
	}
	
	public List<Comment> getComment(){
		return comment;
	}
	
	
}
