import java.util.Scanner;

public class ContaTerminal {
    public static void main(String [] args){
        int numero; 
        String agencia;
        String cliente;
        double saldo;

        Scanner s = new Scanner(System.in);

        System.out.println("Digite o número da sua conta:");
            numero = s.nextInt();
            s.nextLine();
        System.out.println("Digite o número de sua agência:");
            agencia = s.nextLine();
        System.out.println("Digite o seu nome:");
            cliente = s.nextLine();
        System.out.println("Digite quanto você quer sacar:");
            saldo = s.nextDouble();

            System.out.println("Olá " + cliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
