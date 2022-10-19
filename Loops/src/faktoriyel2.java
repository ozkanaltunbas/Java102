import java.util.Scanner;
public class faktoriyel2 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter a 'n' : ");
        int n = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter a 'r' : ");
        int r = input2.nextInt();
        int total1= 1;
        int total2 = 1;
        int total3 = 1;
        for(int i =1;i<=n;i++){
            total1=total1*i;
        }
        for(int x = 1;x<=r;x++){
            total2=total2*x;
        }
        int nfak= n-r;
        for (int z =1;z<=nfak;z++){
            total3=total3*z;
        }
        int farkcarp= total3*total2;
        int result = total1/farkcarp;
        System.out.println(result);

    }

}
