import java.util.Scanner;
public class Ustalmafor {
    public static void main(String[] args) {
        int b,e;
        System.out.print("Enter a base number : ");
        Scanner input1 = new Scanner(System.in);
        b = input1.nextInt();
        System.out.print("Enter a exponential number : ");
        Scanner input2 = new Scanner(System.in);
        e = input2.nextInt();
        int total = 1;
        for(int i = 1;i<=e;i++){
            total =total*b; //total sayısnı kendisiyle üstü kadar çarpıyoruz.
            //üstü kadar dön

        }
        System.out.println(total);

    }
}
