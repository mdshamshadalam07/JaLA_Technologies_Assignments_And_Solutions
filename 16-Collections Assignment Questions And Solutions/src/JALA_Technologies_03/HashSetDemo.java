/*
  3. Create a HashSet with at least 10 elements of type String
     Write program covering all the operations of HashSet.
------------------------------------------------------------------------------------------------------
 */

package JALA_Technologies_03;

import java.util.*;

public class HashSetDemo {
  
	public static void main(String[] args) {
		
        HashSet<String> h = new HashSet<String>();
  
        // Adding elements into HashSet using add()
        h.add("India");
        h.add("Australia");
        h.add("South Africa");
        h.add("India"); 
        h.add("Shamshad");
        h.add("Ram");
        h.add("yellow");
        h.add("Diwakar"); 
        h.add("Qamar");
        h.add("Saif"); 
  
        // Displaying the HashSet
        System.out.println("Print Least 10 Elements....");
        System.out.println();
        System.out.println(h);
    }
} 