package escola;

import java.util.ArrayList;

public class ColecaoAlunoArrayList {

    private ArrayList<BasicaAluno> alunos;

    public ColecaoAlunoArrayList(int tamanho){
        this.alunos = new ArrayList<>();
    }

    public void cadastrarAluno(BasicaAluno aluno) { //add aluno 
        this.alunos.add(aluno);
    }

    public void listarAlunos() { //listar aluno
        for (BasicaAluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public boolean cadastrarAlunoPosicao(int posicao, BasicaAluno aluno){
        if (posicao < 0 || posicao > alunos.size()) {
            System.out.println("Posição inválida.");
            return false;
        }
        this.alunos.add(posicao, aluno);
        return true;
    }

    public void procurarAlunoPosicao(int posicao) { //apenas retorna o aluno com o indice da posicao
        if (posicao >= 0 && posicao < alunos.size()) {
            System.out.println(alunos.get(posicao));
        } else {
            System.out.println("Posição inválida.");
        }
    }

    public void excluirAlunoPosicao(int posicao) {
        if (posicao >= 0 && posicao < alunos.size()) {
            alunos.remove(posicao);
        } else {
            System.out.println("Posição inválida.");
        }
    }
}
