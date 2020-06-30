package exam02;

import javazoom.jl.player.MP3Player;

public class MusicPlayer {
	
	musicclass[] musicArr = new musicclass[12];
	MP3Player mp3 = new MP3Player();
	int curIndex = 0;
	
	public MusicPlayer() {
		musicArr[0] = new musicclass("Dalla Dalla", "Itzy", 100, "C:\\music\\Itzy - Dalla Dalla.mp3");
		musicArr[1] = new musicclass("JENNIE", "SOLO", 120, "C:\\music\\JENNIE - SOLO.mp3");
		musicArr[2] = new musicclass("깡", "Rain", 140, "C:\\music\\Rain - 깡.mp3");
		musicArr[3] = new musicclass("2002", "Anne Marie", 140, "C:\\music\\Anne Marie - 2002.mp3");
		musicArr[4] = new musicclass("bad guy", "Billie Eilish", 140, "C:\\music\\Billie Eilish - bad guy.mp3");
		musicArr[5] = new musicclass("Circle of Life", "Carmen Twillie, Lebo M.", 140, "C:\\music\\Carmen Twillie, Lebo M. - Circle of Life.mp3");
		musicArr[6] = new musicclass("벌써 12시", "CHUNG HA", 140, "C:\\music\\CHUNG HA - 벌써 12시.mp3");
		musicArr[7] = new musicclass("Let It Go", "Idina Menzel", 140, "C:\\music\\Idina Menzel - Let It Go.mp3");
		musicArr[8] = new musicclass("A Whole New World", "Mena Massoud, Naomi Scott", 140, "C:\\music\\Mena Massoud, Naomi Scott - A Whole New World.mp3");
		musicArr[9] = new musicclass("Ring Ding Dong", "SHINee", 140, "C:\\music\\SHINee - Ring Ding Dong.mp3");
		musicArr[10] = new musicclass("FANCY", "TWICE", 140, "C:\\music\\TWICE - FANCY.mp3");
		musicArr[11] = new musicclass("NO ONE", "이하이", 140, "C:\\music\\이하이 - NO ONE.mp3");
		
	}
	
	public musicclass play() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(musicArr[curIndex].getMusicPath());
		return musicArr[curIndex];
	}
	
	public musicclass nextPlay() {
		curIndex++;
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		if(curIndex==musicArr.length) {
			System.out.println("다음 곡이 없습니다. ");
			curIndex = 0;
		}
		mp3.play(musicArr[curIndex].getMusicPath());
		return musicArr[curIndex];
	}
	
	public musicclass prePlay() {
		curIndex--;
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		if(curIndex<0) {
			System.out.println("이전 곡이 없습니다. ");
			curIndex++;
		}
		mp3.play(musicArr[curIndex].getMusicPath());
		return musicArr[curIndex];
	}
	
	public String stop() {
		mp3.stop();
		return "노래가 정지되었습니다. ";
	}
}
