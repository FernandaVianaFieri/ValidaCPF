package br.com.oz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class ValidacaoCPF {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		// padrão do Regex criado em que queremos validar o texto de acordo com a formatação desejada
		String regex = "\\b([0-9]{3})\\.([0-9]{3})\\-([0-9]{2})";
		
		
		// variavel que receberá a string a ser validada
		System.out.println("Digite deu CPF com a pontuação >>>");
		String cpf = sc.next();
		
		
		
		// chamammos a classe que vai compilar o padrão do regex criado
		Pattern validacao = Pattern.compile(regex);
		
		
		
		// classe responsável por fazer a validação do regex na nossa variavel
		Matcher matche = validacao.matcher(cpf);
		
	
			
		if (matche.find() ==  false) {
			
			System.out.println("Por favor, digite o CPF de acordo com o padrão");
				} else {
			System.out.println("CPF " + cpf +" Devidamente correto");
			
		}
		
		
	}
	
	
	
}
