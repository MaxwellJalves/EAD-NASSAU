package academiaUninassauSI.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Iterator;

import academiaUninassauSI.model.Aluno;

@SuppressWarnings("unused")
public class SistemaAcademia {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		int contAlunosAtivo = 0;
		int contAlunosInativos = 0;
		alunos.add(new Aluno("Maxwell Costa", "100.030.000-22", 30, 1.83, 93.5, true, 1));
		alunos.add(new Aluno("Ana Beatriz", "960.020.000-22", 28, 1.83, 93.5, true, 1));
		alunos.add(new Aluno("Sophia Costa", "000.000.000-12", 4, 1.2, 33.5, false, 1));

		System.out.println("--------------------------------------------"
							+ "\n|\t    Uninassau  2020  \t\t   |".toUpperCase());


		Collections.sort(alunos, Comparator.comparing(Aluno::getNome));
		
		/*Listando todos os alunos matriculados*/
		Iterator<Aluno> iterando = alunos.iterator();
		while (iterando.hasNext()) {
			System.out.println("--------------------------------------------");
			System.out.println(iterando.next());
			
		}
		/*Exibindo a quantidade de Alunos ativos/Inativo*/
		
		for (Aluno object : alunos) {
			if (object.isStatus() == true) {
				contAlunosAtivo++;
			} else {
				contAlunosInativos++;
			}
		}
		/*Retorno para o usuario*/
		System.out.println("______________________________________________");
		System.out.println("Quandidade de Alunos Ativos   : \t" + contAlunosAtivo);
		System.out.println("Quantidade de Alunos Inativos : \t" + contAlunosInativos);
		System.out.println("______________________________________________");

	}

}
