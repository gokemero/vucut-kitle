import java.util.Scanner;
public class kod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a , b ;
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz :");
        a = input.nextDouble();
        System.out.print("\nLütfen kilonuzu giriniz :");
        b = input.nextDouble();
        double c = (b/(a*a));
        System.out.print("\nVücut kitle indeksiniz :"+ c);
    }

}
