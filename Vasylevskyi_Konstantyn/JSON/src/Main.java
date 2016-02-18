import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Smart on 09.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Auto> autoCollection=new ArrayList<>();
        Auto auto = new Auto();
        auto.setColour("BLUE");
        auto.setModel("Audi");
        auto.setYear(9876);
        auto.setPrice(765);
        Auto auto2 = new Auto();
        auto2.setColour("Black");
        auto2.setModel("BMW");
        auto2.setYear(2018);
        auto2.setPrice(765);
        autoCollection.add(auto);
        autoCollection.add(auto2);

               /*JSONFormatAuto*/

        IOAuto jsonFormatAuto = new JSONFormatAuto();
        try {
            jsonFormatAuto.writeAuto("test.json",auto);
        } catch (IOException e) {
            e.printStackTrace();
        }

              /* SelfFormatAuto*/
        IOAuto selfFormatAuto = new SelfFormatAuto();
        try {
            selfFormatAuto.writeAuto("CONSOLE", auto);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
