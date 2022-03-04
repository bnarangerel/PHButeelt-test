package lab01;
import java.util.*; 
import java.util.Scanner;

public class arrayLinearList {
	
	protected Object [] element;
	protected int size;
	
	public arrayLinearList(int size) {
		if(size >= 0){
			element = new Object [size];
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
			for (int i = index + 1; i < size; i ++) element[i - 1] = element[i];
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
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		MyArrayLinearList list = new MyArrayLinearList();
		
		boolean garah = false;
		
		System.out.println("Та өөрийн linearlist дээ ямар үйлдэл хийхийг хүсэж байна.");
		System.out.println("1.add\n2.remove\n3.indexOf\n4.get\n5.isEmpty\n6.size\n7.toString\n8.exit");
		
		while(garah == false) {
			System.out.println("Та өөрийн linearlist дээ ямар үйлдэл хийхийг хүсэж байна.");
			int songolt = sc.nextInt();
			switch(songolt) {
				case 1: //add
					System.out.println("Та нэмэх элементийнхээ индексийг оруулна уу: ");
					int index = sc.nextInt();
					System.out.println("Та нэмэх элементийнхээ утгыг оруулна уу: ");
					int utga = sc.nextInt();
				
					if(index > -1 && index <= list.size) {
						list.add(index, utga);
						System.out.println("Амжилттай нэмлээ.");
					} else System.out.println("Та элемент нэмэхдээ одоо байгаа linearlist-ын уртаас бага индекс оруулна уу!");
				   	break;
				case 2: //remove
					if(list.size > 0) {
						System.out.println("Та устгах элементийнхээ индексийг оруулна уу: ");
						index = sc.nextInt();
						if(index > -1 && index < list.size) {
							list.remove(index);
							System.out.println("Амжилттай устгалаа.");
						} else System.out.println("Таны өгсөн индекст элемент байхгүй байна.");
					} else System.out.println("Linearlist-д утга байхгүй байна. Утга нэмнэ үү!");
					break;
				case 3: //indexOf
					if(list.size > 0) {
						System.out.println("Та аль утгыг аль индекст байгааг мэдэхийг хүсэж байна вэ: ");
						utga = sc.nextInt();
						if(list.indexOf(utga) != -1) System.out.println(list.indexOf(utga));
						else System.out.println("Таны өгсөн утга linearlist-д байхгүй байна.");
					} else System.out.println("Linearlist-д ямар ч утга байхгүй байна. Утга нэмнэ үү!");
					break;
				case 4: //get
					if(list.size > 0) {
						System.out.println("Та аль индекст байгаа утгыг мэдэхийг хүсэж байна вэ:");
						index = sc.nextInt();
						if(index > -1 && index < list.size)System.out.println(list.get(index));
						else System.out.println("Таны өгсөн индексийн утга буруу байна.");
					} else System.out.println("Linearlist-д ямар ч утга байхгүй байна. Утга нэмнэ үү!");
					break;
				case 5: //isEmpty
					if(list.isEmpty()) System.out.println("Linearlist хоосон байна.");
					else System.out.println("LinearList хоосон биш байна.");
					break;
				case 6: //size
					System.out.println("Linearlist-ийн хэмжээ: " + list.size);
					break;
				case 7: //toString
					if(list.size > 0) {
						System.out.println("Linearlist-эд: " + list.toString());
					} else System.out.println("Linearlist-д ямар ч утга байхгүй байна. Утга нэмнэ үү!");
					break;
				case 8: //exit
					garah = true;
					sc.close();
					break;
			}
	}
	
	
	
}
