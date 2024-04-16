//Ler uma frase e imprima-a sem as vogais

public class Ex14 {
    public static void main(String[] args){
        String semVogal = "";
        char ch;
        for(int i = 0; i < args.length; i++){
            for(int j = 0; j < args[i].length(); j++){
                ch = args[i].charAt(j);
                if(!isVowel(ch)){
                    semVogal += ch;
                }
            }
            if(i < args.length -1){
                semVogal += " ";
            }
        }
        System.out.println(semVogal);
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


/*//Ler uma frase e imprima-a sem as vogais
public class Ex14 {
    public static void main(String[] args){
        String vogais = "AEIOUaeiou";
        String semVogal = "";
        char ch;
        for(int i = 0; i < args.length; i++){
            for(int j = 0; j < args[i].length(); j++){
                int contagem = 0;
                ch = args[i].charAt(j);
                for(int k = 0; k < vogais.length(); k++){
                    if(ch == vogais.charAt(k)){
                        contagem++;
                        break;
                    }
                }
                if(contagem == 0){
                    semVogal += ch;
                } 
            }
            System.out.print(semVogal);
            if(i < args.length-1){
                System.out.print(" ");
            }
            semVogal = "";
        }
        System.out.println();
    }
}
*/