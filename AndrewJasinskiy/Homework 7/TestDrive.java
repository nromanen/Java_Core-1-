package HW_7;

import com.fasterxml.jackson.core.JsonParseException;

import java.io.IOException;
import java.util.*;

import static HW_7.AutoConstructor.readInputValues;

public class TestDrive {
    public static void main(String[] args) throws AutoFormatException, IOException {

        SelfFormatAuto self = new SelfFormatAuto();
        JsonFormatAuto json = new JsonFormatAuto();

        Auto first = Auto.newBuilder()
                .setBrand("chevrolet")
                .setBrandModel("camaro")
                .setColor("Blue")
                .setYear(1971)
                .setPrice(24.345)
                .build();

        Auto second = Auto.newBuilder()
                .setBrand("dodge")
                .setBrandModel("challenger")
                .setColor("Black")
                .setYear(1970)
                .setPrice(34.545)
                .build();

        Auto third = Auto.newBuilder()
                .setBrand("shelby")
                .setBrandModel("cobra")
                .setColor("Black")
                .setYear(1965)
                .setPrice(34.445)
                .build();

        Auto forth = Auto.newBuilder()

                .setBrand("pontiac")
                .setBrandModel("firebird")
                .setColor("White")
                .setYear(1973)
                .setPrice(34.445)
                .build();

        //write one auto
        self.writeAuto("Chevrolet.txt", first);
        //read one auto
        System.out.println("SELF");
        System.out.println(self.readAuto("Chevrolet.txt"));

        //write collection auto
        Set<Auto> ex = new HashSet<>();
        ex.add(first);
        ex.add(second);
        ex.add(third);
        ex.add(forth);
        System.out.println("SELF COLLECTION");
        //I don't know, why I catch one exception with invalid input values.
        //In method validInputAuto(String [] string) i get addition cell array.
        self.writeAutos("Exhibition.txt",ex );

        //read collection auto
        System.out.println(self.readAutos("Exhibition.txt"));

        //write one json
        json.writeAuto("dodge.json",second);
        //read one jason
        System.out.println("JSON");
        System.out.println(json.readAuto("dodge.json"));


        //write collection json
        Set<Auto> ex2 = new HashSet<>();
        ex2.add(first);
        ex2.add(second);
        ex2.add(third);
        ex2.add(forth);
        json.writeAutos("Exhibition.json", ex2);

        //read collection json
        System.out.println("JSON COLLECTION");
        System.out.println(json.readAutos("Exhibition.json"));

    }
}

