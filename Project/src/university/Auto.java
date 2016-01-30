package university;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Auto {

	private String model;
	private int year;
	private double price;
	private String colour;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Auto)) {
			return false;
		}
		Auto auto2 = (Auto) obj;
		return (this.colour.equals(auto2.colour) && this.model
				.equals(auto2.model));
	}

	@Override
	public String toString() {
		return "[" + model + "," + year + " year (" + price + "), colour="
				+ colour + "]";
	}

	public static void main(String... strings) {

		List<Auto> list = new ArrayList<>();

		Auto a1 = new Auto();
		a1.setColour("fdd");
		a1.setModel("Model1");
		a1.setPrice(34567);
		a1.setYear(2016);

		Auto a2 = new Auto();
		a2.setColour("fdd");
		a2.setModel("Model2");
		a2.setPrice(100);
		a2.setYear(2012);

		list.add(a1);
		list.add(a2);

		// System.out.println(a1 + " =???" + a2 + a1.equals(a2));

		System.out.println(list);
		// sort by year
		/*
		 * compare auto by year
		 */
		/*
		 * Collections.sort(list, new Comparator<Auto>(){
		 * 
		 * @Override public int compare(Auto arg0, Auto arg1) { return
		 * arg0.getYear() - arg1.getYear(); }
		 * 
		 * });
		 */
		Collections.sort(list, new CompareAuto("YEAR BY ASC"));
		Collections.sort(list, new CompareAuto("PRICE BY ASC"));
		
		//System.out.println(list);
		
		String template = "hdkjf.;kiuh   djfk";
		String[] words = template.split("[\\s\\.;,]");
		List<String> listWords = 
				new ArrayList<>(Arrays.asList(words));
		Iterator<String> iter = listWords.iterator();
		while (iter.hasNext()){
			if (iter.next().isEmpty()){
				iter.remove();
			}
		}
		System.out.println(listWords);

		String template2 = "hd4k  kiu89h   djfk";
		String[] words2 = template2.split("[\\s\\.;,]");
		List<String> listWords2 = 
				new ArrayList<>(Arrays.asList(words2));
		iter = listWords2.iterator();
		while (iter.hasNext()){
			if (iter.next().isEmpty()){
				iter.remove();
			}
		}
		System.out.println(listWords2);

		boolean flag = true;
		for(int i = 0; i < listWords.size(); i++){
			if (!(listWords.get(i).substring(0, 3).
					equals(listWords2.get(i).substring(0, 2)))){
				flag=false;
				break;
			}
				
		}
		
		if (flag) 
			System.out.println("OK");

		
	}
}

class CompareAutoByYear implements Comparator<Auto> {

	@Override
	public int compare(Auto arg0, Auto arg1) {
		return arg0.getYear() - arg1.getYear();
	}
}

class CompareAuto implements Comparator<Auto> {

	public String criteria;

	public CompareAuto() {
	}

	public CompareAuto(String crit) {
		criteria = crit;
	}

	@Override
	public int compare(Auto arg0, Auto arg1) {
		if ("YEAR".equals(criteria)) {

			return arg0.getYear() - arg1.getYear();
		} 
		
		else
			if ("PRICE".equals(criteria)) {

			return (int)(arg0.getPrice() - arg1.getPrice());
	}
return 0;
}
}
