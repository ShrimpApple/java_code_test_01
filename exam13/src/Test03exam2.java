// 자동차 클래스(Ver.1) 이용 예(2: 대화형으로 자동차를 이동)
import java.util.Scanner;

public class Test03exam2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("차량 데이터를 입력하세요.");
        System.out.print("이  름:"); String name = stdIn.next();
        System.out.print("번  호:"); String number = stdIn.next();
        System.out.print("전  폭:"); int width = stdIn.nextInt();
        System.out.print("전  고:"); int height = stdIn.nextInt();
        System.out.print("전  징:"); int length = stdIn.nextInt();
        System.out.print("탱크용량:"); double tank = stdIn.nextDouble();
        System.out.print("연료량:"); double fuel = stdIn.nextDouble();
        System.out.print("연  비:"); double sfc = stdIn.nextDouble();

        Test03 myTest03 = new Test03(name, number, width, height, length, tank, fuel, sfc);

        while (true) {
            System.out.printf("현재 위치:(%.2f, %.2f)\n", myTest03.getX(), myTest03.getY());
            System.out.printf("남은 연료:%.2f\n", myTest03.getFuel());
            System.out.print("이동하겠습니까?[ 0...No/1...Yes]:");
            if (stdIn.nextInt() == 0) break;

            System.out.print("X방향으로의 이동 거리:");
            double dx = stdIn.nextDouble();

            System.out.print("Y방향으로의 이동 거리:");
            double dy = stdIn.nextDouble();

            if (!myTest03.move(dx, dy))
                System.out.println("연료 부족!!");
        }
    }
}
