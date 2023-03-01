package Controller;

public class OperacoesController {
	
	public OperacoesController() {
		super();
	}
	
	public int somatorio(int N) {
		//Condição de Parada: Quando o valor informado chegar á zero.
		if (N == 0) {
			return 0;
		} else {
			return N + somatorio(N - 1); //O valor definido pelo ususário soma com o próximo número respectivo baseado na subtração de N - 1.
		}
	}
}
