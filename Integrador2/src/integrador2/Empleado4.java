package integrador2;

public class Empleado4 {
    private String Nombre;
    private String Apellido;
    private Integer DNI;
    private String Localidad;
    private Integer AñosAntigüedad;
    private Integer Telefono;
    private Double Salario;

    public Empleado4() {
    }

    public Empleado4(String Nombre, String Apellido, Integer DNI, String Localidad, Integer AñosAntigüedad, Integer Telefono, Double Salario) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.DNI = DNI;
        this.Localidad = Localidad;
        this.AñosAntigüedad = AñosAntigüedad;
        this.Telefono = Telefono;
        this.Salario = Salario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }

    public Integer getAñosAntigüedad() {
        return AñosAntigüedad;
    }

    public void setAñosAntigüedad(Integer AñosAntigüedad) {
        this.AñosAntigüedad = AñosAntigüedad;
    }

    public Integer getTelefono() {
        return Telefono;
    }

    public void setTelefono(Integer Telefono) {
        this.Telefono = Telefono;
    }

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double Salario) {
        this.Salario = Salario;
    }
    
}
