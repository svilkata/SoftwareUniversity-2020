import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    static double mathPower(double number, int power) {
        double result = 1;
        for (int i = 1; i <= power; i++)
            result *= number;

        return result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num = Double.parseDouble(sc.nextLine());
        int power = Integer.parseInt(sc.nextLine());

        System.out.println(new DecimalFormat("0.####").format(mathPower(num, power)));

    }
}
