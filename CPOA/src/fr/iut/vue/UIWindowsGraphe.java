package fr.iut.vue;

import fr.iut.interfaces.IObserver;
import fr.iut.miscs.Observable;


public class UIWindowsGraphe implements IObserver{
	
	private int num;
	
	public int getNum() {
		return num;
	}
	
	public UIWindowsGraphe(int num) {
		this.num = num;
	}
	
	public void update (Observable obj) {
		System.out.println("dans methode update");
	
		}



}
