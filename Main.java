import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


        Banco banco = new Banco();

        banco.cabecalho();
        banco.operaMenuOpcoes();

    }
}