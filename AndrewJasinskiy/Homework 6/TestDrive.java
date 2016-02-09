package HW_6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import static HW_6.AutoConstructor.readInputValuesFromConsole;

public class TestDrive {
    public static void main(String[] args) throws AutoFormatException{
        int numberOfCars =0;

        Set<Auto> ex = new HashSet<>();
        Exhibition exhibition = new Exhibition();
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of cars to create the exhibition:");
        boolean flag = true;
        while (flag) {
            try {
                numberOfCars = Integer.parseInt(input.nextLine());
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("Invalid format number! Try again!");
            }
        }

        System.out.println("Please, enter value for creating " + numberOfCars + " cars in next format: \n" +
                "1.Brand name; \n" +
                "2.Brand model; \n" +
                "3.Color; \n" +
                "4.Year of production; \n" +
                "5.Car's price.");
        System.out.println("For example: \"Mercedes, S400, Blue, 2012, 45.450\"");
        System.out.println("If you want exit from creating }exhibition enter - \"EXIT\"");

        mark: {
            int i = 0;
            while(i<numberOfCars){
                boolean tmp;
                System.out.println("Input values for next car:");
                String inputValue = input.nextLine();
                if (inputValue.equals("EXIT")) break mark;
                if(ex.addAll(readInputValuesFromConsole(inputValue))){
                    i++;
                }
            }

            System.out.println("Please, press next button:");
            System.out.println("[1] Show full exhibition. \n" + "[2] Sort exhibition.");

            boolean secondFlag = true;

            while(secondFlag) {
                try {
                    int button = Integer.parseInt(input.nextLine());
                    if (button == 1) {
                        System.out.println(ex);
                        secondFlag = false;
                        break mark;
                    }
                    if (button == 2) {
                        System.out.println("Choose category to sort gallery: \n" +
                                "[1] Sort by YEAR:\n" +
                                "[2] Sort by BRAND:\n" +
                                "[3] Sort by BRAND_MODEL:\n" +
                                "[4] Sort by COLOR:\n" +
                                "[5] Sort by PRICE:");
                        secondFlag = false;
                    }else{
                        System.out.println("Yo must enter [1] or [2]");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid format number! Yo must enter [1] or [2]");
                }
            }

            exhibition.setCar(ex);

            boolean thirdFlag = true;

            while(thirdFlag) {
                try {
                    int buttonSort = Integer.parseInt(input.nextLine());
                    switch (buttonSort) {
                        case 1:
                            System.out.println(exhibition.sort(AutoSelection.YEAR));
                            thirdFlag = false;
                            break;
                        case 2:
                            System.out.println(exhibition.sort(AutoSelection.BRAND));
                            thirdFlag = false;
                            break;
                        case 3:
                            System.out.println(exhibition.sort(AutoSelection.BRAND_MODEL));
                            thirdFlag = false;
                            break;
                        case 4:
                            System.out.println(exhibition.sort(AutoSelection.COLOR));
                            thirdFlag = false;
                            break;
                        case 5:
                            System.out.println(exhibition.sort(AutoSelection.PRICE));
                            thirdFlag = false;
                            break;
                        default:
                            System.out.println("Yo must enter number in the range from [1] to [5]");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid format number! Yo must enter number in the range from [1] to [5]");
                }
            }
        }
    }
}

