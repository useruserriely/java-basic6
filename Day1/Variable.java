package Day1;

public class Variable {
    public static void main(String[] args) {
        // 변수
        // 변수는 데이터를 저장하는 공간(그릇)

        // 변수 선언
        // 변수타입 변수명;

        // 숫자형 변수 선언
        // int -> 정수
        int number;

        // 변수에 값 저장
        number = 50; // 변수가 왼쪽, 저장 대상이 오른쪽

        // 40 = number; // 불가

//        int number2;
//        number2 = "박소연"; // 숫자 변수에 문자 저장 불가

        // String -> 자바에서 문자열을 의미
        String str;
        str = "박소연";

        // 변수에 저장되어 있는 값을 사용
        // 변수명을 값처럼 사용
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);

        System.out.println(40);
        System.out.println(40);
        System.out.println(40);

        String name;
        name = "박소연";

        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);

        System.out.println("박소연");
        System.out.println("박소연");
        System.out.println("박소연");
        System.out.println("박소연");

        int age;
        age = 28;

        String name2;
        name2 = "박소연";
        System.out.println("안녕하세요. " + age + "세 " + name2 + "입니다.");
        System.out.println("안녕하세요. " + age + "세 " + name2 + "입니다.");
        System.out.println("안녕하세요. " + age + "세 " + name2 + "입니다.");
        System.out.println("안녕하세요. " + age + "세 " + name2 + "입니다.");
        System.out.println("안녕하세요. " + age + "세 " + name2 + "입니다.");
        System.out.println("안녕하세요. " + age + "세 " + name2 + "입니다.");

        // 변수 주의사항
        // 변수명은 중복되지 않도록 지어야 함.
        // 변수명은 숫자로 시작 불가.
        // 변수는 재활용 가능.

        int a;
        a = 10;
        System.out.println(a);

        a = 20;
        System.out.println(a);
    }
}
