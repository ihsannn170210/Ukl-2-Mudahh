import java.util.Scanner;

public class BilanganGanjil {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan sebuah bilangan bulat: ");
        int number = input.nextInt();

        if (number % 2 != 0) {
            System.out.println(number + " adalah bilangan ganjil.");
        } else {
            System.out.println(number + " bukan bilangan genap.");
        }


    }
}
