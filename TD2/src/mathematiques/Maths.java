package mathematiques;

import exceptions.MathsExceptions;
import interfaces.IMaths;

public class Maths implements IMaths {

	@Override
	public int addition(int a, int b) {
		// TODO Stub de la méthode généré automatiquement
		return a + b;
	}

	@Override
	public int soustraction(int a, int b) {
		// TODO Stub de la méthode généré automatiquement
		return a - b;
	}

	@Override
	public int multiplication(int a, int b) {
		// ecrire l'implémentation de multiplication en utilisant que des additions
		// Tester tous les cas possibles (positifs, négatifs, 0)
		int c = 0;
		if (a >= b){	
			for(int i=0; i < b; i++) {
				addition(c,a);
		} }else if(a < b){
			for(int i=0; i < a; i++) {
				addition(c,b);
		}
			
	}
			
		return c;
	}
	@Override
	public double division(int a, int b) throws MathsExceptions {
		// TODO Stub de la méthode généré automatiquement
		if (b == 0) {
			throw new MathsExceptions("Division par zero impossible");
		}
		try {
			return a / b;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new MathsExceptions(e.getMessage());
		}

	}
}
