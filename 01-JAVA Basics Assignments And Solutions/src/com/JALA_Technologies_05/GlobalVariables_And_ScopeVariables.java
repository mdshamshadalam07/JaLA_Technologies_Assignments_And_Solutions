/*
     5. Define the local and Global variables with the same name and print both variables and
        understand the scope of the variables.
    -------------------------------------------------------------------------------------------
 */

package com.JALA_Technologies_05;

public class GlobalVariables_And_ScopeVariables {
	
	// local Variable
	public int add(){
		
	     int a = 4;
	     int b = 5;
	     
	     System.out.println("a : " + a);
	     System.out.println("b : " + b);
    	 return a+b;
    	 
	   }   

	    // global variables
	    int c = 4;
		int d = 5;
		
		public int Test(){
		return c+d;
		}     
	
		// Scope Variables
	    static int x = 11;
	    private int y = 33;
	    
	    public void method1(int x)
	    {
	    	GlobalVariables_And_ScopeVariables gs = new GlobalVariables_And_ScopeVariables();
	    	
	    	System.out.println("Print the Local Variable");
	    	gs.add();
	    	System.out.println();
	    	
	    	System.out.println("Print Global Variables");
	    	System.out.println("c: " + gs.c);
	    	System.out.println("d: " + gs.d);
	    	System.out.println();
	    	
	    	System.out.println("Scope Variables");
	        this.x = 22;
	        y = 44;
	
	        System.out.println("Test.x: " + gs.x);
	        System.out.println("gs.x: " + gs.x);
	        System.out.println("gs.y: " + gs.y);
	        System.out.println("y: " + y);
	    }
	 
	    public static void main(String args[])
	    {
	    	GlobalVariables_And_ScopeVariables gs = new GlobalVariables_And_ScopeVariables();
	        gs.method1(5);
	    }


}
