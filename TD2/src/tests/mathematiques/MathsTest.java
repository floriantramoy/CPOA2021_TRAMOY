package tests.mathematiques;

import org.junit.Before;
import org.junit.Test;

import exceptions.MathsExceptions;
import interfaces.IMaths;
import junit.framework.Assert;
import mathematiques.Maths;

public class MathsTest {
	
	private IMaths maths;
	
	@Before	
	public void setUp() {
		this.maths = new Maths();
	}
	
	@Test
	public void testAdditionCasGeneralNombrePositif() {
		Assert.assertEquals(maths.addition(2, 3), 5);
	}
	
	@Test
	public void testAdditionCasGeneralNombreNégatif() {
		Assert.assertEquals(maths.addition(-2, -3), -5);
	}
	
	@Test
	public void testAdditionCasGeneralNombreSigneDifferent() {
		Assert.assertEquals(maths.addition(-2, 3), 1);
	}
	
	@Test
	public void testSoustractionCasGeneralNombrePositif() {
		Assert.assertEquals(maths.soustraction(2, 3), -1);
	}
	
	@Test
	public void testSoustractionCasGeneralNombreNégatif() {
		Assert.assertEquals(maths.soustraction(-2, -3), 1);
	}
	
	@Test
	public void testSoustractionCasGeneralNombreSigneDifferent() {
		Assert.assertEquals(maths.soustraction(-2, 3), -5);
	}
	
	@Test
	public void testMultiplicationCasGeneralNombrePositif() {
		Assert.assertEquals(maths.multiplication(2, 3), 6);
	}
	
	@Test
	public void testMultiplicationCasGeneralNombreNégatif() {
		Assert.assertEquals(maths.multiplication(-2, -3), 6);
	}
	
	@Test
	public void testMultiplicationCasGeneralNombreSigneDifferent() {
		Assert.assertEquals(maths.multiplication(-2, 3), -6);
	}
	
	@Test
	public void testDivisionCasGeneralNombrePositif() throws MathsExceptions {
		Assert.assertEquals(maths.division(4, 2), 2, 2);

	}
	
	@Test
	public void testDivisionCasGeneralNombreNégatif() throws MathsExceptions {
		Assert.assertEquals(maths.division(-4, -2), 2, 2);
	}
	
	@Test
	public void testDivisionCasGeneralNombreSigneDifferent() throws MathsExceptions {
		Assert.assertEquals(maths.division(-4, 2), -2, 2);
	}
	
	@Test(expected = MathsExceptions.class)
	public void testDivisionCasGeneralDenominateurNul() throws MathsExceptions {
		try {
			maths.division(4, 0);
		} catch (MathsExceptions e) {
			Assert.assertEquals(e.getMessage(),"Division par zero impossible");
			throw e;
		}
	
	
	}
}
