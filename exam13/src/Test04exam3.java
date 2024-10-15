// 2차원 좌표 클래스 Coordinate(Ver.1) 사용 예(방법3: 배열)
import java.util.Scanner;

public class Test04exam3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("좌표는 몇 개:");
        int n = stdIn.nextInt();

        Test04[] a = new Test04[n];    // 요소 수 n인 Coordinate형 배열

        for (int i = 0; i < a.length; i++)
            a[i] = new Test04(5.5, 7.7);  // 모든 요소를 (5.5, 7.7)로 새엇ㅇ

        for (int i = 0; i < a.length; i++)
            System.out.printf("a[%d] = (%.1f, %.1f)\n", i, a[i].getX(), a[i].getY());
    }
}
