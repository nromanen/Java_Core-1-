package university;

import java.util.Map;

public class Session {
	
	public static enum Type {EXAM, ZACHET};
	
	private String title;
	private Map<String, String> subjects; // title and type of exams; 

	public Map<String, Type> subj2; 
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Map<String, String> getSubjects() {
		return subjects;
	}

	public void setSubjects(Map<String, String> subjects) {
		this.subjects = subjects;
	}

}
