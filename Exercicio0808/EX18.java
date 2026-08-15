package Exercicio0808;

import java.util.Scanner;

public class EX18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Sobrenome: ");
        String sobrenome = sc.nextLine();

        System.out.println("Iniciais: "
                + nome.charAt(0)
                + sobrenome.charAt(0));

        sc.close();
    }
    
}
