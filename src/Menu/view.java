package Menu;

import javax.swing.JOptionPane;

import Controller.RecursividadeController;

public class view {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RecursividadeController funcao = new RecursividadeController();
		
		int vetor[] = {1,-5,-8,-4,3,5,9};
		
		JOptionPane.showMessageDialog(null,"O vetor tem " + funcao.MostraNegativos(vetor, vetor.length-1) + " valores negativos");

	}

}
