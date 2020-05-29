import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Link {

	public static void main(String[] args) {
	LinkedList<String> linkedlist = new LinkedList<String>();
    linkedlist.add("Durga");
    linkedlist.add("Jaswanth");
    linkedlist.add("Musunuri");
    System.out.println("After adding all elements = " + linkedlist);
    linkedlist.remove(1);
    System.out.println("After removing element at index[1] = " + linkedlist);
    linkedlist.add(1, "Jaswanth");
    System.out.println("After adding element at index[1] = " + linkedlist);
    System.out.println("Checking whether list contains DURGA or not = " + linkedlist.contains("Durga"));
    linkedlist.addLast("INDIA");
    System.out.println("After Adding element at  last position = " + linkedlist);
    Iterator it = linkedlist.iterator();
    while(it.hasNext()) {
    	if(it.next() == "Durga" ) {
    		System.out.println("We found Durga in the list");
    	 
    } 
    }
	
		
	}	
	}
