import java.util.Scanner;
public class Ciftorthesap {
    public static void main(String[] args) {
        System.out.print("Enter a number  : ");
        Scanner input1 = new Scanner(System.in);
        double number = input1.nextInt();
        int k = 0;
        double toplam = 0;
        for(int i = 0;i<=number;i++){
            if((i %3==0) && i % 4 ==0){
                k=k+1;
                toplam=toplam+i;
            }
        }
        int a = k-1;
        System.out.println(toplam/a);

    }
}

