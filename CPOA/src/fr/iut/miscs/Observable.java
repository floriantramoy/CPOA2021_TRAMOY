package fr.iut.miscs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import fr.iut.interfaces.IObserver;

public class Observable {
	// block de variables
	
<<<<<<< HEAD
	private int numero;
=======
	private List<IObserver> observers;
	private int num;
>>>>>>> branch 'main' of https://github.com/floriantramoy/CPOA2021_TRAMOY.git
	
<<<<<<< HEAD
	public int getnumero() {
		return numero;
=======
	// block getter/setters
	
	public int getNum() {
		return num;
>>>>>>> branch 'main' of https://github.com/floriantramoy/CPOA2021_TRAMOY.git
	}

	public void setnumero(int numero) {
		this.numero = numero;
	}
	
	public void setObservers(List<IObserver> observers) {
		this.observers = observers;
	}
	
	// Block de constructeurs
	
	public Observable(List<IObserver> observers) {
		this.observers = observers;
	}
	
	public Observable() {
		// initialisation de la collection
		System.out.println("Dans constructeur de Observable");
		observers = new ArrayList<>();
	}

	public List<IObserver> getObservers() {
		return observers;
	}
	
	// Block de méthodes

	public void notify1() {
		System.out.println("dans méthode notify1");
		for (IObserver iobserver : observers) {
		//iobserver.update(this);
		}
		
		Iterator<IObserver> it = this.observers.iterator();
		while (it.hasNext()) {
			it.next().update(this);
		}
	}
<<<<<<< HEAD

	

=======
	
	public void addObserver(IObserver o) {
		this.observers.add(o);
	}
>>>>>>> branch 'main' of https://github.com/floriantramoy/CPOA2021_TRAMOY.git

}
