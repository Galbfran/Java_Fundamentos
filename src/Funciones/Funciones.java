package Funciones;

public class Funciones {
    public static void main(String[] args) {



        // funciones
            // opcion 1: funcion sin parametros y sin tipo de retorno
                showMenu();

            // opcion 2: funcion sin parametro y con tipo de retorno
                String menu = getMenu();
                System.out.println(menu);
                double price = getPrice();
                System.out.println(price);

            // opcion 3: funcion con parametro y sin retorno
                 imprimirSaludo("Practica Java");
            // opcion 4: funcion con parametro y retorno

            String apellido = "franco";
            String nombre = "galbiati";
            String saludo = obtenerSaludo( nombre , apellido);
            System.out.println(saludo);


            int resultadoSuma = suma(50 , 200);
            System.out.println(resultadoSuma);
    }

     static int suma(int numUno, int numDos) {
        return numDos + numUno;
    }

    static String obtenerSaludo(String nombre , String apellido) {
        return "Hola "+ nombre + apellido;
    }

    static void imprimirSaludo(String practicaJava) {
        System.out.println(practicaJava);
    }

    static double getPrice() {
        return 100.11;
    }

    static void showMenu(){
        System.out.println("bienvenidos al ecomerce");
        System.out.println("1 - ver zapatillas");
        System.out.println("2 - comprar zapatillas");
        System.out.println("3 - salir");
    }

    static String getMenu(){
        return "bienvenidos al ecomerce: \n 1 - ver zapatillas";
    }
}
