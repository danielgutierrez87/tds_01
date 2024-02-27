public class exVogais {
    public static void main(String[] args) {

        String vogais = "aeiouAEIOU";
        char ch;
        int cont; 
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args[i].length; i++){
                ch = args[i].charAt(j);
                for (int k = 0; k < vogais.length(); k++) {
                    cont = 0;
                    if (ch == vogais.charAt(k)) {
                        System.out.print(args[i].indexOf(ch));
                        cont++;
                    }
                    if (cont > 0) {
                        System.out.print(" "); 
                    }
                }
            }
        }
        if (i < args.length -1) {
            System.out.print(" ");
        }
        System.out.println();
    }
}