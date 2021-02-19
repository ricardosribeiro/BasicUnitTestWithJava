package aula01;

public class calculadora {
		
	public String calcular(int operacao, double valor1, double valor2) {
	
		try {
			
				validarOperacao(operacao);
				
				double resultado = 0;
				
				switch (operacao) {
				case 1:		
					resultado = somar(valor1, valor2);
					break;
				case 2:		
					resultado = subtrair(valor1, valor2);
					break;
				case 3:		
					resultado = multiplicar(valor1, valor2);
					break;
				case 4:		
					resultado = dividir(valor1, valor2);
					break;		
				}
				
				return String.valueOf(resultado);
			
		}	
		catch (Exception e) 
		{
			return e.getMessage();
		}
				
	}
	
	private double somar(double n1, double n2) {
		return n1+n2;
	}
	
	private double subtrair(double n1, double n2) {
		if(n1>n2) {
			return n1-n2;
		}
		return n2-n1;
		
	}
	
	private double multiplicar(double n1, double n2) {
		return n1*n2;
	}
	
	private double dividir(double n1, double n2) throws Exception {
		if(n1==0) {
			throw new Exception("NÃO FOI POSSÍVEL REALIZAR A OPERAÇÃO");		
		}
		else {
			return n1/n2;
		}
		
			
	}
	
	private void validarOperacao(int operacao) throws Exception {

		if(operacao <= 0 || operacao >=5 ) 		
			throw new Exception("OPÇÃO INVÁLIDA");					
			
	}
	

}
