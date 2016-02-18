
public class AutoBuilder {


   private Auto autoInstance = new Auto();

    public AutoBuilder setCarBrand(String carBrand){
        autoInstance.setCarBrand(carBrand);
        return this;
    }

    public AutoBuilder setModel(String model){
        autoInstance.setModel(model);
        return this;
    }

    public AutoBuilder setColour(String colour){
        autoInstance.setColour(colour);
        return this;
    }

    public AutoBuilder setYear(int year){
        autoInstance.setYear(year);
        return this;
    }

    public AutoBuilder setPrice(double price){
        autoInstance.setPrice(price);
        return this;
    }

    public Auto build(){
        return autoInstance;
    }

}
