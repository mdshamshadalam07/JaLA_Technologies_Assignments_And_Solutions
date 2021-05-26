/*
  2. Create a HashMap with at least 10 key value pairs of the Student ID and Name
			Insert a Key value mapping into the map
			Fetch the value of a Key
			Create a clone/copy of HashMap
			Check if the given Key is in the Map
			Check if the value is in the Map
			Check if the map is empty
			Print the size of the Map to the console
			Print all the Keys of the map to the console
			Print all the Keys of the map to the console
			Remove a specific Key-value pair
			Copy all the elements of the Map to another Map
----------------------------------------------------------------------------------------------------
 */

package JALA_Technologies_02;

import java.util.HashMap;

public class Student {

	public static void main(String[] args) {

		// Create an empty hash map
		HashMap<Integer, String> map = new HashMap<>();

		// Add elements to the map
		map.put(10, "Vishal");
		map.put(20, "Sachin");
		map.put(30, "Vaibhav");
		map.put(40, "Rani");
		map.put(50, "Sangita");
		map.put(60, "Kuku");
		map.put(70, "Rohit");
		map.put(80, "Shereya");
		map.put(90, "Nanand");
		map.put(100, "Pankaj");

		System.out.println(
				"-------------------------------- Size of Elements 10 Student ID and Student Name ---------------------------------");
		System.out.println();
		System.out.println("Size of Map is : " + map.size());
		System.out.println(map);
		System.out.println();
		System.out.println();

		// clone/copy
		HashMap<Integer, String> clonedMap = (HashMap<Integer, String>) map.clone();
		System.out.println("-------------------------------- Create a clone/copy of HashMap ----------------------------------------------");
		System.out.println("Clone/Copy Map : " + clonedMap);
		System.out.println();
		System.out.println();

		// Same as StudentMap
		System.out.println(
				"---------------------------------- Check if the given Key is in the Map ----------------------------------------------");
		System.out.println("Check the given Key Map : " + clonedMap);
		System.out.println();
		System.out.println();

		// Checking for the emptiness of Map
		System.out.println(
				"----------------------------------------- Checking if the Map is Empty ---------------------------------------------------");
		System.out.println("Map of Empty? " + map.isEmpty());
		System.out.println();
		System.out.println();

		// Displaying the size of the map
		System.out.println(
				"-------------------------------- Print the size of the Map to the console --------------------------------------------");
		System.out.println("Size of Map " + map.size());
		System.out.println();
		System.out.println();

		System.out.println(
				"----------------------- Print all the Keys of the map to the console ----------------------------------------- ");

		for (Integer key : map.keySet()) {

			System.out.println("key: " + key);
		}

		System.out.println();
		System.out.println();
		
		// for (String value : map.values()) { System.out.println("value: " + value); }

		System.out.println(
				"---------------------------------------- Remove a specific Key-value pair ----------------------------------------");
		// Removing the key-value pair
	    String s = (String) map.remove(20);
	    System.out.println("Removed : " + s);
	    System.out.println();
	    System.out.println();
	    
	    System.out.println("--------------------------- Copy all the elements of the Map to another Map --------------------------------------");
	
	    // copying all elements to another Map
	    HashMap<Integer, String> another_map = new HashMap<Integer, String>();
	    another_map.putAll(map);
	    System.out.println("Copy all elements to another Map : " + another_map );
	    System.out.println();
	}
}