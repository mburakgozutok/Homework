import java.util.Scanner;

public class endex{
    public static void main(String[] args) {
        
        double boy, vke;
        int kilo;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = input.nextInt();

        vke = kilo / boy;
        System.out.print("Vücut kitle endeksiniz: " + vke);
    
    }
}