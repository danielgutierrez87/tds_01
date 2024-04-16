//Leia uma frase e converta para "Title Case"

public class Ex07 {
    public static void main(String[] args){
        String Titlecase = "";
        for(int i = 0; i < args.length; i++){
            Titlecase = args[i].substring(0,1).toUpperCase() + args[i].substring(1).toLowerCase();
            System.out.print(Titlecase);
            if(i < args.length -1){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}