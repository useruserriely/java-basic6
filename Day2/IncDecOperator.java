package Day2;

public class IncDecOperator {
    public static void main(String[] args) {

        // 증강연산자
        int num = 10;
        System.out.println(num + 5);
        System.out.println(num);

        // 변수의 값을 5 증가
        // num = 15; // 증가 X
        num = num + 5;
//        num += 5;

        // 변수의 값을 3 감소
        num = num - 3;
        num -= 3; // 위와 같은 표현

        // 증감연산자
        num += 1; // 증가값이 1인 경우에 한해 num++ 로 작성 가능
        num++; // 위와 같은 표현

        num -= 1; // 감소값이 1인 경우에 한해 num-- 로 작성 가능
        num--; // 위와 같은 표현

    }
}
