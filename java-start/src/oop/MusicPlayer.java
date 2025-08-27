package oop;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    public void on(){
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    public void off(){
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    public void volumeUp() {
        volume++;
        System.out.printf("음악 플레이어 볼륨 : %d%n", volume);
    }

    public void volumeDown() {
        volume--;
        System.out.printf("음악 플레이어 볼륨 : %d%n", volume);
    }

    public void showStatus() {
        System.out.println("음악 플레이어 상태 확인");

        if(isOn) {
            System.out.printf("음악 플레이어 ON, 볼륨 : %d%n", volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
