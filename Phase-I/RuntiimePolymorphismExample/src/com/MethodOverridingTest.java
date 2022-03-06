package com;

class Bike{
	void speed() {
		System.out.println("60km/hr");
	}
}
class Honda extends Bike{
	void color() {
		System.out.println("Gray");
	}
}

class Pulser extends Bike{
	void speed() {//this function is method overriding pulser dont like perents speed so it used its own speed
		System.out.println("90km/ph");
	}
	void color() {
		System.out.println("Black");
	}
}

class Tvs extends Bike{
	void speed() { 
		super.speed();// This one will call the super class ie. 60km/ph
		System.out.println("25km/ph");
	}
	void color() {
		System.out.println("Red");
	}
}

public class MethodOverridingTest {
	public static void main(String[] args) {
		Honda hh = new Honda();
		hh.speed();
		hh.color();
		
		Pulser pu = new Pulser();
		pu.speed();
		pu.color();
		
		Tvs tv = new Tvs();
		tv.speed();
		tv.color();
		
	}

}
