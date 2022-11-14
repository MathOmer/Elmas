import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int Number,TempNumber,n;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        Number = input.nextInt();


        for(int i=1;i<=Number;i++){

            for(int k=1;k<=(Number-i);k++){
                System.out.print(" ");
            }

            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
        
    }
}