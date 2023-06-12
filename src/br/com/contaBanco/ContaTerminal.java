package br.com.contaBanco;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        int numero = teclado.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = teclado.next();

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = teclado.next();

        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = teclado.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", e seu saldo " + saldo + " já está disponível para saque.");

    }

}
