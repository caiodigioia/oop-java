public class Euler {

  private double e;
  
  public Euler() {
  
  }
  
  public Euler(int nroTermos) {
     if (nroTermos < 3)
      e = calculoEuler(3);
     else e = calculoEuler(nroTermos);
     
    
  }
  public double getE() {
    return e;
  }
  private double calculoEuler(int nroTermos) {
    double e;
    InteiroNaoNegativo inn;
    
    e = 1.0;
    
    for (int i = 1; i <= nroTermos; i++) {
      inn = new InteiroNaoNegativo(i);
      e = e + (double)1/inn.fatorial();
    }
    
    return e;
    
    }
      
    
  }
