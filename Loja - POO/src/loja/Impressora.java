package loja;

public class Impressora {

	private String marca;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if(marca.length()>0)
		this.marca = marca;
	}
	
	public void imprimir(Pedido pedido) {
		System.out.println(pedido.toString());
	}
	
	public void imprimir(Pagamento pagamento) {
		System.out.println(pagamento.toString());
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Impressora [marca=");
		builder.append(marca);
		builder.append("]");
		return builder.toString();
	}
		
}
