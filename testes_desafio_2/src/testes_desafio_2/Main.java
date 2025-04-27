package testes_desafio_2;

import java.util.Scanner;

abstract class Conta {
    protected double saldo; 
    protected String nome; 
    protected String numeroConta; 

    
    public Conta(String nome, String numeroConta, double saldo) {
    	this.nome = nome;
    	this.numeroConta = numeroConta; 
    	this.saldo = saldo;
        
        
    }

    
    public abstract void sacar(double valor);

    
    public void exibirSaldo() {
        System.out.printf("Saldo Atual: %.2f%n", saldo);
    }
}


class ContaCorrente extends Conta {
    private double limite; 
        
    public ContaCorrente(String nome, String numeroConta, double saldo, double limite) {
    	super(nome, numeroConta, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        // TODO: Implemente a lógica para verificar se o saque é permitido considerando o saldo e o limite:
        // Dica: Se saldo - valor >= -limite, o saque é permitido.
        
        if(saldo - valor >= -limite){
        	saldo -= valor;
        	
        	System.out.printf("Saque realizado: %.2f%n", valor); // foi utilizado o printf para formatar o valor
        
          
        }else {
        	System.out.println("Saque invalido: Excede limite");
        	
        	}
        exibirSaldo(); // Exibe o saldo atualizado
    }
}


class ContaPoupanca extends Conta {

    public ContaPoupanca(String nome, String numeroConta, double saldo) {
        super(nome, numeroConta, saldo);
    }

    // Implementação do método sacar para Conta Poupança
    @Override
    public void sacar(double valor) {
        // TODO: Implemente a lógica para verificar se o saque é permitido considerando apenas o saldo:
        // Dica: Se saldo >= valor, o saque é permitido.
    	
        if(saldo >= valor) {
        	saldo -= valor; 
        	
        	System.out.println("Saque realizado: " + valor);
            
        }else {
        	System.out.println("Saque invalido: Saldo insuficiente");
        }
        exibirSaldo(); // Exibe o saldo atualizado
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tipoConta = scanner.nextLine();  // deixando next() me causou erros como se estivesse pulando uma variável
        String nome = scanner.nextLine(); 
        String numeroConta = scanner.nextLine(); 
        double saldoInicial = scanner.nextDouble();
       
        

        
        Conta conta = null;
        // TODO: Implemente a lógica para criar uma instância de ContaCorrente ou ContaPoupanca:
        // Dica: Use um if para verificar o tipo da conta.
        
        if(tipoConta.equalsIgnoreCase("Corrente")) {
        	 double limite = scanner.nextDouble();
        	 conta = new ContaCorrente(nome, numeroConta, saldoInicial, limite);
        }
        else if(tipoConta.equalsIgnoreCase("Poupanca")) {
        	conta = new ContaPoupanca(nome, numeroConta, saldoInicial);
        	}
        

        while (scanner.hasNextDouble()) {
            double valorSaque = scanner.nextDouble(); 
            conta.sacar(valorSaque); 
        }

        scanner.close(); 
    }
}