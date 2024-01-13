package oop1;

public class MusicPlayer {
    boolean isOn = false;
    int volume = 0 ;

    void on(){
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    void off(){
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
    void volmumeUp(){
        volume ++;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }
    void volumeDown(){
        volume --;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }
    void showStatus(){
        System.out.println("음악 플레이어 상태: " + isOn);
        System.out.println("음악 플레이어 볼륨: " + volume);
    }
}
