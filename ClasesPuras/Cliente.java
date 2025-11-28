package ClasesPuras;
import java.util.List;

public class Cliente extends Persona {
    private String idCliente;
    private String correo;
    private String estado;
    private List<Cuenta> cuentas;

    // Getters and Setters
    public String getIdCliente() { return idCliente;}
    public String getCorreo() { return correo; }
    public String getEstado() { return estado; }
    public List<Cuenta> getCuentas() { return cuentas; }

    public void setIdCliente(String idCliente) { this.idCliente = idCliente;}
    public void setCorreo(String correo) { this.correo = correo; }
    public void setEstado(String estado) { this.estado = estado; }
    public void setCuentas(List<Cuenta> cuentas) { this.cuentas = cuentas;}
    

    public Cliente(String nombre, String apellido, String dni, String telefono, String direccion, String idCliente, String correo, String estado) {
        super(nombre, apellido, dni, telefono, direccion);
        this.idCliente = idCliente;
        this.correo = correo;
        this.estado = estado; 
    }
    public void registrarCliente(){

    }
   public void actualizarDatos(String nuevoCorreo, String nuevaDireccion) {
        this.correo = nuevoCorreo;
        super.direccion = nuevaDireccion;
    }
    public List<Cuenta> consultarCuentas(){
        return this.cuentas;
    }
    
}
