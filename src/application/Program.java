package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Quantidade de alunos no curso A: ");
		int n = sc.nextInt();
		
		
		//inserir aluno sem repetir com o Hash
		Set<Aluno> set = new HashSet<>();

		for (int i = 0; i < n; i++) {
			
			set.add(new Aluno(sc.nextInt()));
		}

		System.out.print("Quantidade de alunos no curso B: ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			set.add(new Aluno(sc.nextInt()));
		}

		System.out.print("Quantidade de alunos no curso C: ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			set.add(new Aluno(sc.nextInt()));
		}
		
		System.out.println("Total de alunos: " + set.size());
		
		sc.close();

	}

}
