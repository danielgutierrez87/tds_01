//Escreva um programa para calcular a soma dos números informados

public class ex01 {
    public static void main(String[] args){
        int soma = 0;
        for(int i = 0; i < args.length; i++){
            soma += Integer.parseInt(args[i]);
        }
        System.out.println(soma);
    }
}