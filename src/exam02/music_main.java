package exam02;

import java.util.Scanner;

import exam02.MusicPlayer;
import exam02.musicclass;

public class music_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int input = 0;
//		int i = 0;
		MusicPlayer player = new MusicPlayer();
		musicclass m = player.play();
//		player[0] = new musicclass("뱅뱅뱅", "빅뱅", 100);
//		player[1] = new musicclass("CheerUp", "트와이스", 120);
//		player[2] = new musicclass("Daddy", "싸이", 140);

		while (true) {
			System.out.print("[1]재생 [2]정지 [3]다음곡 [4]이전곡 [5]종료 >> ");
			input = scan.nextInt();
			if (input == 1) {
				m = player.play();
			} else if (input == 2) {
				String message = player.stop();
				System.out.println(message);
			} else if (input == 3) {
				m = player.nextPlay();
			} else if (input == 4) {
				m = player.prePlay();
			} else if (input == 5) {
				System.out.println("프로그램 종료");
				break;
			}
			if (input != 2) {
				System.out.println(printMusicInfo(m));
			}
		}

	}

	
	// 반복되는 긴 문장은 드래그해서 오른쪽 클릭 refactor -> Extract method를 통해서 별도 매소드로 묶어 보기 쉽게 할 수 있다.
	private static String printMusicInfo(musicclass m) {
		return m.getMusicName() + ", " + m.getSinger() + ", " + changeTime(m);
	}

	private static String changeTime(musicclass m) {
		return m.getPlayTime() / 60 + "분" + m.getPlayTime() % 60 + "초";
	}

}
