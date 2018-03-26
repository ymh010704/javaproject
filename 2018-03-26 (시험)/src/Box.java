
public class Box {
	int width;
	int height;
	int length;
	boolean empty;

	public Box() {
		width = 0;
		height = 0;
		length = 0;
		empty = true;
	}

	public Box(int width, int height, int length) {
		this.width = width;
		this.height = height;
		this.length = length;
		empty = true;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
