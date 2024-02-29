//Crie um programa para gerar a série de Fibonacci até um número dado

public class ex08 {
    public static void main(String[] args){
        int numero = Integer.parseInt(args[0]);
        int a = 0, b = 1, c = 0;
        for(int i = 0; i < numero; i++){
            if(i == 0){
                System.out.print(a);

                if(i < numero -1){
                    System.out.print(" ");
                }
            }
            else if(i == 1){
                System.out.print(b);

                if(i < numero -1){
                    System.out.print(" ");
                }
            }
            else{
                c = a + b;
                System.out.print(c);
                a = b;
                b = c;
                
                if(i < numero -1){
                    System.out.print(" ");
                }
            }
        }
        System.out.println(" ");
    }
}



/*import java.util.ArrayList;
public class Ex08{
    public static void main(String[] args){
        int numero = Integer.parseInt(args[0]);
        int n = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < numero; i++){
            if(i == 0){
                arr.add(0);
            }
            else if(i == 1){
                arr.add(1);
            }
            else{
                arr.add(arr.get(0 + n) + arr.get(1 + n));
                n++;
            }
        }
        for(int j = 0; j < arr.size(); j++){
            System.out.print(arr.get(j));
            if(j < arr.size() -1){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
*/