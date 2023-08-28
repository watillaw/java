import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Nome do correntista: ");
        String nome = leitura.nextLine();
        float saldo = 2510.87F;
        int menu = 0;


        System.out.println("******************************************");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: Corrente");
        System.out.println("Saldo atual: " + saldo );
        System.out.println("******************************************\n");

        while (menu < 4 || menu > 4){
        if(menu > 4){
            System.out.println(">>>>>>>>>>>>>>OPCAO INVALIDA!<<<<<<<<<<<<<<");
            System.out.println(">>>>>>>>>>>>>>DIGITE UMA OPÇÃO VÁLIDA!<<<<<<<<<<<<<<\n\n");
        }
        System.out.println("Menu de operações:\n");
        System.out.println("1 - Consultar Saldo");
        System.out.println("2 - Receber / Depositar");
        System.out.println("3 - Transferir / Sacar");
        System.out.println("4 - Sair");
        menu = leitura.nextInt();

        switch (menu){
            case 1:
                System.out.println("Saldo bancario: " + saldo);
                break;
            case 2:
                System.out.println("Digite o valor que deseja depositar: ");
                float deposito = leitura.nextFloat();
                saldo += deposito;
                System.out.println("Saldo atual: " + saldo);
                break;
            case 3:
                System.out.println("Digite o valor que deseja transferir ou sacar: ");
                float saque = leitura.nextFloat();
                if (saque <= saldo){
                    saldo -= saque;
                    System.out.println("Saque no valor de:" + saque + " efetuado com sucesso!");
                    System.out.println("Saldo atual: " + saldo);
                }else {
                    System.out.println("Saldo insufuciente...");
                    System.out.println("Saldo atual: " + saldo);
                }
                break;
            case 4:
                System.out.println("Saindo...");
                break;
        }
        }

    }
}