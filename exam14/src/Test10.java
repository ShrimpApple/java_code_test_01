// 사람 클래스(Ver.4)
public class Test10 {
    private String name;      // 이름
    private int height;       // 신장
    private int weight;       // 체중
    private int id;     // 식별 번호

    //--- 생성자 ---//
    public Human(String name, int height, int weight) {
        this.name = name;   this.height = height;
        this.weight=weight;
        id = ++counter;
    }

    public String getName() {return name;}          // 이름 가져오기
    public int getHeight() {return height;}         // 신장 불러오기
    public int getWeight() {return weight;}         // 체중 불러오기

    public void gainWeight(inw w) {weight += w;}   // 살이 찐다
    public void reduceWeight(inw w) {weight -= w;}   // 살이 빠진다

    //--- 데이터 표시 ---//
    public void putData() {
        System.out.println("이름:" + name);
        System.out.println("신장:" + height + "cm");
        System.out.println("체중:" + weight + "kg");
    }
}
