package Day5;

// 추상클래스는 객체화하여 사용할 수 없다. 반드시 상속받아 오버라이딩해서 사용해야 한다.
abstract class 표준Tv { // 추상메서드
    abstract void 켜기(); // 추상메서드
    abstract void 끄기();
}
class 샤오미Tv extends 표준Tv { // 표준Tv에게 물려받은 켜기 메서드가 내용이 없는 추상메서드이기 때문에 오버라이딩
    void 켜기() {
        System.out.println("샤오미Tv 켜집니다.");
    }
    void 끄기() {
        System.out.println("샤오미Tv 꺼집니다.");
    }
    void vr켜기() {
        System.out.println("샤오미Tv vr켜기!");
    }
}
class 삼성Tv extends 표준Tv {
    void 켜기() {
        System.out.println("삼성Tv 켜집니다.");
    }
    void 끄기() {
        System.out.println("삼성Tv 꺼집니다.");
    }
    void ar켜기() {
        System.out.println("삼성Tv ar켜기!");
    }
}

class LGTv extends 표준Tv {
    void 이름세팅() {}
    void 켜기() {
        System.out.println("LGTv 켜집니다.");
    }
    void 끄기() {
        System.out.println("LGTv 꺼집니다.");
    }
    void 게임모드전환() {
        System.out.println("LGTv 게임모드전환!");
    }
}
