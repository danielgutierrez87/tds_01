//Crie um programa que substitua todas letras "a" por "@" e exiba as novas strings no terminal
public class ex17{
    public static void main(String[] args){
        String palavra = "";
        char ch;
        for(int i = 0; i < args.length; i++){
            palavra = "";
            for(int j = 0; j < args[i].length(); j++){
                ch = args[i].charAt(j);
                if(!isA(ch)){
                    palavra += ch;
                } else {
                    palavra += "@";
                }
            }
            System.out.print(palavra);
            if(i < args.length -1){
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static boolean isA(char letra){
        String vogais = "aA";
        for(int i = 0; i < vogais.length(); i++){
            if(letra == vogais.charAt(i)){
                return true;
            }
        }
        return false;

    }
}