package actsuma;

import java.util.Scanner;

public class ActSuma {

    public int[] data;
    public int n;

    // Constructor: crea vector de tamaño n
    public ActSuma(int n) {
        this.n = n;
        this.data = new int[n];
    }

    // Método para ingresar valores uno por uno
    public void setArray() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresar los datos" + i + ": ");
            data[i] = sc.nextInt();
        }
    }

    // Método para imprimir el vector
    public void print(String name) {
        System.out.print(name + " = [ ");

        for (int i = 0; i < n; i++) {
            System.out.print(data[i]);
            if (i < n - 1) System.out.print(", ");
        }

        System.out.println(" ]");
    }

    public int sum() {
        int s = 0;
        for (int i = 0; i < n; i++) s += data[i];
        return s;
    }
    public double mean(){
        
        if (n==0) return (int) 0.0;
        return ((double) sum()/(double) n);
        
    }
    public int max(){
        int m = data[0];
        for(int i=1; i<n;i++){
            if(data[i]>m)
                m =data[i];
        }
        return m;
    }
        public int min(){
        int m = data[0];
        for(int i=1; i>n;i++){
            if(data[i]<m)
                m =data[i];
        }
        return m;}
    
    public static void main(String[] args) {
        ActSuma ob1 = new ActSuma(5);
        
        ob1.setArray();
        ob1.print("Vector");

        System.out.println("La Suma de los datos ingresados es: = " + ob1.sum());
        System.out.println("El Promedio de los datos ingresados es: = " + ob1.mean());
        System.out.println("El Maximo de los datos ingresados es: = " + ob1.max());
        System.out.println("El Minimo de los datos ingresados es: = " + ob1.min());

    }
}