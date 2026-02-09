
package calculadora;


public class Calculadora {
    public int x1,x2;
    
//constructor tiene el mismo nombre de la clase    
    public Calculadora (int a, int b){
       x1= a;
       x2= b;
    }
   
    public int suma(){
        return x1 + x2;
    }
    
        public int resta(){
        return x1 - x2;
    }
       
        public int multi(){
        return x1 * x2;
    }
        
        public int divi(){
        return x1 / x2;
    }


    public static void main(String[] args) {
        Calculadora m = new Calculadora (10, 2);
        Calculadora n = new Calculadora (20, 4);
        System.out.println("La suma con el objeto m es :" + n.suma()+m.resta());
        System.out.println("La resta con el objeto m es :" +m.resta());
        System.out.println("La multiplicacion con el objeto m es :" +m.multi());
        System.out.println("La division con el objeto m es :" +m.divi()); 
        
    }
    
}
//paquete una carpeta llena de clase
//