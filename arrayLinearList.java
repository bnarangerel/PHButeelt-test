package lab01;

public class arrayLinearList {
	
	private Object [] element;
	private int size;
	
	public arrayLinearList(int hemjee) {
		if(hemjee >= 0){
			element = new Object [hemjee];
		}
	}
	public arrayLinearList(){
		this(10);
	}
}
