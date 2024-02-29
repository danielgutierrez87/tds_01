//Crie um programa para encontrar o maior número entre os números dados

public class ex04{
    public static void main(String[] args){
        double maior = Double.parseDouble(args[0]);
        double numero;
        for(int i = 0; i < args.length; i++){
            numero = Double.parseDouble(args[i]);
            if(numero > maior){
                maior = numero;
            }
        }
        System.out.println(maior);
    }
}