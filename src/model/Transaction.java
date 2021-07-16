package model;

public class Transaction {

    private int ammount;
    private String fecha;
    /**
     * Tipo de transaccion 1. Ingreso 2. Retiro Cuando es 1 es un tipo de
     * transaccion donde ingreso dinero y dos es un tipo de transaccion donde slaio
     * dinero.
     */
    private int type;

    /**
     * 
     * @param ammount valor del movimiento
     * @param fecha fecha en la cual se realiza el movimiento
     * @param type tipo de movimiento, 1== ingreso, 2== retiro
     */

    
    private String description;

    public Transaction(int ammount, String fecha, int type, String description) {
        super();
        this.ammount = ammount;
        this.fecha = fecha;
        this.type = type;
        this.description=description;
    }

    public int getAmmount() {
        return ammount;
    }

    public String getFecha() {
        return fecha;
    }

    public int getType() {
        return type;        
    }
    public String getDescription() {
        return description;
    }

    public String toString(){
        return "Monto:$ "+ammount+" Fecha: "+fecha+ " Tipo: "+((type==1)?"Ingreso":"Egreso")+ ", Descripción: "+description;
    }
}
