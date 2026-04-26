package matrices2x2;

import java.util.Scanner;

public class Matrices2x2 {

    private final int[][] data;
    private final int filas = 2;
    private final int columnas = 2;

    public Matrices2x2() {
        data = new int[filas][columnas];
    }

    public void getvector(Scanner sc) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Valor[" + i + "][" + j + "]: ");
                data[i][j] = sc.nextInt();
            }
        }
    }


    public void setvector() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }


    public Matrices2x2 sumar(Matrices2x2 otra) {
        Matrices2x2 resultado = new Matrices2x2();
        System.out.println("\n Matriz Suma");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado.data[i][j] = this.data[i][j] + otra.data[i][j];
                System.out.print(resultado.data[i][j] + " ");
            }
            System.out.println();
        }
        return resultado;
    }


    public Matrices2x2 multiplicar(Matrices2x2 otra) {
        Matrices2x2 resultado = new Matrices2x2();
        System.out.println("\n Matriz Multiplicacion ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado.data[i][j] = 0;
                for (int k = 0; k < columnas; k++) {
                    resultado.data[i][j] += this.data[i][k] * otra.data[k][j];
                }
                System.out.print(resultado.data[i][j] + " ");
            }
            System.out.println();
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("matriz 1:");
        Matrices2x2 m = new Matrices2x2();
        m.getvector(sc);
        
        System.out.println("\n matriz 2:");
        Matrices2x2 n = new Matrices2x2();
        n.getvector(sc);

        System.out.println("\nMatriz 1:");
        m.setvector();
        
        System.out.println("\nMatriz 2:");
        n.setvector();

        m.sumar(n);
        m.multiplicar(n);
        
        sc.close();
    }
}
