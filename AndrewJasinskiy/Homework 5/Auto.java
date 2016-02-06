package HW_5;


import org.apache.commons.lang.StringUtils;

public class Auto {

    private int year;

    private int maxSpeed;

    private int passengers;

    private int loadCapacity;

    private int fuelConsumption;

    private double price;

    private String brand;

    private String brandModel;

    private Auto() {
        // private constructor
    }

    public int getYear() {
        return year;
    }

    public String getBrandModel() {
        return brandModel;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getPrice() {
        return price;
    }

    public int getPassengers() {
        return passengers;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public String getBrand() {
        return brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setBrandModel(String brandModel) {
        this.brandModel = brandModel;
    }

    public static Builder newBuilder() {
        return new Auto().new Builder();
    }

    private String getCorrectBrand(String value) {
        //this.brand = brand;
        for (int i = 0; i < value.length(); i++) {
            String first = value.substring(0, 1).toUpperCase();
            String other = value.substring(1).toLowerCase();
            value = first + other;
        }
        return value;
    }

    @Override
    public String toString() {
        return  "Automobile-" + "\""+ getCorrectBrand(brand) +"\"" + "." + " Serial model-" + "\""+getCorrectBrand(brandModel)+"\"" + "."  +  " Year-"+ "\""+ year+"\"" + "." + " Maximum speed-" + "\""+maxSpeed+"\"" + "km/h." +
                " Maximum capacity-" + "\""+loadCapacity+"\"" + "kg. " + " Passengers-" +"\""+ passengers+"\"" + " people." + " Fuel consumption per 100km-" + "\""+fuelConsumption+"\"" + " liters." +
                " Auto costs-" + price + "\n";
    }

    //Builder

    public class Builder {

        private Builder() {

        }

        public Builder setYear(int year) {
            Auto.this.year = year;
            return this;
        }

        public Builder setPrice(double price) {
            Auto.this.price = price;
            return this;
        }


        public Builder setSpeed(int maxSpeed) {
            Auto.this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder setPassengers(int passengers) {
            Auto.this.passengers = passengers;
            return this;
        }

        public Builder setLoadCapacity(int loadCapacity) {
            Auto.this.loadCapacity = loadCapacity;
            return this;
        }

        public Builder setFuelConsumption(int fuelConsumption) {
            Auto.this.fuelConsumption = fuelConsumption;
            return this;
        }

        public Builder setBrandModel(String brandModel) {
            Auto.this.brandModel = brandModel;
            return this;
        }

        public Builder setBrand(String brand) {
            Auto.this.brand = brand;
            return this;
        }

        public Auto build() {
            return Auto.this;
        }

    }

//*********************************************

    public static Auto valueOf(String autoRep) throws AutoFormatException{
        Auto auto = new Auto();
        String[] err = AutoValidator.errors(autoRep);
        String[] strings = StringUtils.split(autoRep, ", .;[]()");

        if (!(AutoValidator.errors(autoRep)[0]).isEmpty()) {
            throw new AutoFormatException(err);
        } else
            auto.setBrand(strings[0]);

		if (!(AutoValidator.errors(autoRep)[1]).isEmpty()) {
			return null;
		} else {
			auto.setYear(Integer.parseInt(strings[1]));
		}
        if (!(AutoValidator.errors(autoRep)[2]).isEmpty()) {
            return null;
        } else {
            auto.setPrice(Double.parseDouble(strings[2]));
        }
        return auto;
    }


    public static void main(String[] args) {

        Auto a = new Auto();

        String merc = "Mercedes 1945 $34.234";

        try{
            a=Auto.valueOf(merc);
        }catch (AutoFormatException e) {
            System.out.println(e);
        }

    }

}
