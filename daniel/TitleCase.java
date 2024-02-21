public class TitleCase {

    public static void main(String[] args){ 
   
        for (int i = 0; i < args.length; i++){
        
            String princar = args[i].substring(0,1).toUpperCase();
            String restcar = args[i].substring(1).toLowerCase();
            String frase = princar + restcar; 

            System.out.println(frase);
        }

    }
    
}
