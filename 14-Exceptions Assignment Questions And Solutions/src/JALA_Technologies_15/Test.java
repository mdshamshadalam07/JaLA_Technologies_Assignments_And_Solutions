/*
  15. Write a program to generate NullPointerException.
 -----------------------------------------------------
 */

package JALA_Technologies_15;

public class Test {
	public static void main(String[] args) {
		 
        Test t = initT();
         
        t.Example("Hi");
         
    }
 
    private static Test initT() {
        return null;
    }
 
    public void Example(String s) {
        System.out.println(s.toLowerCase());
    }
}
