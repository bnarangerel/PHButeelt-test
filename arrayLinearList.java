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
	public boolean isEmpty(){
		if(size == 0) return true;
		else return false;
	}
	public int size(){
		return size;
	}
   	private boolean checkIndex(int index){
      		if (index < 0 || index >= size) return false;
		else return true;
   	}
	public Object get(int index){
      		if(checkIndex(index)) return element[index];
		else return -1;
   	}
   	public int indexOf(Object theElement){
      		for (int i = 0; i < size; i++)
         	if (element[i].equals(theElement)) return i;
      		return -1;
   	}      
   	public Object remove(int index){
     		if(checkIndex(index)){
			Object removedElement = element[index];
			for (int i = index + 1; i < size; i ++)
			 element[i - 1] = element[i];

			element[--size] = null;   
			return removedElement;
		}
   	}
   	public void add(int index, Object theElement){
   		if(checkIndex(index)){
      			if (size == element.length) element = ChangeArrayLength.changeLength1D(element, 2 * size);
      			for (int i = size - 1; i >= index; i--) element[i + 1] = element[i];
   				element[index] = theElement;
  				size++;
		}
   	}
   	public String toString(){
      		StringBuffer s = new StringBuffer("["); 
   
      		for (int i = 0; i < size; i++)
         	if (element[i] == null) s.append("null, ");
         	else s.append(element[i].toString() + ", ");
      		if (size > 0) s.delete(s.length() - 2, s.length());
      		s.append("]");
      		return new String(s);
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
