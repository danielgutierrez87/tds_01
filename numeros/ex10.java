//Crie um programa para verificar se os números são palíndromos ou não

public class ex10 {
    public static void main(String[] args){
        for(int i = 0; i < args.length; i++){
            String contrario = "";
            for(int j = args[i].length() -1; j >=0 ; j--){
                contrario += args[i].charAt(j);
            }
            if(args[i].equals(contrario)){
                System.out.println("É palindromo");
            } else {
                System.out.println("Não é palindromo");
            }
        }
    }
}