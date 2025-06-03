package br.unip.sicc.exceptions;

import br.unip.sicc.entidades.Produto;

public class TesteRuntimeExceptions{
	
	public static void main(String[] args) {
		
		try {
			System.out.println("Recuperando o primeiro parametro");	
			String parametro0 = args[0];	//ArrayIndexOutOfBoundsException 
			System.out.println(parametro0);
			
			System.out.println("Convertendo o parametro");	
			int divisor = Integer.parseInt(parametro0);		//NumberFormatException
			
			System.out.println("Dividindo pelo parametro");	
			int i = 1/divisor;		//ArithmeticException
			
			Produto mochila = new Produto("Mochila Grande", 50.0);
			mochila = null;
			
			mochila.getDescricao();		//NullPointerException
			
			System.out.println("Fim bloco try");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro: Nenhum par�metro foi passado. " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Erro: O par�metro n�o � um n�mero v�lido. " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Erro: Divis�o por zero n�o permitida " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Erro: Tentativa de acessas m�todo em objeto nulo. " + e.getMessage());
		} finally {
			System.out.println("Bloco finally executado: limpeza ou encerramento de recursos.");
		}
	}
}

/*
		 * esse trecho de codigo pode lancar as seguintes exce��es (RuntimeExceptions)
		 * ArrayIndexOutOfBoundsException 
		 * NumberFormatException
		 * ArithmeticException
		 * NullPointerException
		 */