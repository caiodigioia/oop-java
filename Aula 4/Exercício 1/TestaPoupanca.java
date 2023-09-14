public class TestaPoupanca {
    
    public static void main(String args[]) {
    
        Poupanca p1, p2, p3; // poupança
        
        // instanciação objetos poupança
        p1 = new Poupanca(100);
        p2 = new Poupanca(500);
        p3 = new Poupanca(50000);
        
        // saldo projetado após período de tempo
        System.out.println("Taxa padrão: 0.5% a.m");
        System.out.printf("Poupança 1: %.2f\n", p1.getSaldoProjetado(10));
        System.out.printf("Poupança 2: %.2f\n", p2.getSaldoProjetado(10));
        System.out.printf("Poupança 3: %.2f\n", p3.getSaldoProjetado(10));
        System.out.println(); // pula linha
        
        // atualiza taxa de juros
        p2.atualizaTaxaJuros(0.25);
        
        // saldo projetado após período de tempo
        System.out.println("Taxa reduzida: 0.25% a.m");
        System.out.printf("Poupança 1: %.2f\n", p1.getSaldoProjetado(100));
        System.out.printf("Poupança 2: %.2f\n", p2.getSaldoProjetado(100));
        System.out.printf("Poupança 3: %.2f\n", p3.getSaldoProjetado(100));
        System.out.println(); // pula linha
        
        // atualiza taxa de juros
        p2.atualizaTaxaJuros(1.0);
        
        // saldo projetado após período de tempo
        System.out.println("Taxa aumentada: 1.0% a.m");
        System.out.printf("Poupança 1: %.2f\n", p1.getSaldoProjetado(100));
        System.out.printf("Poupança 2: %.2f\n", p2.getSaldoProjetado(100));
        System.out.printf("Poupança 3: %.2f\n", p3.getSaldoProjetado(100));
        System.out.println(); // pula linha
        
        
    }
}
