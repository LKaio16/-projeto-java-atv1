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
		Materia Materia1 = new Materia();
		
		System.out.println("---------------------");
		System.out.println("DIGITE A MATERIA");
		System.out.println("---------------------");
		
		String nomeMateria1 = scan.nextLine();
		Materia1.setNome(nomeMateria1);
		Materia1.setCodigo(n1.nextInt(5000));
		
		     //System.out.println(Materia1.getNome());
		
		System.out.println("O NOME DO PRIMEIRO PROFESSOR É: " + Professor1.getNome() + ", E SEU NUMERO DE INSCRIÇAO É: " + Professor1.getNumInscricao());
		System.out.println("O NOME DA MATERIA É: " + Materia1.getNome() + ", E SEU CODIGO É: " + Materia1.getCodigo());
		
		
	
	//Scan Nome Professor 2
		
		Professor Professor2 = new Professor();
	
		System.out.println("-----------------------------");
		System.out.println("DIGITE O NOME DO PROFESSOR:");
		System.out.println("-----------------------------");
		
		String nomeProfessor2 = scan.nextLine();
		Professor2.setNome(nomeProfessor2);
		Professor2.setNumInscricao(n1.nextInt(5000));
		
	
	//Scan Materia 2
		
		Materia Materia2 = new Materia();
		
		System.out.println("---------------------");
		System.out.println("DIGITE A MATERIA");
		System.out.println("---------------------");
		
		String nomeMateria2 = scan.nextLine();
		Materia2.setNome(nomeMateria2);
		Materia2.setCodigo(n1.nextInt(5000));
	
	    
		System.out.println("O NOME DO SEGUNDO PROFESSOR É: " + Professor2.getNome() + ", E SEU NUMERO DE INSCRIÇAO É: " + Professor2.getNumInscricao());
		System.out.println("O NOME DA MATERIA É: " + Materia2.getNome() + ", E SEU CODIGO É: " + Materia2.getCodigo());
	}
}


