package poofigura;


public class circulo {
    private Long Radio;
    private Long Diametro;

    public circulo(Long Radio, Long Diametro) {
        this.Radio = Radio;
        this.Diametro = Diametro;
    }

    public circulo() {
    }
    
    
    public void CalcularArea(){
        
    }

  public Long getRadio() {
    return Radio;
  }

  public void setRadio(Long Radio) {
    this.Radio = Radio;
  }

  public Long getDiametro() {
    return Diametro;
  }

  public void setDiametro(Long Diametro) {
    this.Diametro = Diametro;
  }
    

}