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
			System.out.println("Erro: Nenhum parâmetro foi passado. " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Erro: O parâmetro não é um número válido. " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Erro: Divisão por zero não permitida " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Erro: Tentativa de acessas método em objeto nulo. " + e.getMessage());
		} finally {
			System.out.println("Bloco finally executado: limpeza ou encerramento de recursos.");
		}
	}
}

/*
		 * esse trecho de codigo pode lancar as seguintes exceções (RuntimeExceptions)
		 * ArrayIndexOutOfBoundsException 
		 * NumberFormatException
		 * ArithmeticException
		 * NullPointerException
		 */