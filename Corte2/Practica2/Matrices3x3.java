package matrices3x3;

import java.util.Scanner;

public class Matrices3x3 {

    private final int[][] valor;
    private final int filas = 3;
    private final int columnas = 3;


    public Matrices3x3() {
        valor = new int[filas][columnas];
    }


    public void setmatriz3x3(Scanner sc) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("valor[" + i + "][" + j + "]: ");
                valor[i][j] = sc.nextInt();
            }
        }
    }

    public void getmatriz3x3() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(valor[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public Matrices3x3 sumar(Matrices3x3 otra) {
        Matrices3x3 resultado = new Matrices3x3();
        System.out.println("\n Matriz Suma");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado.valor[i][j] = this.valor[i][j] + otra.valor[i][j];
                System.out.print(resultado.valor[i][j] + "\t");
            }
            System.out.println();
        }
        return resultado;
    }

    public Matrices3x3 multiplicar(Matrices3x3 otra) {
        Matrices3x3 resultado = new Matrices3x3();
        System.out.println("\n Matriz Multiplicacion");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado.valor[i][j] = 0;
                for (int k = 0; k < columnas; k++) {
                    resultado.valor[i][j] += this.valor[i][k] * otra.valor[k][j];
                }
                System.out.print(resultado.valor[i][j] + "\t");
            }
            System.out.println();
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Matriz 1 (3x3):");
        Matrices3x3 m = new Matrices3x3();
        m.setmatriz3x3(sc);

        System.out.println("\nMatriz 2 (3x3):");
        Matrices3x3 n = new Matrices3x3();
        n.setmatriz3x3(sc);

        System.out.println("\nMatriz 1:");
        m.getmatriz3x3();

        System.out.println("\nMatriz 2:");
        n.getmatriz3x3();

        // Operaciones
        m.sumar(n);
        m.multiplicar(n);

        sc.close();
    }
}
