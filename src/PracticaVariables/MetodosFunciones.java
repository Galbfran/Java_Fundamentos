package PracticaVariables;

public class MetodosFunciones {
    //los metodos son bloques de codigo reutilizables
    public static int sumar(int numUno, int numDos){
        int resultado = numDos + numUno;
        return resultado;
    }
    public static void main(String[] args) {
        int resultadoSuma = sumar(5,3);
        System.out.println(resultadoSuma);
    }
}
