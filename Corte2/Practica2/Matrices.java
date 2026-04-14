package matrices;
import java.util.Scanner;

public class Matrices { 
    private int[][] matrix;
    private int rows;
    private int cols;

    public Matrices(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new int[rows][cols];
    }

    public void fillMatrix(Scanner sc, String name) {
        System.out.println("\n Llenando Matriz " + name + " (" + rows + "x" + cols + ")");
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Matriz " + name + " , Fila " + (i + 1) + ", Columna " + (j + 1) + ": ");
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public void print(String name) {
        System.out.println("\nMatriz " + name + ":");
        for (int i = 0; i < rows; i++) {
            System.out.print("( ");
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println(")");
        }
    }

    // Cambiado Vectorheca por Matrices
    public static void sumar(Matrices m1, Matrices m2) {
        if (m1.rows == m2.rows && m1.cols == m2.cols) {
            Matrices res = new Matrices(m1.rows, m1.cols);
            for (int i = 0; i < m1.rows; i++)
                for (int j = 0; j < m1.cols; j++)
                    res.matrix[i][j] = m1.matrix[i][j] + m2.matrix[i][j];
            res.print("Suma");
        } else {
            System.out.println("\n ERROR EN SUMA: Las matrices deben ser de la misma proporcion.");
        }
    }

    public static void restar(Matrices m1, Matrices m2) {
        if (m1.rows == m2.rows && m1.cols == m2.cols) {
            Matrices res = new Matrices(m1.rows, m1.cols);
            for (int i = 0; i < m1.rows; i++)
                for (int j = 0; j < m1.cols; j++)
                    res.matrix[i][j] = m1.matrix[i][j] - m2.matrix[i][j];
            res.print("Resta");
        } else {
            System.out.println("\n ERROR EN RESTA: Las matrices deben ser de la misma propotcion.");
        }
    }

    public static void multiplicar(Matrices m1, Matrices m2) {
        if (m1.cols == m2.rows) {
            Matrices res = new Matrices(m1.rows, m2.cols);
            for (int i = 0; i < m1.rows; i++) {
                for (int j = 0; j < m2.cols; j++) {
                    for (int k = 0; k < m1.cols; k++) {
                        res.matrix[i][j] += m1.matrix[i][k] * m2.matrix[k][j];
                    }
                }
            }
            res.print("Multiplicacion");
        } else {
            System.out.println("\n ERROR EN MULTIPLICACION: Columnas de Matriz 1 (" + m1.cols +") no coinciden con Filas de Matriz 2 (" + m2.rows + ").");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Ingrese los valores para la Matriz 1");
        System.out.print("Cuantas filas? "); int f1 = sc.nextInt();
        System.out.print("Cuantas columnas? "); int c1 = sc.nextInt();
        Matrices m1 = new Matrices(f1, c1);
        m1.fillMatrix(sc, "1");

        System.out.println("\n Ingrese valores para la Matriz 2");
        System.out.print("Cuantas filas? "); int f2 = sc.nextInt();
        System.out.print("Cuantas columnas? "); int c2 = sc.nextInt();
        Matrices m2 = new Matrices(f2, c2);
        m2.fillMatrix(sc, "2");

        m1.print("1");
        m2.print("2");
        
        System.out.println("\nRESULTADO ");
        sumar(m1, m2);
        restar(m1, m2);
        multiplicar(m1, m2);
        
        sc.close(); 
    }
}
