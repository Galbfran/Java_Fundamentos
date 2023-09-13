package PracticaVariables;

public class Operadores {
    public static void main(String[] args) {
        boolean operador = false;

        System.out.println("tipo operadores:");
        //negacion !
        if(!operador){
            System.out.println("operador negacion cambio a true.Operador:"+ !operador);
        }
        // Y && si uno es falso devuelve falso

        if(true && operador){
            System.out.println("no entra aca");
        }else{
            System.out.println("Caso else");
        }
        //|| caso o uno o el otro
        if(true || operador){
            System.out.println("entra en el if");
        }else{
            System.out.println("Caso else");
        }
    }
}
