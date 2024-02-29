// Crie um programa para verificar se os numeros informados são primos ou não.

public class ex06 {
    public static void main(String[] args){
        int numero;
        int check;
        for(int i = 0; i < args.length; i++){
            numero = Integer.parseInt(args[i]);
            check = 0;
            if(numero < 2){
                System.out.print(args[i] + " ");
                System.out.println("Não é primo");
            } else {
                for(int j = 2; j <= Math.sqrt(numero); j++){
                    if(numero % j == 0){
                        System.out.print(args[i] + " ");
                        System.out.println("Não é primo");
                        check++;
                        break;
                    }
                }
                if (check == 0){
                    System.out.print(args[i] + " ");
                    System.out.println("É primo");
                }
            }
        }
    }
}