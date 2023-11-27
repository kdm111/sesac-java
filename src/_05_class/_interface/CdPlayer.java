package _05_class._interface;

public class CdPlayer implements Music{
	private String album;

	@Override
	public void play(String album) {
		this.album = album;
		System.out.println("=== " + this.getClass().getSimpleName() + " ===");
		System.out.println("CD 플레이어에서 \'" + this.album + "\' 앨범을 실행합니다.");
	}
	@Override
	public void stop() {
		System.out.println("CD 플레이어에서 \'" + this.album + "\' 앨범을 정지합니다.");
	}
}
