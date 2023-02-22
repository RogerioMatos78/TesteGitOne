package testeGit;

public class TesteGit {

	public static void main(String[] args) {
		System.out.println("Teste");
		
		AlunoClass aluno = new AlunoClass();
		
		aluno.setNome("Teste Git");
		aluno.setIdade(45);
		
		System.out.println("Nome " + aluno.getNome() );
		System.out.println("Idade " + aluno.getIdade() );		
	}

}
