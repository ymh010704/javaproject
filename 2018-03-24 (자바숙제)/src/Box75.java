
public class Box75 {
	private int width, height, length;
	private boolean empty = false;
	
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
	
	public boolean isEmpty() {
		return empty;
	}
	
	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
	
	public Box75() {
		width = 0;
		height = 0;
		length = 0;
		empty = true;
	}

	public Box75(int w, int h, int l) {
		width = w;
		height = h;
		length = l;
		empty = true;
	}
}
