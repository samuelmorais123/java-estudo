package Exercicio0808;

import java.util.Scanner;

public class EX20 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        System.out.println("Tamanho: " + palavra.length());
        System.out.println("Primeira letra: " + palavra.charAt(0));
        System.out.println("Última letra: " + palavra.charAt(palavra.length() - 1));

        sc.close();
    }
}
