package escola;

import nairSouza.Paciente;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n ////// UTILIZANDO VETORES ////// \n");
		 ColecaoAlunoArray a = new ColecaoAlunoArray (10);
		
		// cadastrar aluno na posicao final
		System.out.println("Inserção de alunos: ");
		a.cadastrarAluno(new BasicaAluno("13434", "Jose", 19, "Informatica"));
		a.cadastrarAluno(new BasicaAluno("56789", "Mayara", 19, "Eletromecanica"));
		a.cadastrarAluno(new BasicaAluno("101112", "Rosales", 19, "Biocombustiveis"));
		
		//cadastrar aluno por posicao
		a.cadastrarAlunoPosicao(1, new BasicaAluno("131415", "Giovana", 18, "Biocombustiveis"));
		
		//listar alunos
		
		a.listarAlunos();
		
		//excluir um aluno
		a.excluirAlunoPosicao(3);
		System.out.println("\nPós exclusão de aluno por posição:");
		a.listarAlunos();
		
		System.out.println("\nProcurando aluno por posição: ");
		a.procurarAlunoPosicao(2); // procurar aluno pela sua posicao no vetor 
		
		System.out.println("\n ////// UTILIZANDO ARRAYLIST ////// \n");
		
		ColecaoAlunoArrayList colecao = new ColecaoAlunoArrayList(10);

      
        BasicaAluno aluno1 = new BasicaAluno("3243", "Maria", 10, "Engenharia Elétrica");
        BasicaAluno aluno2 = new BasicaAluno("3243", "Chloe", 10, "Ciência da Computação");
        BasicaAluno aluno3 = new BasicaAluno("3243", "Josy", 10, "Química");

        
        colecao.cadastrarAluno(aluno1);
        colecao.cadastrarAluno(aluno2);
        colecao.cadastrarAluno(aluno3);

       
        System.out.println("Lista de alunos:");
        colecao.listarAlunos();

        // cadastrar alunos por posicao
        colecao.cadastrarAlunoPosicao(1, new BasicaAluno("3243", "Maria", 10, "Informatica"));

        System.out.println("\nLista de alunos após inserção por posicao:");
        colecao.listarAlunos();

        // procurando aluno pelo indice do vetor - posicao
        System.out.println("\nProcurando por aluno por posicao:");
        colecao.procurarAlunoPosicao(0);

        // excluir aluno pela posicao
        colecao.excluirAlunoPosicao(3);

        // após excluir
        System.out.println("\nPós exclusão:");
        colecao.listarAlunos();
    }
		
}
