package br.com.alura;

import java.util.List;

public class TestaCurso {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Collections","Paulo Silveira");
		
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);
		
		aulas.add(new Aula("ArrayList", 82));
	
		javaColecoes.adiciona(new Aula("Arrays",32));
		
		System.out.println(aulas);
		System.out.println(javaColecoes.getAulas());
		System.out.println(aulas == javaColecoes.getAulas());
	
		
	}
}
