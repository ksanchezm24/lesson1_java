package model;

public class Wallet {

    public static final int CAPACIDAD_MAXIMA= 1000000; 
    //Las constantes deben ir en mayuscula y si son dos palabras 
    // Static y final hacen que esa constante sea una constante, 
    //el final hace que se genere la constante y el static hace que no se modifique el valor
    
    private int saldo;
    private boolean tieneLimite; //si la billetera tiene limite no va a poderse guardar el saldo

    public Wallet() {
        super();
        saldo=0;
        tieneLimite=true;
    }

    //obtener los datos si son privados y de esta forma cambiarlo
    //si el metodo retorna algo, debe colocarse de que tipo es
    //que valor me trae? Pues el saldo. Se pone la S mayuscula para ubicar la variable

    //ACCESIBILIDAD! ME TRAEN VALORES!

    public int getSaldo(){
        return saldo;    
    }

    public boolean getTieneLimite(){
        return tieneLimite;

    }

    //METODOS SET: No retornan ningun valorentonces se coloca void

    public void setTieneLimite(boolean newTieneLimite){
        tieneLimite=newTieneLimite;

    }

    // PRIMER COMPORTAMIENTO QUE ES GUARDAR PLATA
    //retorno un mensaje
    // verificamos si la biletera tiene un limite, si excede el limite no se puede guardar.
    // si estoy pasando el limite debo sumar el saldo mas el valor que llega y verificar que no exceda la capacidad maxima
        

    public String saveMoney(int value){
        if (saldo + value > CAPACIDAD_MAXIMA && tieneLimite) {
            return"No se puede superar el limite" + CAPACIDAD_MAXIMA;
        }
        saldo+=value; // saldo = saldo + value
        
        return "Transaccion exitosa, su nuevo saldo" + saldo;
    }
    

    //Retirar dinero
    // que me diga q no excede mi saldo y q despues me muestre mi nuevo saldo que me queda
    
    public String takeMoney(int value){
        if (saldo <= value) {
            return"Saldo Insuficiente ";
        }
        saldo-=value; // saldo = saldo - value
        
        return "Transaccion exitosa, su nuevo saldo " + saldo;
    
    }
    // ELIMINAR LIMITES (TIENE LIMITE ES FALSO)
    //EL SALDO DEBE SER MAYOR A 10mil

    public String breakLimit(){
        if (!tieneLimite) {
            return "Tu cuenta no tiene limites! ";
                    }
        if (saldo >= 10000) {
            saldo -= 10000; // Se restan los 10mil para poder romper los limites
            setTieneLimite(false); //o tambien se puede hacer con tieneLimite = false;
            return"Transacción Exitosa, has roto los limites ";
        }           
        return "Saldo insuficiente para realizar la transacción ";
    }        

    public String compararCuenta(Wallet otraWallet) {
        if (saldo == otraWallet.getSaldo()) {
            return "Las cuentas tienen el mismo saldo";
        }
        if (saldo > otraWallet.getSaldo()) {
            return "la primera cuenta es mayor";
        }
        return "La segunda cuenta es mayor";
        
    }
}
