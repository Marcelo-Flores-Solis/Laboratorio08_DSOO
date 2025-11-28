package ClasesPuras;

import java.util.Date;

public class Retiro extends Transaccion {

    public Retiro(String idTransaccion, Date fecha, double monto, Cuenta cuenta) {
        super(idTransaccion, fecha, monto, cuenta);
    }

    @Override
    public void ejecutar() {
        System.out.println("Ejecutando retiro de monto: " + monto + " de la cuenta: " + cuenta.getNumero());
        cuenta.setSaldo (cuenta.getSaldo() - monto); 
    }
}