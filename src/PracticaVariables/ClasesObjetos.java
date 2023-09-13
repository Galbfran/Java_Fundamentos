package PracticaVariables;

public class ClasesObjetos {
    //las clases son plantilas que definen los objetos a crear
    //los objetos son instancias de esas plantillas
    public static void main(String[] args) {
        Coche cocheUno = new Coche("toyota", "camry", 2022);

        cocheUno.mostrarinformacion();
    }

    public static class Coche{
        String marca;
        String modelo;
        int anio;

        public Coche(String marca, String modelo ,int anio){
            // this + .algo hace referencia a la variable fuera del metodo
            // la variable marca despues del igual hace referencia al valor de entrada
            this.marca = marca;
            this.modelo = modelo;
            this.anio = anio;
        }
        public void mostrarinformacion(){
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Año: " + anio);
        }
    }
}
