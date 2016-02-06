package HW_4;

import java.util.*;

public class Exhibition {

    public static final String INC="INC";
    public static final String DEC="DEC";

    public Set<Auto> cars = new HashSet<>();

    public Set<Auto> getCar() {
        return cars;
    }

    public Set<Auto> getByYear(int year){
        Set<Auto> auto = new HashSet<>(cars);
        Iterator<Auto> i = auto.iterator();
        while(i.hasNext()) {
            if(!(i.next().getYear()==year))i.remove();
        }
        return auto;
    }

    public Set<Auto> getByBrand(String brand){
        Set<Auto> auto = new HashSet<>(cars);
        Iterator<Auto> i = auto.iterator();
        while(i.hasNext()) {
            if(!(i.next().getBrand().equals(brand))) i.remove();
        }
        return auto;
    }

    public void setCar(Set<Auto> cars) {
        this.cars = cars;
    }

    public boolean addCar(Auto automobile) {
        return cars.add(automobile);
    }

    public void deleteCar(AutoSelection comp, String brand) {
        Iterator<Auto> i = cars.iterator();
            while(i.hasNext()) {
                switch (comp) {
                    case BRAND:
                        if(i.next().getBrand().equals(brand)) i.remove();
                        break;
                    case BRAND_MODEL:
                        if(i.next().getBrandModel().equals(brand)) i.remove();
                        break;
                    }
            }
    }

    public void deleteCar(AutoSelection comp, int value) {
        Iterator<Auto> i = cars.iterator();
        while(i.hasNext()) {
            switch (comp) {
                case YEAR:
                    if(i.next().getYear()==value) i.remove();
                    break;
                case MAX_SPEED:
                    if((i.next().getMaxSpeed()==value)) i.remove();
                    break;
                case LOAD_CAPACITY:
                    if((i.next().getPassengers()==value)) i.remove();
                    break;
                case FUEL_CONSUMPTION:
                    if((i.next().getFuelConsumption()==value)) i.remove();
                    break;
            }
        }
    }

    public List<Auto> sort(final AutoSelection comp){
        List<Auto> auto = new ArrayList<>(cars);
        Collections.sort(auto, new Comparator<Auto>() {
           @Override
            public int compare(Auto o1, Auto o2) {
               switch (comp) {
                   case YEAR:
                       return o1.getYear()-o2.getYear();
                   case BRAND:
                       return o1.getBrand().compareTo(o2.getBrand());
                   case BRAND_MODEL:
                       return o1.getBrandModel().compareTo(o2.getBrandModel());
                   case FUEL_CONSUMPTION:
                       return o1.getFuelConsumption()-o2.getFuelConsumption();
                   case LOAD_CAPACITY:
                       return o1.getLoadCapacity()-o2.getLoadCapacity();
                   case MAX_SPEED:
                       return o1.getMaxSpeed()-o2.getMaxSpeed();
                   case PASSENGERS:
                       return o1.getPassengers()-o2.getPassengers();
               }
                return 0;
            }
        });
        return auto;
    }

    public List<Auto> sort(final AutoSelection comp, String value ){
        List<Auto> auto = new ArrayList<>(cars);
        Collections.sort(auto, new Comparator<Auto>() {
            @Override
            public int compare(Auto o1, Auto o2) {
                switch (comp) {
                    case YEAR:
                        return o1.getYear()-o2.getYear();
                    case BRAND:
                        return o1.getBrand().compareTo(o2.getBrand());
                    case BRAND_MODEL:
                        return o1.getBrandModel().compareTo(o2.getBrandModel());
                    case FUEL_CONSUMPTION:
                        return o1.getFuelConsumption()-o2.getFuelConsumption();
                    case LOAD_CAPACITY:
                        return o1.getLoadCapacity()-o2.getLoadCapacity();
                    case MAX_SPEED:
                        return o1.getMaxSpeed()-o2.getMaxSpeed();
                    case PASSENGERS:
                        return o1.getPassengers()-o2.getPassengers();
                }
                return 0;
            }

        });
        if(value.equals(INC)) {Collections.reverse(auto);}
        if(value.equals(DEC)){Collections.reverse(auto);}
        return auto;
    }


/*

    public List<Auto> sort(CompareAuto comp) {
        List<Auto> auto = new ArrayList<>(cars);

        switch (comp) {
            case YEAR:
                Collections.sort(auto, new Comparator<Auto>() {
                    @Override
                    public int compare(Auto o1, Auto o2) {
                        return o1.getYear()-o2.getYear();
                    }
                });
                break;
            case BRAND:
                Collections.sort(auto, new Comparator<Auto>() {
                    @Override
                    public int compare(Auto o1, Auto o2) {
                        return o1.getBrand().compareTo(o2.getBrand());
                    }
                });
                break;
            case BRAND_MODEL:
                Collections.sort(auto, new Comparator<Auto>() {
                    @Override
                    public int compare(Auto o1, Auto o2) {
                        return o1.getBrandModel().compareTo(o2.getBrandModel());
                    }
                });
                break;
            case FUEL_CONSUMPTION:
                Collections.sort(auto, new Comparator<Auto>() {
                    @Override
                    public int compare(Auto o1, Auto o2) {
                        return o1.getFuelConsumption()-o2.getFuelConsumption();
                    }
                });
                break;
            case LOAD_CAPACITY:
                Collections.sort(auto, new Comparator<Auto>() {
                    @Override
                    public int compare(Auto o1, Auto o2) {
                        return o1.getLoadCapacity()-o2.getLoadCapacity();
                    }
                });
                break;
            case MAX_SPEED:
                Collections.sort(auto, new Comparator<Auto>() {
                    @Override
                    public int compare(Auto o1, Auto o2) {
                        return o1.getMaxSpeed()-o2.getMaxSpeed();
                    }
                });
                break;
            case PASSENGERS:
                Collections.sort(auto, new Comparator<Auto>() {
                    @Override
                    public int compare(Auto o1, Auto o2) {
                        return o1.getPassengers()-o2.getPassengers();
                    }
                });
                break;
        }
        return auto;
    }
*/

}
