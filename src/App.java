public class App {

    private String nombre;
    private int edad;
    private char sexo; 
    // char guarda solo 1 letra.
    private double estatura;
    // double es para numero con decimales
    private float peso;
    // En java es mejor usar las herramientas estandar para defiir las variables, se coloca la primera en minuscula y la segunta en mayuscula
    private boolean estadoCivil;




    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        // Tipos de Datos y Operadores
        String res= "Hola";
        int resultado = 15+32;
        int resultado3= 125 - 32;
        double resultado2= 25/3;
        float resultado4= 58*21;
        int resultado5= 21%9;

        //Operadores Unarios: Permiten trabajar con un solo valor
        //el ++ toma el valor inicial de la variable y lo aumenta en uno
        // el -- resta 1
        // el -variable, convierte la variable a valores negativos
        // el +variable, convierte la variable a positiva
        resultado++;
        resultado--;
        resultado = -resultado;
        resultado = +resultado;

        //Operadores Logicos
        boolean respuesta = true;
        respuesta = 5 > 8;
        respuesta = 5 < 8;
        respuesta = 5 <= 8;
        respuesta = 5 >= 8;
        respuesta = 5 != 8; // NOT
        respuesta = 5 == 8;

        //Conectores
        
        respuesta = 12 < 5 && 4 > 1;
        respuesta = 14 < 25 || 1 > 5;

        //Operadores Bit a Bit
        // &
        // ^ comparando dos expresiones lógicas 
        // | Hace algunas operaciones


        // Estructuras de Control

        if (respuesta) {
            //Bloque de codigo
            
        }
        if (respuesta) {
            //bloque de codigo si se cumple
            
        } else if (respuesta) {
            
        } {
            //bloque de codigo si no se cumple
            
        }


    }
}
