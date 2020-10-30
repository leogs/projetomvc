package controller;

import model.Estudante;
import view.EstudanteView;

public class EstudanteController {
	private Estudante modelo;
	private EstudanteView view;

	public EstudanteController(Estudante modelo, EstudanteView view){
	      this.modelo = modelo;
	      this.view = view;
	}

	public void setNomeEstudante(String nome){
		modelo.setNome("Estudante " + nome);		
	}

	public String getNomeEstudante(){
		return modelo.getNome();		
	}

	public void setMatriculaEstudante(String matricula){
		modelo.setMatricula(matricula);		
	}

	public String getMatriculaEstudante(){
		return modelo.getMatricula();		
	}

	public void updateView(){				
	    view.printDetalhesEstudante(modelo.getNome(), modelo.getMatricula());
	}	
	
}
