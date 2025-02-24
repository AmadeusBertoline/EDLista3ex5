package view;
import controller.FiboController;

public class FiboView {

	public static void main(String[] args) {
		
		FiboController fibo = new FiboController();
		
		int posicao = 10; 
		if (posicao > 20) {
			System.out.println("Posição excede o limite permitido de 20.");
		} else {
			int resultado = fibo.Fibonacci(posicao);
			System.out.println("O valor na posição " + posicao + " da série de Fibonacci é: " + resultado);
		}

	}
}
