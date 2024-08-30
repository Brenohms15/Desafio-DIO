import java.util.*;

public class ContaTerminal 
{
    private int Numero;
    public String Agencia;
    private String Nome_Cliente;
    private double Saldo;

    ContaTerminal()
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o numero da sua conta: ");
        Numero = scan.nextInt();
        scan.nextLine();

        System.out.print("Insira a agencia da sua conta: ");
        Agencia = scan.nextLine();

        System.out.print("Digite o seu nome: ");
        Nome_Cliente = scan.nextLine();

        System.out.print("Insira o seu saldo: ");
        Saldo = scan.nextDouble();
        scan.nextLine();

        System.out.println("Olá "+Nome_Cliente+", obrigado por criar uma conta em nosso banco, sua agência é "+Agencia+", conta "+Numero+" e seu saldo "+Saldo+" já está disponível para saque.");
        
    }


}
