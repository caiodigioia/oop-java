public class Invoice {
	// declaração de atributos
		private String codFatura; // codigo da fatura
		private String descricao; // descricao do item
		private int qtde;		  // quantidade de itens
		private double precoItem; // preço item
		
		// construtor
		public Invoice (String codFatura, String descricao, int qtde, double preco) {
		/*	this.codFatura = codFatura;
			this.descricao = descricao;
			
			if (qtde < 0)
				this.qtde = 0;
			else this.qtde = qtde;
			
			if (precoItem < 0)
				this.precoItem = 0;
			else this.precoItem = precoItem; 
			*/
			setCodFatura(codFatura);
			setDescricao(descricao);
			setQtde(qtde);
			setPrecoItem(preco);
		}
		
		// metodos acessores
		public String getCodFatura () {
			return codFatura;
		}
		
		public void setCodFatura (String novoCod) {
			codFatura = novoCod;
		}
		
		public String getDescricao() {
			return descricao;
		}
		
		public void setDescricao (String novaDescricao) {
			descricao = novaDescricao;
		}
		
		public int getQtde() {
			return qtde;
		}
		
		public void setQtde (int novaQtde) {
			if (novaQtde < 0)
				qtde = 0;
			else qtde = novaQtde;
		}
		
			public double getPrecoItem() {
			return precoItem;
		}
		
		public void setPrecoItem (double novoPrecoItem) {
			if (novoPrecoItem < 0)
				precoItem = 0;
			else precoItem = novoPrecoItem; 
		}
		
		public double getInvoiceAmount () {
		    return qtde * precoItem;
		}
		
		public String toString() {
		
		    return new String("Código: " + getCodFatura() + "\n" + 
		                      "Descrição: " + getDescricao() + "\n" +
		                      "Qtde itens: " + getQtde() + "\n" +
		                      "Preço item: " + getPrecoItem() + "\n" +
		                      "Total fatura: " + getInvoiceAmount());
		
		}
		
		
 	

	public static void main(String args[]) {
	
	
	}

}
