// 자동차 클래스(Ver.1)의 이용 예(1)
public class Test03exam {
    public static void main(String[] args) {
        Test03 k3 = new Test03("k3","서울999-99", 1660,1500,3640,40.0,35.0,12.0);
        Test03 k5 = new Test03("k5","서울999-98", 1660,1525,3695,41.0,35.0,12.0);

        k3.putSpec();      // k3의 사양 표시
        System.out.println();
        k5.putSpec();      // k5의 사양 표시
    }
}
