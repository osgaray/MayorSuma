import java.util.Scanner;

public class App {

    // definir las variables que se van a utilizar
    public static int num1;
    public static int num2;
    public static int num3;

    // crear un metodo que sume los dos minimos de tres numero
    public static int sumaMinimos(int n1,int n2,int n3) {
        // obtener el minimo entre n1 y n2
        int primermin = Math.min(n1, n2);
        // obtener el que no es el minimo entre n1 y n2, o sea el mayor
        int mayor = Math.max(n1,n2);
        // obtener el segundo minimo entre  el mayor y n3
        int segundomin = Math.min(mayor,n3);
        // retornar la suma
        return primermin + segundomin;
    }

    // crear un metodo que reste los dos maximos de tres numeros
    public static int restaMaximo(int n1,int n2,int n3) {
        // obtener el maximo entre n1 y n2
        int primermax = Math.max(n1, n2);
        // obtener el que no es el maximo entre n1 y n2, o sea el menor
        int menor = Math.min(n1,n2);
        // obtener el segundo mayor entre el menor y n3
        int segundomax = Math.max(menor,n3);
        // retornar la resta en valor absoluto para eliminar signo negativo (dar la diferencia)
        return Math.abs(primermax-segundomax);
    }

    public static void main(String[] args) throws Exception {
        // instancia del scanner
        Scanner input = new Scanner(System.in);

        // repetir el proceso para ingresar datos hasta que sean diferentes
        do {
            // intentar cuando el usuario digite los numeros de forma correcta (de tipo entero)
            try {
                System.out.println("Ingrese tres números diferentes");
                num1 = input.nextInt();
                num2 = input.nextInt();
                num3 = input.nextInt();
            // capturar la excepcion si son numeros iguales    
            } catch (Exception e){
                System.out.println(e);
                System.out.println("Debes ingresar numeros diferentes");
            }             
        } while (num1 == num2 || num2==num3 || num1==num3);
            // intentar cuando el usuario digite los numeros diferentes       
        
        // imprimir la suma de los numeros minimos
        System.out.println("La suma de los numeros menores es: "+sumaMinimos(num1, num2, num3));
        // imprimir la resta de los numeros maximos
        System.out.println("La resta de los numeros mayores es: "+restaMaximo(num1, num2, num3));
        // imprimir el mayor (el maximo entre num1 y num2, luego entre num3)
        System.out.println("El numero mayor es: "+ Math.max(Math.max(num1,num2),num3));
        input.close();
    }
}

