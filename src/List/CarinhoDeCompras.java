package List;

import java.util.ArrayList;
import java.util.List;



public class CarinhoDeCompras {

	// 2. Carrinho de Compras:
	// Crie uma classe chamada "CarrinhoDeCompras" que representa um carrinho de
	// compras online. O carrinho deve ser implementado como uma lista de itens.
	// Cada item é representado por uma classe chamada "Item" que possui atributos
	// como nome, preço e quantidade. Implemente os seguintes métodos:

	// adicionarItem(String nome, double preco, int quantidade): Adiciona um item ao
	// carrinho com o nome, preço e quantidade especificados.
	// removerItem(String nome): Remove um item do carrinho com base no seu nome.
	// calcularValorTotal(): Calcula e retorna o valor total do carrinho, levando em
	// consideração o preço e a quantidade de cada item.
	// exibirItens(): Exibe todos os itens presentes no carrinho, mostrando seus
	// nomes, preços e quantidades.

	private List<Item> itemList;

	public CarinhoDeCompras() {
		this.itemList = new ArrayList<>();
	}

	public void adicionarItem(String nome, double preco, int quantidade) {
		itemList.add(new Item(nome, preco, quantidade));
	}

	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<>();
		for (Item item : itemList) {
			if (item.getNome().equalsIgnoreCase(nome)) {
				itensParaRemover.add(item);
			}
		}
		itemList.removeAll(itensParaRemover);
	}

	public int calcularValorTotal() {
		int total = 0;
		for (Item item : itemList) {
			total += item.getPreco() * item.getQuantidade();
			System.out.println("O total é de: " + total);
		}
		return total;
	}

	public void exibirItens() {
		System.out.println(itemList);
	}

	public static void main(String[] args) {

		CarinhoDeCompras listaItem = new CarinhoDeCompras();
		listaItem.adicionarItem("tv", 2300, 2);
		System.out.println("");
		listaItem.adicionarItem("celular", 1200, 1);
		listaItem.exibirItens();
		listaItem.calcularValorTotal();
		System.out.println("===========================");
		listaItem.removerItem("celular");
		listaItem.exibirItens();
		listaItem.calcularValorTotal();
		
		

	}
}
