package _05_class;

public class Rectangle {

	private int width;
	private int height;
	private static int size = 0;
	public static Rectangle createRectangle(String input) {
		String[] rectVal = input.split(" ");
		if (rectVal.length != 2) {
			throw new IllegalArgumentException("정확히 두 개의 숫자를 입력해야 합니다.");
		}
		int width = Integer.parseInt(rectVal[0]);
		int height = Integer.parseInt(rectVal[1]);
		if (width == 0 && height == 0) {
			return null;
		}
		if (width <= 0 || height <= 0) {
			throw new IllegalArgumentException("가로 세로는 양수이여야 합니다.");
		}
		size += 1;
		return new Rectangle(width, height);
	}
	private Rectangle(int width, int height) {
		setWidth(width);
		setHeight(height);
	}
	public int getWidth() {
		return this.width;
	}
	private void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return this.height;
	}
	private void setHeight(int height) {
		this.height = height;
	}
	public int getArea() {
		return this.width * this.height;
	}
	public static int getSize() {
		return size;
	}
}
