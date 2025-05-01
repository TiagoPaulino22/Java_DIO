package teste3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// TODO: Implemente o código para ler as 3 transações:
		// Esses valores representam as transações realizadas.

		double transacao1 = scanner.nextDouble();
		double transacao2 = scanner.nextDouble();
		double transacao3 = scanner.nextDouble();
		double valorMinimo = scanner.nextDouble();

		// Armazene cada valor no array `transacoes` para processá-los depois.

		double[] transacoes = new double[4];

		transacoes[0] = transacao1;
		transacoes[1] = transacao2;
		transacoes[2] = transacao3;
		transacoes[3] = valorMinimo;

		// TODO: Realize a leitura do valor mínimo (4ª entrada):
		// Este valor será usado como o critério para contar as transações maiores que
		// ele.

		double valorMinimoArray = transacoes[3];

		int contador = 0;

		// TODO: Conte as transações maiores que o valor mínimo e verifique se cada
		// valor no array `transacoes`:
		// Caso o valor seja maior que o `valorMinimo`, incrementem o contador.
		for (double transacao : transacoes) {
			if (valorMinimoArray < transacao) {

				contador++;
			}
		}

		System.out.println(contador);

		scanner.close();
	}

}
