package poofigura;


public class figura {
    private Double base;
    private Double altura;
    
public figura (){
    
}

  public figura(Double base, Double altura) {
    this.base = base;
    this.altura = altura;
  }

  
 
   
    public double calcularArea (){
        System.out.println("calcular Area");
        return this.altura*this.base;
    }

  public Double getBase() {
    return base;
  }

 
  public void setBase(Double base) {
    this.base = base;
  }

 
  public Double getAltura() {
    return altura;
  }

  
  public void setAltura(Double altura) {
    this.altura = altura;
  }

  int CalcularArea() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
}
