import java.util.Scanner;
public class Teksayi {
    public static void main(String[] args) {
        int number;
        int a =0;

        Scanner input1 = new Scanner(System.in);
        do {
            System.out.print("Enter a number : ");
            number = input1.nextInt();
            if (number %2 ==0 &&number%4 ==0){
                a=a+number;
            }
        }while (number%2==0);{
        }
        System.out.println(a);

    }
}
