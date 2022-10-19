import  java.util.Scanner;
public class number_of_digits {
    public static void main(String[] args) {
        System.out.print("Please enter a number : ");
        Scanner input1 = new Scanner(System.in);
        int number = input1.nextInt();
        int tempnumber=number;
        int counter =0;
        while(tempnumber!=0){
            counter++;
            tempnumber=tempnumber/10;
        }
      //  System.out.println(tempnumber);
        tempnumber=number;
        ////--------////
        int valueRow;
        int result=0;
        while (tempnumber!=0){
            valueRow=tempnumber%10;
           // System.out.println(valueRow);
            tempnumber=tempnumber/10;
            result=result+valueRow;
        }
        System.out.println(result);
    }

}
