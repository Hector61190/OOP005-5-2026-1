package vectorheca;
import java.util.Scanner;
public class Vectorheca {

    public int[] data;
    public int n;

    // Constructor: crea vector de tamaño n
    public Vectorheca(int n) {
        this.n = n;
        this.data = new int[n];
    }

    // Método para ingresar valores uno por uno
    public void setArray() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresar el valor para la posicion " + i + ": ");
            data[i] = sc.nextInt();   // guarda el valor en el vector
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

    public static void main(String[] args) {
        Vectorheca ob1 = new Vectorheca(8);

        ob1.setArray();      // ingresar valores
        ob1.print("Hola");   // mostrar resultado
    }
}