package fr.iut.miscs;

import fr.iut.interfaces.IObserver;

import java.util.ArrayList;
import java.util.List;

public class Observable{
	
	private int num;
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}


	private List<IObserver> observers;
	
	
	public Observable() {
		// initialisation de la collection
		System.out.println("Dans constructeur de observable");
		observers = new ArrayList<>();
	}
	
	public void notify1() {
		System.out.println("dans methode notify1");
	}

	public List<IObserver> getObservers() {
		return observers;
	}

	public void setObservers(List<IObserver> observers) {
		this.observers = observers;
	}




}
