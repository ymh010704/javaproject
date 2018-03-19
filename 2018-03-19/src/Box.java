
public class Box {
	private int width;
	private int height;
	private int length;
	private int volume;
	
	public int getVolume(){
		return volume;
	}
	
	Box(int w, int h, int l){
		width = w;
		height = h;
		length = l;
		volume = width * height * length;
	}
}
