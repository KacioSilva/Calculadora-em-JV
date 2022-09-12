import java.util.Scanner;

public class CalculadoraEmJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao;
        int n1; int n2; int pergunta = 1;

        System.out.println(" " + "");
        System.out.println("-----CALCULADORA EM JAVA-----");
        System.out.println(" " + "");

        System.out.println("BEM VINDO. O QUE VOCÊ DESEJA?");



        while (pergunta == 1) {


            System.out.println(" 1 - SOMAR " + " 2 - SUBTRAIR " + " 3 - MULTIPLICAR " + " 4-DIVIDIR " );

            System.out.print("SUA OPÇÃO: ");
            opcao = input.nextInt();
            System.out.println(" " + "");


            if(opcao > 4)
            {while (opcao > 4)
            {   System.out.println(" " + "");
                System.out.println("Opção Inválida. Por favor, escolha novamente.");
                System.out.println(" 1 - SOMAR " + " 2 - SUBTRAIR " + " 3 - MULTIPLICAR " + " 4-DIVIDIR " );
                System.out.print("SUA OPÇÃO: ");
                opcao = input.nextInt();
                System.out.println(" " + "");
            }}

            if(opcao < 1)
            {while (opcao < 1)
            {   System.out.println(" " + "");
                System.out.println("Opção Inválida. Por favor, escolha novamente.");
                System.out.println(" 1 - SOMAR " + " 2 - SUBTRAIR " + " 3 - MULTIPLICAR " + " 4-DIVIDIR " );
                System.out.print("SUA OPÇÃO: ");
                opcao = input.nextInt();
                System.out.println(" " + "");
            }}



            System.out.print("Informe o primeiro valor: ");
            n1 = input.nextInt();

            System.out.print("Informe o segundo valor: ");
            n2 = input.nextInt();

            double soma = n1 + n2;
            double subtracao = n1 - n2;
            double multiplicacao = n1 * n2;
            double divisao = n1 / n2;


            if (opcao == 1)
            {System.out.println("O valor da soma é igual a: " + soma);}
            System.out.println(" " + "");


            if (opcao == 2)
            {System.out.println("O valor da subtração é igual a: " + subtracao);}
            System.out.println(" " + "");


            if (opcao == 3)
            {System.out.println("O valor da multiplicação é igual a: " + multiplicacao);}
            System.out.println(" " + "");



            if (opcao == 4)
            {System.out.println("O valor da divisão é igual a: " + divisao);}
            System.out.println(" " + "");


            System.out.println("Você deseja continuar?");
            System.out.println("------(1)------: SIM");
            System.out.println("(Qualquer outro valor): NÃO");
            System.out.print("SUA OPÇÃO: ");
            pergunta = input.nextInt();
            System.out.println(" " + "");

            if (pergunta == 1)
            {pergunta = 1;}

            if(pergunta == 2)
            {pergunta = 2;}
        }}
}