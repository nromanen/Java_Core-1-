package HW_4;

public class Auto {

    private int year;

    private int maxSpeed;

    private int passengers;

    private int loadCapacity;

    private int fuelConsumption;

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
                " Maximum capacity-" + "\""+loadCapacity+"\"" + "kg. " + " Passengers-" +"\""+ passengers+"\"" + " people." + " Fuel consumption per 100km-" + "\""+fuelConsumption+"\"" + " liters" + "\n";
    }

    //Builder

    public class Builder {

        private Builder() {

        }

        public Builder setYear(int year) {
            Auto.this.year = year;
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


}
