package ArregloPractica5Matriz;

import java.util.Scanner;

public class Arrays1 {

    // atributos privados
    private int[] vector;
    private int n;

    // constructor
    public Arrays1(int n) {
        this.n = n;
        this.vector = new int[n];
    }

    // SET -> ingresar valores
    public void setValores() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.print("vector[" + i + "]: ");
            vector[i] = sc.nextInt();
        }
    }

    // GET -> mostrar valores
    public void getValores() {
        System.out.print("Vector = [ ");

        for (int i = 0; i < n; i++) {
            System.out.print(vector[i]);

            if (i < n - 1) {
                System.out.print(" , ");
            }
        }

        System.out.println(" ]");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Tamano n: ");
        int n = sc.nextInt();

        Arrays1 v = new Arrays1(n);

        v.setValores();
        v.getValores();

        sc.close();
    }
}