public class aula0503 {

    public static void main(String[] args) {
        
        int n = Integer.parseInt(args[0]);
        int res = 1;

        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        System.out.println(res);
    }
}

// EXERCICIO DE ACHAR O FATORIAL DO NÚMERO.