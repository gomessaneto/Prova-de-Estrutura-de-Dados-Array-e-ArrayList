package escola;

public class BasicaAluno {

	private String id;
	private String nome;
	private int idade;
	private String curso;
	
	public BasicaAluno(String id, String nome, int idade, String curso) {
		
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.curso = curso;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "BasicaAluno [" + (id != null ? "id=" + id + ", " : "") + (nome != null ? "nome=" + nome + ", " : "")
				+ "idade=" + idade + ", " + (curso != null ? "curso=" + curso : "") + "]";
	}

	
	
}
