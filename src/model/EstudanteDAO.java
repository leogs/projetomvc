package model;

public class EstudanteDAO {
	public static Estudante lerEstudanteBD(){
	      Estudante estudante = new Estudante();
	      estudante.setNome("Roberto");
	      estudante.setMatricula("1234");
	      return estudante;
	}
}
