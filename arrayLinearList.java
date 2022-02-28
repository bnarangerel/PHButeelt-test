package lab01;
import java.util.*; 

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
	
	public static void main(String[] args);
	{
	ArrayList<String> al = new ArrayList<String> ();
	al.add("bla");
	al.add("blabla");
	String s1 = al.get(0);
	String s2 = al.get(1);
	System.out.println(s1);
        System.out.println(s2);
	}
	
	
	
}
