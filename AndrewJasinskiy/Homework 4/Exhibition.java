package HW_4;

import java.util.*;

public class Exhibition {

    public Set<Auto> cars = new HashSet<>();

    public Set<Auto> getCar() {
        return cars;
    }

    public void setCar(Set<Auto> cars) {
        this.cars = cars;
    }

    public boolean addCar(Auto automobile) {
        return cars.add(automobile);
    }

    public void deleteCar(CompareAuto comp, String brand) {
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

    public void deleteCar(CompareAuto comp, int value) {
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

}
