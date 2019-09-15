package colecciones;

public class unaClase {
    private String unAtributoString;
    private Integer unAtributoEntero;
    private Boolean unAtributoBoolean;

    public unaClase(String unAtributoString, Integer unAtributoEntero, Boolean unAtributoBoolean) {
        this.unAtributoString = unAtributoString;
        this.unAtributoEntero = unAtributoEntero;
        this.unAtributoBoolean = unAtributoBoolean;
    }

    public unaClase() {
    }

    public String getUnAtributoString() {
        return unAtributoString;
    }

    public void setUnAtributoString(String unAtributoString) {
        this.unAtributoString = unAtributoString;
    }

    public Integer getUnAtributoEntero() {
        return unAtributoEntero;
    }

    public void setUnAtributoEntero(Integer unAtributoEntero) {
        this.unAtributoEntero = unAtributoEntero;
    }

    public Boolean getUnAtributoBoolean() {
        return unAtributoBoolean;
    }

    public void setUnAtributoBoolean(Boolean unAtributoBoolean) {
        this.unAtributoBoolean = unAtributoBoolean;
    }
    
    
}
