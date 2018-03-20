
public class Box49 {
	int width, height, length;

	Box49(int w, int h, int l) {
		width = w;
		height = h;
		length = l;
	}
	
	boolean isSameBox(Box49 obj2) {
		if((obj2.width == width) & (obj2.height == height) & (obj2.length == length))
			return true;
		else
			return false;
	}
}
