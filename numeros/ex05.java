//Escreva um programa para calcular o fatorial dos números digitados

public class ex05 {
    public static void main(String[] args){
        int numero;
        long fatorial;
        for(int i = 0; i < args.length; i++){
            numero = Integer.parseInt(args[i]);
            fatorial = 1;
            for(int j = numero; j > 1; j--){
                fatorial *= j;
            }
            System.out.println(fatorial);
        }
    }
}