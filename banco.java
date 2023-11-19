import java.util.Scanner;

class Banco {
    private String nome;
    private String tipoConta = "Corrente";
    private double saldo;
    private int opcao;


   

    public String getNome() {
        return nome;

    }

    public void setNome(String nome){
        this.nome = nome;

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public void pedirNomeSaldo(){
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Digite seu nome e seu saldo: ");
        setNome(scan.nextLine()); 
        setSaldo(scan.nextDouble());

    }
    public void cabecalho(){

        pedirNomeSaldo();

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + getNome());
        System.out.println("Tipo conta: " + getTipoConta());
        System.out.println("Saldo atual: " + getSaldo());
        System.out.println("\n***********************");
    }

    public void menuOpcoes(){
        Scanner scan = new Scanner(System.in);

        System.out.println(" ***Digite sua opcao***\r\n" + //
                "                1 - Consultar valor\r\n" + //
                "                2 - Transferir valor\r\n" + //
                "                3 - Receber valoe\r\n" + //
                "                4 - sair");
    
        
        this.setOpcao(scan.nextInt());
        
    }

    public void operaMenuOpcoes(){
        menuOpcoes();
        Scanner scan = new Scanner(System.in);
        
        while(getOpcao() != 4){
             if (getOpcao() == 1){
                System.out.println("O saldo atualizado é " + getSaldo());
                continue;
            } else if (getOpcao() == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = scan.nextDouble();
                if (valor > getSaldo()) {
                    System.out.println("Não há saldo para realizar a transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + getSaldo());
                }
            } else if (getOpcao() == 3) {
                System.out.println("Valor recebido: ");
                double valor = scan.nextDouble();
                getSaldo() += valor;
                System.out.println("Novo saldo: " + getSaldo());
            } else if (getOpcao() != 4) {
                System.out.println("Opção inválida!");
            }
            break;
        }
    }
}
