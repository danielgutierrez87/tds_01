//Escreva um programa para inverter um número dado

public class ex09
{
    public static void main(String[] args){
        String numero = "";
        for(int i = args[0].length() -1; i >= 0; i--){
            numero += args[0].charAt(i);
        }
        System.out.println(numero);
    }
}