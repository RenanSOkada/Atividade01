package loja;

public class Cliente {
	
	private String nome;
	private String enderešo;
	private String CpfCliente;
	
	public String getNome() {
		return nome;
	}
	public String getEnderešo() {
		return enderešo;
	}
	public String getCpfCliente() {
		return CpfCliente;
	}
	public void setNome(String nome) {
		if(nome.length() > 0)
		this.nome = nome;
	}
	public void setEnderešo(String enderešo) {
		if(enderešo.length() > 0)
		this.enderešo = enderešo;
	}
	public void setCpfCliente(String cpfCliente) {
		if(cpfCliente.length() > 0)
		CpfCliente = cpfCliente;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [nome=");
		builder.append(nome);
		builder.append(", enderešo=");
		builder.append(enderešo);
		builder.append(", CpfCliente=");
		builder.append(CpfCliente);
		builder.append("]");
		return builder.toString();
	}
	
}
