
public class Auto {

    private String carBrand;

    private String model;

    private String colour;

    private int year;

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;

    public String getCarBrand() {
        return carBrand;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return"Car brand - " + carBrand+
                ", Model - "+ model+
                ", Colour - " + colour+
                ", Year - " + year+
                ", Price - " + price + "\n";
    }

}
