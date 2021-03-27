package fr.iut.vue;

import fr.iut.interfaces.IObserver;
import fr.iut.miscs.Observable;


public class UIPhoneGraphe implements IObserver{
	
	private int num;
	
	public int getNum() {
		return num;
	}
	
	public UIPhoneGraphe(int num) {
		System.out.println("Je suis un écran de type Phone");
		this.num = num;
	}
	@Override
	public void update (Observable obj) {
		System.out.println("dans methode update de Phone Numero" + num);
	
		}
}

