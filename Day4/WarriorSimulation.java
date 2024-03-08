package Day4;

public class WarriorSimulation {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.나이 = 20;
        a전사.a무기 = new 활();
        a전사.a무기 = new 칼();
        System.out.println();
    }
}
class 전사 {
    int 나이;
    무기 a무기;
}

interface 무기 {
    void 공격();
}

class 칼 implements 무기 {
    public void 공격() {
        System.out.println("칼로 공격합니다.");
    }
}

class 활 implements 무기 {
    public void 공격() {
        System.out.println("활로 공격합니다.");
    }
}