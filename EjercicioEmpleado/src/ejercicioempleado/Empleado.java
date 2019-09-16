package ejercicioempleado;

import java.util.Date;

public class Empleado {
    private Integer legajo;
    private String nombre;
    private String apellido;
    private Long dni;
    private Date fechaNac;
    private Date fechaIngreso;
    private String categoria;
    private Double valorHora;
    private Integer hsTrabajadas;
    

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Integer getHsTrabajadas() {
        return hsTrabajadas;
    }

    public void setHsTrabajadas(Integer hsTrabajadas) {
        this.hsTrabajadas = hsTrabajadas;
    }

    public Empleado(String nombre, String apellido, Date fechaNac, Date fechaIngreso, Long dni, String categoria) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.fechaIngreso = fechaIngreso;
        this.dni = dni;
        this.categoria = categoria;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public Double calcularSalario(){
        return this.getHsTrabajadas()*this.getValorHora();
    }
}
