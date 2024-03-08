//package Day5;
//
//public class ConstructorExam2 {
//    public static void main(String[] args) {
//        사람 a사람 = new 사람();
//        a사람.나이 = 10;
//        a사람.a왼팔 = new 팔();
//
//        System.out.println(a사람.a왼팔.길이 + "cm");
//        // 출력 : 100cm
//
//        팔.initialize(100);
//    }
//}
//
//
//class 사람 {
//    int 나이;
//    팔 a왼팔;
//}
//
//class 팔 {
//    int 길이;
//
//    // 생성자를 통해 길이를 초기화하는 메서드 추가
//    public void initialize(int 길이) {
//        this.길이 = 길이;
//    }
//
//    public void 팔() {
//        System.out.printf("d%", 길이);
//    }
//
//
//}
//
