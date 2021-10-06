package br.com.alura;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
		public static void main(String[] args) {
			Collection<String> alunos = new HashSet<>();
			alunos.add("Ale Souza");
			alunos.add("Mario Santos");
			alunos.add("Danilo Souza");
			alunos.add("Leandro Silva");
			alunos.add("Ale Souza");
			
			for (String string : alunos) {
				System.out.println(string);
			}
			
			System.out.println(alunos);
		}
}
