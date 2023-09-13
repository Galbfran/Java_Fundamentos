package codewars;
//Crea una función que responda a la pregunta "¿Estás tocando el banjo?".
//Si tu nombre comienza con la letra "R" o "r" minúscula, ¡estás tocando el banjo!
//
//La función toma un nombre como único argumento y devuelve una de las siguientes cadenas:
//name + " plays banjo"
//name + " does not play banjo"


public class Ejercicio_uno {
    public static void main(String[] args){
        String nameUno = "Martin";
        String nameDos = "Rikke";
        String nameTres = "martin";
        String nameCuatro = "rikke";

        mensaje(nameUno);
        mensaje(nameDos);
        mensaje(nameTres);
        mensaje(nameCuatro);
    }

    public static void mensaje(String nombre) {
        String variable = nombre.toUpperCase();
        boolean validation = variable.charAt(0) == nombre.charAt(0);
        if(validation){
            System.out.println(nombre + " plays banjo");
        }else{
            System.out.println(nombre + " does not play banjo");
        }
    }
}
