//Leia uma frase e converta para "kebab-case". (também conhecido como "slug")

public class Ex09 {
    public static void main(String[] args){
        String kebabcase = "";
        for(int i = 0; i < args.length; i++){
            kebabcase = args[i].toLowerCase();
            System.out.print(kebabcase);
            if(i < args.length -1){
                System.out.print("-");
            }
        }
        System.out.println();
    }
}