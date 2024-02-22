import java.util.Scanner;

public class Conta {
    private Scanner entrada;
    private Cliente usuario;


    public Conta(){
        entrada = new Scanner(System.in);
        usuario = new Cliente("Fax", "Corrente", 5000);
    }
    private String dadosCliente() {
        return """
            ************
            Dados do Cliente
            Nome: %s
            Tipo: %s
            Saldo: %.2f
            ************
            """.formatted(usuario.getNome(), usuario.getTipoDeConta(), usuario.getSaldoInicial());
    }
    


    public void executar(){
        int escolha;
        System.out.println(dadosCliente());
        do{
            System.out.println("\n Digite a sua opção \n");
            System.out.println(menu);
            escolha = Integer.parseInt(entrada.nextLine());

            tratarMenu(escolha);

        }while(escolha != 4);
        entrada.close();
    }

    private String menu = """
            1 - Consultar Saldo
            2 - Receber Valor
            3 - Transferir Valor
            4 - Sair
            """;

    public void tratarMenu(int escolha){
        switch (escolha) {
            case 1:
                System.out.println(usuario.getSaldoInicial());
                break;
            case 2:
                receberValor();
                break;
            case 3:
                transferirValor();
                break;
            case 4:
                System.out.println("Saindo");
                break;
            default:
                System.out.println("Opção inválida");
        }
        if (escolha != 4) {
            System.out.println("\nDigite ENTER para continuar!");
            entrada.nextLine();
        }
    }

    public void receberValor(){
        System.out.println("Digite o valor a ser recebido");
        double valor = entrada.nextDouble();
        usuario.receberValor(valor);
    }

    public void transferirValor(){
        System.out.println("Digite o valor a ser transferido");
        double valor = entrada.nextDouble();
        usuario.saque(valor);
    }

}
