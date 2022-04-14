import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner console1 = new Scanner(System.in);
        
        System.out.println("Digite o numero da conta: ");
        String numero = console1.nextLine();

        System.out.println("Digite o saldo da conta");
        Double saldo = console1.nextDouble();


        Conta conta1 = new Conta();
        conta1.setNumero(numero);
        conta1.setSaldo(saldo);
        
        conta1.mostraDados();

        Conta conta2 = new Conta(numero, saldo);
        conta2.setNumero(numero);
        conta1.setSaldo(saldo);

        conta2.mostraDados();

        conta2.credito((double) 100);
        conta2.mostraDados();

        conta2.debito((double) 1000);
        conta2.mostraDados();



    }

}