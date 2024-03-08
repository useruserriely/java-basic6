//package Day4;
//
//public class WarriorSimulationExam2 {
//    public static void main(String[] args) {
//        전사 a전사 = new 전사();
//
//        String 이름 = "홍길동";
//        a전사.이름 = 이름;
//        a전사.나이 = 20;
//        a전사.자기소개();
//        // 출력 : 안녕하세요 저는 20살 홍길동입니다.
//
//        a전사.a무기 = new 활();
//        a전사.공격();
//        // 출력 : 홍길동이/가 활로 공격합니다.
//
//        a전사.a무기 = new 칼();
//        a전사.공격();
//        // 출력 : 홍길동이/가 칼로 공격합니다.
//    }
//}
//
//class 전사 {
//    // 인스턴스 변수
//    String 이름;
//    // 인스턴스 변수
//    int 나이;
//    // 인스턴스 변수
//    무기 a무기;
//
//    void 자기소개() {
//        System.out.println("안녕하세요 저는 " + 나이 + "살 " + 이름 + "입니다.");
//    }
//
//    void 공격() {
//        System.out.println(이름 + "이/가 " + a무기.getClass().getSimpleName() + "로 공격합니다.");
//    }
//}
//
//class 무기 {}
//
//class 칼 extends 무기 {}
//
//class 활 extends 무기 {}