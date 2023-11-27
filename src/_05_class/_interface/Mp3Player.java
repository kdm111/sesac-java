package _05_class._interface;

public class Mp3Player  implements Music {
	private String song;

	@Override
	public void play(String song) {
		this.song = song;
		System.out.println("=== " + this.getClass().getSimpleName() + " ===");
		System.out.println("MP3 플레이어에서 \'" + this.song + "\' 음악을 실행합니다.");
	}
	@Override
	public void stop() {
		System.out.println("MP3 플레이어에서 \'" + this.song + "\' 음악을 정지합니다.");
	}
}
