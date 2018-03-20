
public class BoxTest48 {
	public static void main (String args[]){
		Box48 obj1 = new Box48(10,20,50);
		Box48 obj2 = new Box48(10,30,50);
		
		Box48 largest = obj1.whosLargest(obj1, obj2);
		System.out.println("("+largest.width + "," +largest.height + "," + largest.length + ")");
	}
}
