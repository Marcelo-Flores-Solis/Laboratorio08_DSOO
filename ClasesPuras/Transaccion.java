package ClasesPuras;

import java.util.*;

public class Transaccion {
    protected String idTransaccion;
    protected Date fecha;
    protected double monto;
    protected Cuenta cuenta;

    public Transaccion(String idTransaccion, Date fecha, double monto, Cuenta cuenta) {
        this.idTransaccion = idTransaccion;
        this.fecha = fecha;
        this.monto = monto;
        this.cuenta = cuenta;   
    }

    public void setIdTransaccion(String idTransaccion) { this.idTransaccion = idTransaccion;}
    public void setFecha(Date fecha) { this.fecha = fecha; }
    public void setMonto(double monto) { this.monto = monto; }

    public String getIdTransaccion() { return idTransaccion; }
    public Date getFecha() { return fecha; }
    public double getMonto() { return monto; }

     @Override
    public String toString() {
        return "Transaccion{" +
                "idTransaccion='" + idTransaccion + '\'' +
                ", fecha=" + fecha +
                ", monto=" + monto +
                '}';
    }
    public void ejecutar() {
        // Implementación genérica o dejar vacío para que las subclases lo implementen
    }
}
