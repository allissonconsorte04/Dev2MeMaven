package br.com.dev2me;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void deveriaSomarDoisValoresPassados() {
		int valora = 2;
		int valorb = 2;
		int soma = 0;
		
		Calculator calc = new CalculatorImpl();
		soma = calc.sum(valora, valorb);
		
		assertEquals(soma, 4);
		
	}
	
	@Test
	public void deveriaSubtrairDoisValoresPassados() {
		int valora = 4;
		int valorb = 2;
		int sub = 0;
		
		Calculator calc = new CalculatorImpl();
		sub = calc.subtration(valora, valorb);
		
		assertEquals(sub, 2);
	}
	
	@Test
	public void deveriaMultiplicarDoisValoresPassados() {
		int valora = 2;
		int valorb = 2;
		int mult = 0;
		
		Calculator calc = new CalculatorImpl();
		mult = calc.multiplication(valora, valorb);
		
		assertEquals(mult, 4);
	}
	
	@Test
	public void deveriaDividirDoisValoresPassados() {
		int valora = 4;
		int valorb = 2;
		int div = 0;
		
		Calculator calc = new CalculatorImpl();
		div = calc.division(valora, valorb);
		
		assertEquals(div, 2);
	}
	
	@Test
	public void deveriaRetornarUmValorIgual() {
		int valora = 2;
		int valorb = 2;
		boolean igual = false;
		
		Calculator calc = new CalculatorImpl();
		igual = calc.equalsIntegers(valora, valorb);
		
		assertTrue(igual);
	}

}
