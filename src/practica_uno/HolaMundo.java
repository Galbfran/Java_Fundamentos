package practica_uno;

public class HolaMundo {
    public static void main(String[] args) {
        int numUno = 10 ;
        int numDos = 20 ;
        //guardo resultado
        int resultado = numUno + numDos;

        System.out.println("Sumas variables");
        System.out.println(numUno + numDos);
        System.out.println(resultado + 5.77);

        boolean resultadoUno = numUno > numDos;
        boolean resulatadoDos = numUno < numDos;

        System.out.println("booleanos");
        System.out.println(resultadoUno);
        System.out.println(resulatadoDos);
    }
}
