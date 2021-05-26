/*
 5. Try to call the constructor multiple times with the same object.
 ------------------------------------------------------------------------
 */

package com.JALA_Technologies_05;

class Example {
	
	int eid;
	String ename;
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Example [eid=" + eid + ", ename=" + ename + "]";
	}
	
}

public class Test {
  
	Test(Example e) {
		System.out.println(e);
	}
	
	public static void main(String args[]) {
		
		Example e1=new Example();
		e1.setEid(100);
		e1.setEname("Luckey");
		
		Example e2=new Example();
		e2.setEid(111);
		e2.setEname("Rome");
		
		Example e3=new Example();
		e3.setEid(222);
		e3.setEname("Boum");
		
		Test t=new Test(e1);
		Test t1=new Test(e2);
		Test t2=new Test(e3);	
	}
}

