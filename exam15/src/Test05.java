import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("실수값:");
        double x = stdIn.nextDouble();

        System.out.println("정댓값:" + Math.abs(x));
        System.out.println("제곱근:" + Math.sqrt(x));
        System.out.println("면 적:" + Math.PI * x * x);
    }
}
