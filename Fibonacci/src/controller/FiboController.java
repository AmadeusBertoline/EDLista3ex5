package controller;

public class FiboController {
	
	public int Fibonacci(int n) {
        // Caso base: se n for 1 ou 2, retorna 1
        if (n == 1 || n == 2) {
            return 1;
        }
        // Chamada recursiva: soma os dois termos anteriores da sequência
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

}
