package ClasesPuras;

public class Deposito extends Transaccion{

    public Deposito(String idTransaccion, java.util.Date fecha, double monto, Cuenta cuenta) {
        super(idTransaccion, fecha, monto, cuenta);
    }

    @Override
    public void ejecutar() {
        System.out.println("Ejecutando deposito de monto: " + monto + " de la cuenta: " + cuenta.getNumero());
        cuenta.setSaldo (cuenta.getSaldo() + monto); 
    }

}