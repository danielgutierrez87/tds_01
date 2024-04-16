//Ler n strings e exbir as posições das vogais encontradas

public class Ex16{
    public static void main(String[] args){
        char ch;
        int cont;
        for(int i = 0; i < args.length; i++){
            System.out.print(i + ": ");
            cont = 0;
            for(int j = 0; j < args[i].length(); j++){
                ch = args[i].charAt(j);
                if(isVowel(ch)){
                    cont++;
                }
            }
            
            for(int j = 0; j < args[i].length(); j++){
                ch = args[i].charAt(j);
                if(isVowel(ch)){
                    System.out.print(args[i].indexOf(ch));
                    if(cont > 1){
                        System.out.print(",");
                        cont--;
                    }
                }
            }
            System.out.println();
        }
    }

    public static boolean isVowel(char letra){
        String vogais = "aeiouAEIOU";
        for(int i = 0; i < vogais.length(); i++){
            if(letra == vogais.charAt(i)){
                return true;
            }
        }
        return false;

    }

}