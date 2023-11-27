package _05_class._interface;
import _05_class._interface.Mp3Player;
import _05_class._interface.CdPlayer;

public class MusicPlayer {

	public static void main(String[] args) {
		Mp3Player mp3 = new Mp3Player();
		mp3.play("아이유 밤편지");
		mp3.stop();
		
		CdPlayer cdplayer = new CdPlayer();
		
		cdplayer.play("아이유 꽃갈피");
		cdplayer.stop();
	}

}
