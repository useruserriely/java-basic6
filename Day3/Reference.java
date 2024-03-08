package Day3;

public class Reference {
    public static void main(String[] args) {
        Person p1 = new Person(); // 객체가 힙 메모리에 생성
        Person p2 = new Person();

        System.out.println(p1);
        System.out.println(p2);

        // 사람 복사
        p1.name = "홍길동";
        p1.age = 20;
        p1.home = "서울";

        System.out.println(p1.name);

        // 사람 복사
        Person p3 = p1;
        System.out.println(p3.name);

        // 홍길동은 2명이 된걸까? X

        p3.name = "이순신";

        System.out.println(p3.name);
        System.out.println(p1.name);

        // 손흥민을 2명 만들어주세요.
        // 손흥민, 31, 런던

        Person p4 = new Person();
        Person p5 = new Person();

        System.out.println(p4);
        System.out.println(p5);

        // 사람 복사
        p4.name = "손흥민";
        p4.age = 31;
        p4.home = "런던";

        System.out.println(p4.name);

        // 사람 복사
        p5.name = p4.name;
        p5.age = p5.age;
        p5.home = p4.home;

        p4.name = "손흥민";
        System.out.println(p4.name);
        System.out.println(p5.name);

        // 객체의 복사
        // 참조값의 복사 -> 얇은 복사
        // 객체값의 복사 -> 깊은 복사

        // 지역변수의 저장 >> 스택
        // 객체(참조값)의 저장 >> 힙

    }
}

