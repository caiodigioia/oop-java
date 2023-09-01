public class InteiroNaoNegativo {
    // atributo
    private int numero;
    
    // construtor default
    public InteiroNaoNegativo() {
        numero = 0;
    }

    // construtor
    public InteiroNaoNegativo(int numero) {
    
        if (numero < 0)
            this.numero = 0;
        else this.numero = numero;
    
    }

    // metodo acesso
    public int getNumero() {
        return numero;
    }
    
    public long fatorial() {
    
        long fatorial;
        fatorial = 1;
        
        for (int i = 2; i <= numero; i++)
                fatorial = fatorial * i;
                  return fatorial;
        
        
       
    
    }


}
