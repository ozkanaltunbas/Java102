import java.util.Scanner;
public class Ustalma {
    public static void main(String[] args) {
        int t,u;
        System.out.print("Enter a base number : ");
        Scanner input1 = new Scanner(System.in);
        t =input1.nextInt();
        System.out.print("Enter a pow number : ");
        Scanner input2 = new Scanner(System.in);
        u = input2.nextInt();
        //3^4 = 3*3*3*3
        int sayac =1;
        int total = 1;
        while (sayac<=u){
            sayac++;
            total = total*t;
        }
        System.out.println(total);




    }
}
