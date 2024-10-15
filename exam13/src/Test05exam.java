import java.util.Scanner;

public class Test05exam {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("좌표 p를 입력하세요.");
        System.out.print("X좌표:");
        double x = stdIn.nextDouble();
        System.out.print("Y좌표:");
        double y = stdIn.nextDouble();

        Test05 p = new Test05(x, y);
        System.out.println("p = " + p);
        Test05 q = new Test05(p);         // p와 같은 좌표

        System.out.println("q와 p를 동일 좌표로 만들었습니다.");
        System.out.println("q = " + q);

        if (p.equalTo(q))
            System.out.println("p와 q가 같습니다.");
        else
            System.out.println("p와 q가 다릅니다.");

        Test05 c1 = new Test05();       // (0.0, 0.0)
        Test05 c2 = new Test05(1.1, 2.2);       // (1.1, 2.2)

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        Test05[] a = new Test05[3];   // 요소 수가 3인 Coordinate형 배열
        for (int i = 0; i < a.length; i++)
            a[i] = new Test05();      // 모든 요소를 (0.0, 0.0)로 설정

        for (int i = 0; i < a.length; i++)
            System.out.println("a[" + i + "] = " + a[i]);


    }
}
