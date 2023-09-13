package PracticaVariables;

public class EstructurasControl {
    public static void main(String[] args) {
        // if si algo es verdadero realiza una accion
        // caso contrario pasa al else
        byte edad = 31;
        if(edad >18){
            System.out.println("puedo manejar un auto");
        }else{
            System.out.println("no puedo manejar");
        }
        // bucle for usado para recorrer listas o repetir iteraciones
        for (int i = 0 ; i < 5 ; i++){
            System.out.println("Iteracion " + i);
        }
        //while recorrer codigo mientras una condicion es verdadera
        // no olvidares de poner un caso de cierre o contador posible bucle infinito
        int contador = 0;
        while (contador < 5){
            System.out.println("Contador" + contador);
            contador++;
        }
        // switch toma decisiones basadas en el valor de una exprecion
        int numeroDia = 3;
        String dia;
        switch (numeroDia){
            case 1:
                dia = "lunes";
                System.out.println(dia);
                break;
            case 2:
                dia = "martes";
                System.out.println(dia);
                break;
            default:
                dia = "miercoles";
                System.out.println(dia);
        }
    }
}
