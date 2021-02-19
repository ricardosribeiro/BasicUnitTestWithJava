package caculadoraCalcular;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import aula01.calculadora;

public class calculadoraCalcularTests {
	
	@Test
	public void DeveRetornarResultadoValidoParaSoma() {
		
		//Arrange
		calculadora calc = new calculadora();
		
		//Act
		var resultadoSoma = calc.calcular(1,10,5);
		var resultadoSomaEsperado = "15.0";
					
		//Assert			
		assertEquals(resultadoSomaEsperado, resultadoSoma);
				
	}
	
	@Test
	public void DeveRetornarResultadoValidoParaSubtracao() {
		//Arrange
		calculadora calc = new calculadora();
		
		//Act
		var resultadoSubtracao = calc.calcular(2,10,5);
		var resultadoSubtracaoEsperado = "5.0";
		
		//Assert
		assertEquals(resultadoSubtracaoEsperado, resultadoSubtracao);		
	}
	
	@Test
	public void DeveRetornarResultadoValidoParaMultiplicacao() {
		//Arrange
		calculadora calc = new calculadora();
		
		//Act
		var resultadoMultiplicacao = calc.calcular(3,10,5);
		var resultadoMultiplicacaoEsperado = "50.0";
		
		//Assert
		assertEquals(resultadoMultiplicacaoEsperado, resultadoMultiplicacao);		
		
	}
	
	@Test
	public void DeveRetornarResultadoValidoParaDivisao() {
		//Arrange
		calculadora calc = new calculadora();
		
		//Act
		var resultadoDivisao = calc.calcular(4,10,5);
		var resultadoDivisaoEsperado = "2.0";
		
		//Assert
		assertEquals(resultadoDivisaoEsperado, resultadoDivisao);
				
	}
	
	@Test
	public void DeveRetornarErroDadoOpcaoInvalida() {
		//Arrange
		calculadora calc = new calculadora();
		
		//Act
		var resultadoOpcaoInvalida = calc.calcular(8,10,5);
		var resultadoOpcaoInvalidaEsperado = "OPÇÃO INVÁLIDA";
		
		//Assert
		assertEquals(resultadoOpcaoInvalidaEsperado, resultadoOpcaoInvalida);
	}
	
	@Test
	public void DeveRetornarErroDadoDivsorIgualZero() {
		//Arrange
		calculadora calc = new calculadora();
		
		//Act
		var resultadoDivisaoZero = calc.calcular(4,0,5);
		var resultadoDivisaoZeroEsperado = "NÃO FOI POSSÍVEL REALIZAR A OPERAÇÃO";
		
		//Assert
		assertEquals(resultadoDivisaoZeroEsperado, resultadoDivisaoZero);
	
	}
	
}
