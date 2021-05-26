/*
    1. Create an ArrayList of type String with 10 string elements. Add 10 string elements to
				ArrayList and perform the below operations
				Add an element to the ArrayList
				Iterate through the ArrayList by using Iterator object
				Add an element at a specific index
				Remove an element from the ArrayList, Remove at an index
				Update the element at a specific index
				Check the element is present at a particular index
				Get an element at a particular index
				Find out the size of the ArrayList
				Check the given element is present in the ArrayList
				Remove all elements of the ArrayList
---------------------------------------------------------------------------------------------------------
 */

package JALA_Technologies_01;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraysListExample {

	public static void main(String args[]) {

		ArrayList<String> alist1 = new ArrayList<String>();
		alist1.add("Sham");
		alist1.add("Raj");
		alist1.add("Luckey");
		alist1.add("Patna");
		alist1.add("Angel");
		alist1.add("Tommy");
		alist1.add("Gaya");
		alist1.add("Prince");
		alist1.add("Pens");
		alist1.add("Books");

		System.out.println("------------------------------- Print 10 String Elements -----------------------------------");

		// Traversing list through Iterator
		Iterator itr = alist1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();

		// Removing a specific element from HashSet.
		alist1.remove("Sham");
		System.out.println("--------------------------- List of Elements after removing Sham -------------------------");
		System.out.println(alist1);
		
		System.out.println();

		ArrayList<String> alist = new ArrayList<String>();
		System.out.println("------------- List of Elements After Adding Elements from Existing Collection ---------------");
		alist1.add(3, "Pink");
		alist1.add(9, "Red");
		alist.addAll(alist1);
		
		alist.add(5, "PinkYellow");
		System.out.println(alist);
		System.out.println();
		
	    System.out.println("---------------------------- List of 6 Element Removing ------------------------------------");
	    System.out.println(alist1);
	    System.out.println("removed : " + alist1.remove(6));
		System.out.println(alist1);
		System.out.println();
		
		System.out.println("--------------------------------- After Updation Check -------------------------------------");
		System.out.println(alist1);
		System.out.println("Update : "+ alist1.set(0, "Vams"));
		System.out.println(alist1);
		System.out.println();
		
		System.out.println("----------------------------- Check Element At 1 Particular Index -------------------------");
		System.out.println("Check Element At 1 : " + alist1.indexOf("Vams"));
		System.out.println(alist1.get(1));
		System.out.println();
		
		System.out.println("------------------------------ Get Element From Particular Index --------------------------");
		System.out.println("Get Element : " + alist1.get(5));
		System.out.println();
		
		System.out.println("----------------------------- Find Out The Size of ArrayList ------------------------------");
		System.out.println(alist1.size());
		System.out.println();
		
		System.out.println("----------------------- Check Element At Particular Index is There or Not ------------------");
		System.out.println("Check Element At : " + alist1.contains("Vams"));
		System.out.println();
		
		System.out.println("--------------------------- Removed All Elements From Arraylist Alist1 -----------------------------");
		System.out.println("Removed : " + alist1.removeAll(alist1));
		System.out.println();

		System.out.println("---------------------- List of Elements After All Removing Elements From Alist -------------");
		System.out.println("Removed All : " + alist.removeAll(alist));
		System.out.println(alist);
	}
}