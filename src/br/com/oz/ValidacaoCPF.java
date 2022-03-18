package br.com.oz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class ValidacaoCPF {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		// padr�o do Regex criado em que queremos validar o texto de acordo com a formata��o desejada
		String regex = "\\b([0-9]{3})\\.([0-9]{3})\\-([0-9]{2})";
		
		
		// variavel que receber� a string a ser validada
		System.out.println("Digite deu CPF com a pontua��o >>>");
		String cpf = sc.next();
		
		
		
		// chamammos a classe que vai compilar o padr�o do regex criado
		Pattern validacao = Pattern.compile(regex);
		
		
		
		// classe respons�vel por fazer a valida��o do regex na nossa variavel
		Matcher matche = validacao.matcher(cpf);
		
	
			
		if (matche.find() ==  false) {
			
			System.out.println("Por favor, digite o CPF de acordo com o padr�o");
				} else {
			System.out.println("CPF " + cpf +" Devidamente correto");
			
		}
		
		
	}
	
	
	
}
