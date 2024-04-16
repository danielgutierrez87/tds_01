//Ler uma frase e calcular quantas vogais possui

public class Ex13 {
    public static void main(String[] args){
        int contagem = 0;
        String vogais = "aeiouAEIOU";
        char ch;
        for(int i = 0; i < args.length; i++){
            for(int j = 0; j < args[i].length(); j++){
                ch = args[i].charAt(j);
                for(int k = 0; k < vogais.length(); k++){
                    if(ch == vogais.charAt(k)){
                        contagem++;
                        break;
                    }
                }
            }
        }
        System.out.println(contagem);
    }
}