//Escreva um programa que exiba quais, e quantas vezes, uma letra está repitida numa string
public class ex19{
    public static void main(String[] args){
        int cont;
        String palavra = args[0];
        String recons = "";
        for(int i = 0; i < palavra.length(); i++){
            cont = 0;
            for(int j = 0; j < palavra.length(); j++){
                if(palavra.charAt(i) == palavra.charAt(j)){
                    cont++;
                }
            }
            if(cont > 1){
                System.out.println(palavra.charAt(i) + ": " + cont);
                recons = "";
                for(int k = 0; k < palavra.length(); k++){
                    if(palavra.charAt(i) == palavra.charAt(k)){
                        continue;
                    } else {
                        recons +=  palavra.charAt(k);
                    }
                }
                i--;
                palavra = recons;
            }
        }
    }
}