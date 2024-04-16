//Ler uma frase e imprima-a sem as vogais

public class Ex15 {
    public static void main(String[] args){
        for(int i = args.length -1; i >= 0; i--){
            String inverter = "";
            for(int j = args[i].length() -1; j >= 0 ; j--){
                inverter += args[0].charAt(j);
            }
            System.out.print(inverter);
            if(i > 0){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}