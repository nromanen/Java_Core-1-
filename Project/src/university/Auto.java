package university;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

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
	
	
	/**
	 * 
	 * @param autoRep 
	 * @return
	 * @throws AutoFormatException
	 */
	public static Auto valueOf(String autoRep) throws AutoFormatException{
		Auto auto = new Auto();
		String[] err = AutoValidator.errors(autoRep);
		String[] strings = StringUtils.split(autoRep, ", .;[]()");

		if (!(AutoValidator.errors(autoRep)[0]).isEmpty()) {
			throw new AutoFormatException(err);
		} else
			auto.setModel(strings[0]);

/*		if (!(AutoValidator.errors(autoRepresentation)[1]).isEmpty()) {
			return null;
		} else {
			auto.setYear(Integer.parseInt(strings[1]));
		}
*/
		auto.setYear(8765);
		auto.setColour("Blue");
		auto.setPrice(34.5);
		return auto;

			}

	public static void main(String... strings) {
		
		//System.out.println(Auto.valueOf("Rt , 65"));
		
		Auto a = new Auto();
		try {
			a = Auto.valueOf("dfdf");
		} catch (AutoFormatException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
}
}
