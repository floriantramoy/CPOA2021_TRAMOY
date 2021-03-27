package fr.iut.modele;

import fr.iut.interfaces.IObserver;
import fr.iut.miscs.Observable;

public class Bilan extends Observable {
	
	public Bilan() {
		super();
		System.out.println("dans constructeur Bilan");
		
	}
	
	public void setChange() {
		System.out.println("dans methode setChange");
	}



}
