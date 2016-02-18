import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZooService {


    public static String[] animalValidator(String tetxAnimal){
        String animal = tetxAnimal.toLowerCase();
        if (animal.split(",").length!=4){
            return null;
        }
        String temp = animal.replaceAll("\\w*:","");
        String[]animals = temp.split(",");
        if (!consist(animals[0])){
            return null;
        }
        for (int i = 1; i < animals.length-1;i++){
            Pattern p = Pattern.compile("[a-z]+");
            Matcher m = p.matcher(animals[i]);
            if(!m.matches()){
                return null;
            }
        }
        if (!(animals[3].equals("true")||animals[3].equals("false"))) {
            System.out.println("asdas");
            return null;
        }
        return animals;
    }

    public static Animal stringToAnimal(String[] animalText){
        Animal a1 = new Animal();
        if (animalText!=null) {
            if (Character.isDigit(animalText[0].charAt(0)) &&animalText[0].length()==1){
                a1.setType(Integer.parseInt(animalText[0]));
            }else{
                a1.setType(animalText[0]);
            }
            a1.setFamily(animalText[1]);
            a1.setName(animalText[2]);
            a1.setMeet(Boolean.parseBoolean(animalText[3]));
            return a1;
        }
        return new Animal();
    }

    public static boolean consist(String myenum){
        try {
            if (Integer.parseInt(myenum)>=0||Integer.parseInt(myenum)<=4)
                return true;
        }catch (Exception e){

        }

        for (Animal.AnimalType a: Animal.AnimalType.values()) {
            if (myenum.equals(a.toString().toLowerCase())) {
                return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        Animal a = stringToAnimal(animalValidator("Type:asd,Family:voron,Name:Vsya,Meet:true"));
        System.out.println(a);
    }

}
