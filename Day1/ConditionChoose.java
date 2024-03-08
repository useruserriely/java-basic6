package Day1;

public class ConditionChoose {
    public static void main(String[] args) {
        int age = 8;

        if(age <= 13) {
            System.out.println("초등학생");
        } else if(age <= 17) {
                System.out.println("중학생"); // 윗줄에서 해당되는 건은 필터링
        } else if(age <= 19) {
                System.out.println("고등학생");
        } else {
            System.out.println("성인"); // 나머지는 조건 필요없으므로, if 생략
        }

        // else 같은 경우는 마지막에 조건을 생략하고 사용 가능(조건문 덩어리 마지막에 와야함)
    }
}
