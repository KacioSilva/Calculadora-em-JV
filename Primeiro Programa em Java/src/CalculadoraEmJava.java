import java.util.Scanner;

public class CalculadoraEmJava {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n1;
        int n2;
        int soma;
        int subtracao;
        int multiplicacao;
        int operacao;
        int desejo;

        int n = 1;
        while(n == 1){
            System.out.print("Informe o primeiro valor: ");
            n1 = scan.nextInt();
            System.out.print("Informe o segundo valor: ");
            n2 = scan.nextInt();

            soma = n1 + n2;
            subtracao = n1 - n2;
            multiplicacao = n1 * n2;

            System.out.print("Digite (1) para SOMAR, (2) PARA SUBTRAIR ou (3) para MULTIPLICAR: ");
            operacao = scan.nextInt();

            if(operacao == 1){
                System.out.println("SOMA: " + soma); }
            if(operacao == 2){
                System.out.println("SUBTRAÇÃO: " + subtracao);}

            if(operacao == 3){
                System.out.println("MULTIPLICAÇÃO: " + multiplicacao); }


            System.out.println("Deseja continuar? (1) SIM // (2) NÃO: ");
            desejo = scan.nextInt();
            if(desejo == 1){
                n = 1; }

            if(desejo == 2){
                n = 2;}
        }
    }
}




