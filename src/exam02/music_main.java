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
//		player[0] = new musicclass("����", "���", 100);
//		player[1] = new musicclass("CheerUp", "Ʈ���̽�", 120);
//		player[2] = new musicclass("Daddy", "����", 140);

		while (true) {
			System.out.print("[1]��� [2]���� [3]������ [4]������ [5]���� >> ");
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
				System.out.println("���α׷� ����");
				break;
			}
			if (input != 2) {
				System.out.println(printMusicInfo(m));
			}
		}

	}

	
	// �ݺ��Ǵ� �� ������ �巡���ؼ� ������ Ŭ�� refactor -> Extract method�� ���ؼ� ���� �żҵ�� ���� ���� ���� �� �� �ִ�.
	private static String printMusicInfo(musicclass m) {
		return m.getMusicName() + ", " + m.getSinger() + ", " + changeTime(m);
	}

	private static String changeTime(musicclass m) {
		return m.getPlayTime() / 60 + "��" + m.getPlayTime() % 60 + "��";
	}

}
