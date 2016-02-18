import org.joda.time.DateTime;

import java.util.*;


public class Garage {

    public Set<Auto> autos = new HashSet<>();

    public Set<Auto> getAutos() {
        return autos;
    }

    public void setAutos(Set<Auto> autos) {

        this.autos = autos;
    }

    public boolean addCar(Auto auto){
        return autos.add(auto);
    }

    public List<Auto> sort(CompareCategories cat, SortOrder ord){
        ArrayList<Auto> autos1 = new ArrayList<>(autos);
        switch (cat) {
            case CAR_BRAND:
                Collections.sort(autos1, new Comparator<Auto>() {
                    @Override
                    public int compare(Auto o1, Auto o2) {
                        return o1.getCarBrand().compareTo(o2.getCarBrand());
                    }
                });
                break;
            case CAR_MODEL:
                Collections.sort(autos1, new Comparator<Auto>() {
                    @Override
                    public int compare(Auto o1, Auto o2) {
                        return o1.getCarBrand().compareTo(o2.getCarBrand());
                    }
                });
                break;
            case YEAR:
                Collections.sort(autos1, new Comparator<Auto>() {
                    @Override
                    public int compare(Auto o1, Auto o2) {
                        return o1.getYear()-o2.getYear();
                    }
                });
                break;
            case PRICE:
                Collections.sort(autos1, new Comparator<Auto>() {
                    @Override
                    public int compare(Auto o1, Auto o2) {
                        return (int) (o1.getPrice()-o2.getPrice());
                    }
                });

        }
        if (ord==SortOrder.DESC){
            Collections.reverse(autos1);
        }
        return autos1;
    }

    public void removeAnOldAutoByAge(int ageOfAuto){
        Iterator<Auto> iter = autos.iterator();
        while (iter.hasNext()){
            if (DateTime.now().getYear() - iter.next().getYear()>ageOfAuto){
                iter.remove();
            }
        }
    }
}
