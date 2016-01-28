package HW_4;

public class Auto {

    private int year;

    private int maxSpeed;

    private int passengers;

    private int loadCapacity;

    private int kpl; //kilometers per liter

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

    public int getKpl() {
        return kpl;
    }

    public String getBrand() {
        return brand;
    }

    public static Builder newBuilder() {
        return new Auto().new Builder();
    }

    private String getCorrectBrand(String brand) {
        this.brand = brand;
        for (int i = 0; i < brand.length(); i++) {
            String first = brand.substring(0, 1).toUpperCase();
            String other = brand.substring(1).toLowerCase();
            brand = first + other;
        }
        return brand;
    }

    @Override
    public String toString() {
        return  "Automobile-" + "\""+ brand +"\"" + "." + " Serial model-" + "\""+brandModel+"\"" + "."  +  " Year-"+ "\""+ year+"\"" + "." + " Maximum speed-" + "\""+maxSpeed+"\"" + "km/h." +
                " Maximum capacity-" + "\""+loadCapacity+"\"" + "kg. " + " Passengers-" +"\""+ passengers+"\"" + " people." + " Fuel consumption per 100km-" + "\""+kpl+"\"" + " liters";
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

        public Builder setKpl(int kpl) {
            Auto.this.kpl = kpl;
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
