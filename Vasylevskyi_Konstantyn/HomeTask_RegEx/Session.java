package university;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Set;

public class Session {
	
	public static enum ControlType {
		TEST, EXAM // ordinal, compareTo, toString
	};

	private String title;
	
	private Map<String, String> subjects; // title and type of exams;

	
	public Map<String, ControlType> subjs; // TODO refactoring (reason)

	public Map<String, String> getSubjects() {
		return subjects;
	}

	public void setSubjects(Map<String, String> subjects) {
		this.subjects = subjects;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Map<String, ControlType> getSubjs() {
		return subjs;
	}

	public void setSubjs(Map<String, ControlType> subjs) {
		this.subjs = subjs;
	}
	
	public ControlType getType(String subject){
		return subjs.get(subject);
	}
	
	public Set<String> getAllSubjectsByType(ControlType type){
		Set<String> set= new HashSet<>();
		for(String value : subjs.keySet()){
			if (subjs.get(value).equals(type)){
				set.add(value);
			}
		}
		return set;
	}
	
	//TODO
	/**
	 * method return 'normal' String representation of 
	 * end-user  Subject title
	 * or null otherwise
	 * @param String representation of Subject title
	 * @return 'canonical' title of Subject
	 */
	public String getSubject(String subject){
		for (String testValue:subjs.keySet()){
			if (testValue.equalsIgnoreCase(subject)){
				return testValue;
			}
		}
		return null;
	}
	
	public Set<String> getAllSubjects(){
		return subjs.keySet();
	}

	@Override
	public String toString() {
/*		ArrayList<ControlType> subjects = new ArrayList<>();
		for (ControlType type : subjs.values()) {
			subjects.add(type);
		}
		// subjects = (ArrayList<ControlType>) subjs.values();
		Collections.sort(subjects);
		System.out.println(subjects);*/
		return sortedSubjects().toString();
	}

	private Map<String, ControlType> sortedSubjects() {
		List<Map.Entry<String, ControlType>> list = new LinkedList<Map.Entry<String, ControlType>>(
				subjs.entrySet());
		Collections.sort(list,
				new Comparator<Map.Entry<String, ControlType>>() {
					public int compare(Map.Entry<String, ControlType> o1,
							Map.Entry<String, ControlType> o2) {
						return o1.getValue().compareTo(o2.getValue());
					}
				});
		Map<String, ControlType> sortedMap = new LinkedHashMap<>();
		for (Iterator<Map.Entry<String, ControlType>> it = list.iterator(); it
				.hasNext();) {
			Map.Entry<String, ControlType> entry = it.next();
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}

}
