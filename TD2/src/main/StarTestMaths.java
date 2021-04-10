package main;

import interfaces.IMaths;
import mathematiques.Maths;

public class StarTestMaths {

	public static void main(String[] args) {
		IMaths maths = new Maths();
		System.out.println(maths.addition(2, 3));

	}

}
