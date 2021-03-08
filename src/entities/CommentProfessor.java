package entities;

public class CommentProfessor {

	private String text;
	
	CommentProfessor(){
	}
	
	public CommentProfessor(String text) {
		this.text = text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
	
}
