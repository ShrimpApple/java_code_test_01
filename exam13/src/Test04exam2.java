import java.util.Scanner;

public class Test04exam2 {
    static boolean compCoordinate(Test04 c1, Test04 c2) {
        return c1.getX() == c2.getX() && c1.getY() == c2.getY();
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        double x, y;
        System.out.println("좌표 p를 입력하세요.");
        System.out.print("X좌표:"); x = stdIn.nextDouble();
        System.out.print("Y좌표:"); y = stdIn.nextDouble();
        Test04 p = new Test04(x, y);

        System.out.println("좌표 q를 입력하세요.");
        System.out.print("X좌표:"); x = stdIn.nextDouble();
        System.out.print("Y좌표:"); y = stdIn.nextDouble();
        Test04 q = new Test04(x, y);

        System.out.println((p == q)
        ? "p == q입니다."
                : "p != q입니다.");

        System.out.println(p.getX() == q.getX() &&
                p.getY() == q.getY()
        ? "p와 q가 같습니다."
                : "p와 q가 다릅니다.");

        System.out.println(compCoordinate(p, q)
        ? "p와 q가 같습니다."
                : "p와 q가 다릅니다.");
    }
}
