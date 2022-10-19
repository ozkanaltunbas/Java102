import java.util.Scanner;
public class Armstrongcount {
    public static void main(String[] args) {
        int counter=0;
        Scanner input4 = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number1 = input4.nextInt();
        int tempnumber = number1; ///tempnumberın amacı while da number en son 0 oluyor bunu tekrardan aynı degeri almak için.
        while(tempnumber!=0){
            tempnumber/=10;
            counter++;    ///burda sayının kaç basamaklı olduğunu bulduk.
        }
        tempnumber=number1;
        //------------//
        int basValue;

        int result=0;
        while(tempnumber!=0){
            int basPow=1;
            basValue=tempnumber%10; //son basamağını alır.
            for(int i =1;i<=counter;i++){
                basPow*=basValue;
            }
            result+=basPow;
            tempnumber/=10;

        }
        System.out.println(result);
    }
}
