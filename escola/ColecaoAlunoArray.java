package escola;


public class ColecaoAlunoArray {

	private BasicaAluno[] aluno;
	private int tamanho;
	
	public ColecaoAlunoArray(int tamanho){
		this.aluno = new BasicaAluno[tamanho];
		this.tamanho = 0;
	}
	
	public void cadastrarAluno(BasicaAluno aluno) { //add aluno 
		if (this.tamanho < this.aluno.length){
			this.aluno[this.tamanho] = aluno;
			this.tamanho++;
			
		} else {
            System.out.println("Não há espaço para cadastrar mais alunos.");
        }
    }
	
	 public void listarAlunos() { //listar aluno
	        for (int i = 0; i < this.tamanho; i++) {
	            System.out.println(aluno[i]); //caso nao de certo mudar para aluno[i]
	        }
	    }
	
	 public boolean cadastrarAlunoPosicao(int posicao, BasicaAluno aluno){
		 if (!(posicao >= 0 && posicao < tamanho)){
				throw new IllegalArgumentException("Posição inválida");
			}
			//mecanismo para mover todos os elementos e reordenar o vetor
			for (int i=this.tamanho-1; i>=posicao; i--){
				this.aluno[i+1] = this.aluno[i];
			}
			
			this.aluno[posicao] = aluno;
			this.tamanho++;
			
			return true;
		}
	 
	 public void procurarAlunoPosicao(int posicao) { //apenas retorna o aluno com o indice da posicao
		 if (!(posicao >= 0 && posicao < tamanho)){
				throw new IllegalArgumentException("Posição inválida");
			}
		 
	        System.out.println(aluno[posicao]); 
	    }
	 
	 public void excluirAlunoPosicao(int posicao) {
		 if (!(posicao >= 0 && posicao < tamanho)){
				throw new IllegalArgumentException("Posição inválida");
			}
		 
	        if (posicao >= 0 && posicao < tamanho) {
	            for (int i = posicao; i < tamanho - 1; i++) {
	                aluno[i] = aluno[i + 1];
	            }
	            aluno[tamanho- 1] = null;
	            tamanho--;
	       
	        }
	     }
	 }
	
	 

	









