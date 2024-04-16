//Leia n strings, imprima quantas letras tem a junção de todas elas

public class Ex02 {
    public static void main(String[] args){
        String juntar = "";
        for(int i = 0; i < args.length; i++){
            juntar += args[i];
        }
        System.out.println(juntar.length());
    }
}
