/**
 * Created by Smart on 07.02.2016.
 */
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


    }

