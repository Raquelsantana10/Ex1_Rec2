package Controller;

public class OperacoesController {
	
	public OperacoesController() {
		super();
	}
	
	public int somatorio(int N) {
		//Condi��o de Parada: Quando o valor informado chegar � zero.
		if (N == 0) {
			return 0;
		} else {
			return N + somatorio(N - 1); //O valor definido pelo usus�rio soma com o pr�ximo n�mero respectivo baseado na subtra��o de N - 1.
		}
	}
}
