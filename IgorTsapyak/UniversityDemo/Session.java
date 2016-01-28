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
		TEST, EXAM
	}

	private String title;

	public Map<String, ControlType> subjects;

	public Map<String, ControlType> getSubjects() {
		return subjects;
	}

	public void setSubjects(Map<String, ControlType> subjects) {
		this.subjects = subjects;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ControlType getType(String subject){
		return subjects.get(subject);
	}

	public Set<String> getAllSubjectsByType(ControlType type){
		Set<String> set = new HashSet<>();
		for(String value : subjects.keySet()){
			if (subjects.get(value).equals(type)){
				set.add(value);
			}
		}
		return set;
	}
//
//	//TODO
//	/**
//	 * method return 'normal' String representation of
//	 * end-user  Subject title
//	 * or null otherwise
//	 * @param String representation of Subject title
//	 * @return 'canonical' title of Subject
//	 */
	public String getSubject(String subject){
		for (String testValue:subjects.keySet()){
			if (testValue.equalsIgnoreCase(subject)){
				return testValue;
			}
		}
		return null;
	}
	public Set<String> getAllSubjects(){
		return subjects.keySet();
	}

	@Override
	public String toString() {
		return title +"\n"+subjects.toString();

	}

	private Map<String, ControlType> sortedSubjects() {
		List<Map.Entry<String, ControlType>> list = new LinkedList<Map.Entry<String, ControlType>>(
				subjects.entrySet());
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