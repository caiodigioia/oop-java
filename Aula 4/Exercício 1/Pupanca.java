public class Poupanca {

  // declaração de atributos
  private static double taxaJuros = 0.5;
  private double saldo;
  
  // construtor
  public Poupanca (double depositoInicial) {
    saldo = depositoInicial;
  }
  
  // demais métodos
  public double getSaldoProjetado (int meses) {
    double saldoProjetado;
    
    saldoProjetado = saldo;
    
    for (int i = 0; i < meses; i++) {
      saldoProjetado = saldoProjetado + (saldoProjetado * taxaJuros / 100);
    }
    
    return saldoProjetado;
  }
  
  public void atualizaTaxaJuros (double novaTaxa) {
    taxaJuros = novaTaxa;
  }
  
}
