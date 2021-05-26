/*
  6. Create an interface with a default method and implement it in a class. Do not provide
     implementation to the default method and call the method.
     -----------------------------------------------------------------------------------------------
 */

package com.JALA_Technologies_06;

interface Vehicle {

	void cleanVehicle();

	default void startVehicle() {
		System.out.println("Vehicle is starting");
	}
}

public class OldInterfaceImpl implements Vehicle {
	@Override
	public void cleanVehicle() {
		System.out.println("Cleaning the vehicle");
	}

	public static void main(String args[]) {
		OldInterfaceImpl car = new OldInterfaceImpl();
		car.cleanVehicle();
		car.startVehicle();
	}
}