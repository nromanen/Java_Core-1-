
public class TheAmountOddAndEven{

    public static void main(String[] args) {

        int counter = 10;
        int var = 1023669874;
        int resultVal;
        int outVar1 = 0;
        int outVar2 = 0;
        do {
            resultVal = var%counter;
            var=var/counter;
            if (resultVal % 2 == 0 ){
                outVar1 += resultVal;
            }else {
                outVar2 +=resultVal;
            }

        }while (var!=0);

        System.out.println("The Amount of even numbers = " + outVar1);
        System.out.println("The Amount of odd numbers = " + outVar2);

    }

}
