package edu.contaterminal.app;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        // Inicio Scanner e Idioma
        Locale.setDefault(Locale.US);
        Scanner dadosEntrada = new Scanner(System.in);

        // Inserir dados
        System.out.print("Digite numero:");
        int numeroConta = dadosEntrada.nextInt();

        System.out.print("Digite agencia:");
        String agenciaConta = dadosEntrada.next();
        dadosEntrada.nextLine();

        System.out.print("Diginte nome cliente:");
        String nomeClienteConta = dadosEntrada.nextLine();

        System.out.print("Digite saldo:");
        double saldoConta = dadosEntrada.nextDouble();

        // Exibir dados inseridos
        System.out.printf("%nDados:%nNumero:%d%nAgencia:%s%nNome Cliente:%s%nSaldo:%.2f", numeroConta, agenciaConta,
                nomeClienteConta.concat(" "), saldoConta);

        // Encerramento Scanner
        dadosEntrada.close();
    }
}
