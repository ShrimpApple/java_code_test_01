public class Test02exam {
    public static void main(String[] args) {
        Test02 gildong = new Test02("길동", 170, 60);
        Test02 chulsu = new Test02("철수", 166, 72);

        gildong.gainWeight(3);     // 길동이 3kg 쪘다
        chulsu.reduceWeight(5);    // 철수가 5kg 빠졌다

        System.out.println("이름:" + gildong.getName());
        System.out.println("신장:" + gildong.getHeight() + "cm");
        System.out.println("체중:" + gildong.getWeight() + "kg");
        System.out.println();

        System.out.println("이름:" + chulsu.getName());
        System.out.println("신장:" + chulsu.getHeight() + "cm");
        System.out.println("체중:" + chulsu.getWeight() + "kg");
    }
}
