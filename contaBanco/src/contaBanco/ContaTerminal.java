package contaBanco;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
	Scanner sc = new Scanner(System.in);
	
	private int numeroConta;
	private String agencia;
	private String nomeCliente;
	private double saldo;
	
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	 
	public void banco() {
		try {
			System.out.print("Por favor, digite seu nome:");
			String nome = sc.next();
			setNomeCliente(nome);
			
			System.out.print("Por favor, digite o número de sua agência:");
			String agencia = sc.next();
			setAgencia(agencia);
			
			System.out.print("Por favor, digite o número da sua conta:");
			int conta = sc.nextInt();
			setNumeroConta(conta);
			
			System.out.print("Por favor, digite seu saldo:");
			double saldo = sc.nextDouble();
			setSaldo(saldo);
			
			System.out.print("\n Olá " + getNomeCliente()+
					", obrigado por criar uma conta em nosso banco,\n sua agência é: "+ getAgencia()+
					",\n sua conta: " + getNumeroConta()+
					"\n e seu saldo: "+ getSaldo()+ " já está disponível para saque.");
			
		} catch (InputMismatchException e) {
			System.out.print("\n --Por favor, insira apenas números-- ");
			
		}finally {
			sc.close();
		}
		
		
	}
	
}
