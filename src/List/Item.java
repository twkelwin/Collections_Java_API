package List;

public class Item {

	private String Nome;
	private double Preco;
	private int Quantidade;
	
	public Item(String nome, double preco, int quantidade) {
		this.Nome = nome;
		this.Preco = preco;
		this.Quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Item [Nome=" + Nome + ", Preco=" + Preco + ", Quantidade=" + Quantidade + "]";
	}

	public String getNome() {
		return Nome;
	}

	public double getPreco() {
		return Preco;
	}

	public int getQuantidade() {
		return Quantidade;
	}
	
	
	
	
}
