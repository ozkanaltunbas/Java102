import java.util.Scanner;
public class Harmonik {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner input1 = new Scanner(System.in);
        int number = input1.nextInt();
        double result =0;
        for(double i =1;i<=number;i++){
            result = result+(1/i);

        }
        System.out.println(result);

    }
}
