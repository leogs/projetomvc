package controller;
import model.Estudante;
import model.EstudanteDAO;
import view.EstudanteView;

public class MVC {
	public static void main(String[] args) {
		//Create a view : to write student details on console
		EstudanteView view = new EstudanteView();
		Estudante modelo = EstudanteDAO.lerEstudanteBD();
		
		EstudanteController controller = new EstudanteController(modelo, view);

	    controller.updateView();

	    //update model data
	    controller.setNomeEstudante("João");
	    controller.setMatriculaEstudante("45879");

	    controller.updateView();
	 }
}
