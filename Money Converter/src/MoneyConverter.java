import java.util.Scanner;

public class MoneyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float rate;
        System.out.println("Rate of USD to VND is: ");
        rate = scanner.nextFloat();

        System.out.println("Input your USD: ");
        float usd = scanner.nextFloat();

        System.out.println("Your VND: "+ usd * rate );
    }
}
