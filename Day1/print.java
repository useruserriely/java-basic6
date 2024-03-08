package Day1;

public class print {
    public static void main(String[] args) {
        System.out.println(1111);
        System.out.println(2222);
        System.out.println(3333);
        System.out.println(4444);
        System.out.println("월요일");
        System.out.println("화요일");
        System.out.println("수요일");
        System.out.println("목요일");
        System.out.println("금요일");
        System.out.println("토요일");
        System.out.println("일요일");
        System.out.println("공휴일");

        // \n은 줄바꿈
        System.out.println("안녕하세요.\n반갑습니다.");

        // 문자 합치기
        System.out.println("안녕하세요. 박소연입니다.");
        System.out.println("안녕하세요." + " 박소연입니다.");
        System.out.println("안녕하세요." + " 박소연입니다." + " 반갑습니다.");

        // 숫자 더하기
        System.out.println(100 + 200);
        System.out.println(2000 + 3000);

        // 숫자와 문자의 혼용
        System.out.println("100"); // 문자
        System.out.println(100); // 숫자

        // 숫자와 문자는 정확히 구별해서 사용
        System.out.println("100" + "200");
        System.out.println(100 + 200);

        // 숫자를 문자화해서 붙임
        System.out.println("100" + 200);

        // 출력문을 이용해 더하기 식 표현하기
        // + 연산자가 여러번 나오면 왼쪽부터 순차적으로 연산
        System.out.println("123124 + 56563 = " + 123124 + 54563);

        // 숫자 곱하기 (*)
        System.out.println(100 * 200);

        // 구구단 2단을 출력해주세요.
        System.out.println("2 X 1 = " + (2 * 1) + "\n2 X 2 = " + (2 * 2) + "\n2 X 4 = " + (2 * 4) + "\n2 X 5 = " + (2 * 5) + "\n2 X 6 = " + (2 * 6) + "\n2 X 7 = " + (2 * 7) + "\n2 X 8 = " + (2 * 8) + "\n2 X 9 = " + (2 * 9));













    }
}
