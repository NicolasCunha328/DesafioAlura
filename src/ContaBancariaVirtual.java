package PACKAGE_NAME;

public class ContaBancariaVirtual {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome;
        String banco;
        String menu = """
                
                    Operações
                
                    1 - Consultar dados
                    2 - Receber Valor
                    3 - Transferir Valor
                    4 - Sair
                
                    Digite a opção desejada:""";
        int escolha = 0;
        double saldo;
        double valorRecebido;
        double valorTransferido;

        System.out.println("""
                
                Olá, para conseguirmos ajudá-lo, precisaremos fazer algumas perguntas.
                
                Por favor, preencha os dados abaixo para que possamos continuar.
                """);
        System.out.println("Qual seu nome:");
        nome = leitura.nextLine();
        System.out.println("Qual seu banco:");
        banco = leitura.nextLine();
        System.out.println("Qual seu saldo atual:");
        saldo = leitura.nextDouble();
        System.out.println("\n*********************************************************");
        System.out.println("Dados do cliente\n");
        System.out.println("Nome:                   " + nome);
        System.out.println("Banco:                  " + banco);
        System.out.println("Saldo:                  " + saldo);
        System.out.println("*********************************************************\n");

        while (escolha != 4){

            System.out.println(menu);
            escolha = leitura.nextInt();

            if (escolha == 1){
                System.out.println("\nSeu saldo atual é de: " + saldo + ".");
            } else if (escolha == 2) {
                System.out.println("\nDigite um valor a receber:");
                valorRecebido = leitura.nextDouble();
                saldo += valorRecebido;
                System.out.println("\nO valor recebido é de: " + valorRecebido + ".");
            } else if (escolha == 3) {
                System.out.println("\nDigite um valor para transferência: ");
                valorTransferido = leitura.nextDouble();
                if (valorTransferido > saldo){
                    System.out.println("\nSALDO INSUFICIENTE!!");
                }else {
                    saldo -= valorTransferido;
                    System.out.println("\nForam transferidos " + valorTransferido + " da sua conta.");
                }
            } else if (escolha > 4){
                System.out.println("\nOPÇÃO INVÁLIDA!");
            }


        }

    }
}
