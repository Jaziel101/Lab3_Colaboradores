import java.util.Scanner;

public class fiboncacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos terminos?");
        int n = sc.nextInt();
        long a = 0, b = 1;
        for (int i = 0; i < n; i++){
            System.out.print(a +" ");
            long siguiente = a + b;
            a = b;
            b = siguiente;
        }
    }
}