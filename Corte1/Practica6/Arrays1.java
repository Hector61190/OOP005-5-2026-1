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
    public Arrays1 sumar(Arrays1 otro){
        Arrays1 resultado = new Arrays1(n);
        for (int i =0; i< n; i++){
            resultado.vector[i]=
                    this.vector [i] + otro.vector[i];    
        }
        return resultado;
        
    }
    public Arrays1 multiplica(Arrays1 otro){
        Arrays1 multiplica = new Arrays1(n);
        for (int i =0; i< n; i++){
            multiplica.vector[i]=
                    this.vector [i] + otro.vector[i];    
        }
        return multiplica;
        
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Tamano n: ");
        int n = sc.nextInt();

        Arrays1 v1 = new Arrays1(n);
        Arrays1 v2 = new Arrays1(n);
        
        System.out.println("\nIngrese valores del vector 1");
        v1.setValores();
        
        System.out.println("\nIngrese valores del vector 2");
        v2.setValores();
        
        Arrays1 suma = v1.sumar(v2);
        System.out.println("\nVector1:");
        v1.getValores();
        System.out.println("\nVector2:");
        v2.getValores();
        
        System.out.println("Suma de vectores");
        suma.getValores();
        
        Arrays1 multiplica = v1.multiplica(v2);
        System.out.println("\nVector1:");
        v1.getValores();
        System.out.println("\nVector2:");
        v2.getValores();
        
        System.out.println("Multiplicacion de vectores");
        multiplica.getValores();
        
        
        sc.close();
    }
}