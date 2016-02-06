
package university;


import org.apache.commons.lang3.StringUtils;

public class Auto {

	private String model;

	private int year;
	private double price;
	private String color;

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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Auto)) {
			return false;
		}
		Auto auto2 = (Auto) obj;
		return (this.color.equals(auto2.color) && this.model
				.equals(auto2.model));
	}

	@Override
	public String toString() {
		return "[model - " + model + ",year - " + year + ","+"price - $" + price + ", color - "
				+ color + "]";
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
		String price1 = StringUtils.join(strings[2], ".");
		String price2 = StringUtils.join(strings[3], "");
		String price= price1+price2;

		if (!(AutoValidator.errors(autoRep)[0]).isEmpty()) {
			throw new AutoFormatException(err);
		} else
			auto.setModel(strings[0]);

	   if (!(AutoValidator.errors(autoRep)[1]).isEmpty()) {
		   throw new AutoFormatException(err);
		} else {
			auto.setYear(Integer.parseInt(strings[1]));
		}
		if (!(AutoValidator.errors(autoRep)[2]).isEmpty()) {
			throw new AutoFormatException(err);
		} else {
			auto.setPrice(Double.parseDouble(price));
		}
		if (!(AutoValidator.errors(autoRep)[3]).isEmpty()) {
			throw new AutoFormatException(err);
		} else {
			auto.setColor(strings[4]);
		}

		return auto;

	}

	public static void main(String... strings) throws AutoFormatException {



		Auto a ;
		try {
			a = Auto.valueOf("Rto, 1930, 225,135, Blue");
			System.out.println(a);
		} catch (AutoFormatException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}