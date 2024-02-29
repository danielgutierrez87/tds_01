//Crie um programa para encontrar a média dos números informados

public class ex02 {
    public static void main(String[] args){
        double soma = 0;
        for(int i = 0; i < args.length; i++){
            soma += Double.parseDouble(args[i]);
        }
        double media = soma/args.length;
        System.out.println(media);
    }
}