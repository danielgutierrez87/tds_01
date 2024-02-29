//Escreva um programa para calcular a raiz quadrada dos números dados

import java.lang.Math;

public class ex07 {
    public static void main(String[] args){
        for(int i = 0; i < args.length; i++){
            int numero = Integer.parseInt(args[i]);
            double raiz = Math.sqrt(numero);
            System.out.println(raiz);
        }
    }
}