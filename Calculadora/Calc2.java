import java.util.Scanner;

public class Calc2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Digite n1: ");
            double n1 = input.nextDouble();
            input.nextLine();
            if(n1 == 0){
                break;
            }
            System.out.print("Digite a operação: ");
            String ope = input.nextLine();
            System.out.print("Digite n2: ");
            double n2 = input.nextDouble();
            input.nextLine();
            double resultado = 0;
            switch(ope){
                case "+":
                    resultado = soma(n1,n2);
                    break;

                case "-":
                    resultado = menos(n1,n2);
                    break;

                case "x":
                    resultado = vezes(n1,n2);
                    break;

                case "/":
                    if(n2 == 0){
                        System.out.println("ERROR");
                        resultado = 0; 
                    } else {
                        resultado = div(n1,n2);
                    }
                    break;
            }
            System.out.println("Resultado é: " + resultado);
        }
        input.close();
    }

    public static double soma(double n1, double n2){
        return n1 + n2;
    }
    public static double menos(double n1, double n2){
        return n1 - n2;
    }
    public static double vezes(double n1, double n2){
        return n1 * n2;
    }
    public static double div(double n1, double n2){
        return n1 / n2;
    }
}