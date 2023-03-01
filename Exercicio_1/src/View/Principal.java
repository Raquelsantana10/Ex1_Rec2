package View;

import Controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		
		OperacoesController Op = new OperacoesController();
		
		int N = 6;
		
		System.out.println(Op.somatorio(N));
	}

}
