
public class Box48 {
	int width, height, length;
	int volume;

	Box48(int w, int h, int l) {
		width = w;
		height = h;
		length = l;
		volume = w * h * l;
	}

	Box48 whosLargest(Box48 box1, Box48 box2) {
		if(box1.volume > box2.volume)
			return box1;
		else
			return box2;
	}
}
