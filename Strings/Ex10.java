//Leia uma frase e converta para "camelCase"

public class Ex10 {
    public static void main(String[] args){
        String camelCase = "";
        System.out.print(args[0].toLowerCase());
        for(int i = 1; i < args.length; i++){
            camelCase = args[i].substring(0,1).toUpperCase() + args[i].substring(1).toLowerCase();
            System.out.print(camelCase);
        }
        System.out.println();
    }
}