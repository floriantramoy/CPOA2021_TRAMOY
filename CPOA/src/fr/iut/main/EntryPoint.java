package fr.iut.main;

import fr.iut.interfaces.IObserver;
import fr.iut.miscs.Observable;
import fr.iut.modele.Bilan;
import fr.iut.vue.UIPhoneGraphe;
import fr.iut.vue.UIWindowsGraphe;

public class EntryPoint {

	public static void main(String[] args) {
		// TODO Stub de la méthode généré automatiquement
		
		System.out.println("Hello World !");
		Observable observable = new Observable();
		System.out.println("----------------------------------------");
		Bilan bilan = new Bilan();
		bilan.setnumero(1);
		System.out.println("----------------------------------------");
		IObserver graphe1 = new UIWindowsGraphe(1);
		IObserver graphe2 = new UIPhoneGraphe(2);
		IObserver graphe3 = new UIWindowsGraphe(2);
		
		bilan.addObserver(graphe1);
		bilan.addObserver(graphe2);
		bilan.addObserver(graphe3);
		
		bilan.setChange();
		
		
	}

}
