package br.com.projeto_java_atv1;

import java.util.Random;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
	//Scan Nome Professor 1
		Scanner scan = new Scanner (System.in);
		Random  n1 = new Random();
		Professor Professor1 = new Professor();
		                         //Professor1.getMateria().getClass();
		
		System.out.println("---------------------------");
		System.out.println("DIGITE O NOME DO PROFESSOR:");
		System.out.println("---------------------------");
                                  //Professor1.setNome(scan.nextLine());
		
		String nomeProfessor1 = scan.nextLine();
		Professor1.setNome(nomeProfessor1);
		Professor1.setNumInscricao(n1.nextInt(5000));
		     
		
		                         //System.out.println(Professor1.getNome());
	
	//Scan Materia 1
		
		
		
		System.out.println("---------------------");
		System.out.println("DIGITE A MATERIA");
		System.out.println("---------------------");
		
		String nomeMateria1 = scan.nextLine();
		Professor1.getMateria().setNome(nomeMateria1);
		Professor1.getMateria().setCodigo(n1.nextInt(5000));
		
		     //System.out.println(Materia1.getNome());
		
		System.out.println("O NOME DO PRIMEIRO PROFESSOR �: " + Professor1.getNome() + ", E SEU NUMERO DE INSCRI�AO �: " + Professor1.getNumInscricao());
		System.out.println("O NOME DA MATERIA �: " + Professor1.getMateria().getNome() + ", E SEU CODIGO �: " + Professor1.getMateria().getCodigo());
		
	
	//Scan Nome Professor 2
		
		Professor Professor2 = new Professor();
	
		System.out.println("-----------------------------");
		System.out.println("DIGITE O NOME DO PROFESSOR:");
		System.out.println("-----------------------------");
		
		String nomeProfessor2 = scan.nextLine();
		Professor2.setNome(nomeProfessor2);
		Professor2.setNumInscricao(n1.nextInt(5000));
		
	
	//Scan Materia 2
				
		System.out.println("---------------------");
		System.out.println("DIGITE A MATERIA");
		System.out.println("---------------------");
		
		String nomeMateria2 = scan.nextLine();
		Professor2.getMateria().setNome(nomeMateria2);
		Professor2.getMateria().setCodigo(n1.nextInt(5000));
	
	    
		System.out.println("O NOME DO SEGUNDO PROFESSOR �: " + Professor2.getNome() + ", E SEU NUMERO DE INSCRI�AO �: " + Professor2.getNumInscricao());
		System.out.println("O NOME DA MATERIA �: " + Professor2.getMateria().getNome() + ", E SEU CODIGO �: " + Professor2.getMateria().getCodigo());
	}
}


