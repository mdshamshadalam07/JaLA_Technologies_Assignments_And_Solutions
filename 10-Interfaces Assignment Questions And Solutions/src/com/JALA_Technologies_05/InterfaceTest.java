/*
 5. Create two interfaces with the same method (same signature) in both the interfaces.
    Implement these two interfaces in one class. Call the method.
    -----------------------------------------------------------------------------------------
 */

package com.JALA_Technologies_05;

interface Gift {
	void present();
}

interface Guest {
	void present();
}

public class InterfaceTest implements Gift, Guest {

	public static void main(String[] args) {
		
		InterfaceTest it = new InterfaceTest() {
			
			@Override
			public void present() {
				System.out.println("Rahul is best Boy");
			}
		};
		
		it.present(); 

		((Gift) it).present(); 
		((Guest) it).present(); 

		Gift johnnyAsGift = (Gift) it;
		johnnyAsGift.present(); 

		Guest johnnyAsGuest = (Guest) it;
		johnnyAsGuest.present(); 
	}

	@Override
	public void present() {
	}
}
