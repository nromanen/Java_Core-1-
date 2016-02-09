package HW_6;

public class Auto {

    private int year;

    private String brand;

    private String brandModel;

    private String color;

    private double price;

    private Auto() {
        // private constructor
    }

    public int getYear() {
        return year;
    }

    public String getBrandModel() {
        return brandModel;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
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
        return  "Automobile - " + getCorrectBrand(brand) + "." + " Serial model - " + getCorrectBrand(brandModel) + "."  + " Color - " + color + "." +
                " Year - "+ + year + "." + " Price - " + price + "$." + "\n";
    }

    //Builder

    public class Builder {

        private Builder() {

        }

        public Builder setYear(int year) {
            Auto.this.year = year;
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

        public Builder setColor(String color) {
            Auto.this.color = color;
            return this;
        }

        public Builder setPrice(double price) {
            Auto.this.price = price;
            return this;
        }

        public Auto build() {
            return Auto.this;
        }

    }

}
