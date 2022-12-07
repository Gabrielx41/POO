import java.util.Objects;

public class Cliente {
	private String nome, cidade;
	private int idade, NIF, carros_Alugados;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getNIF() {
		return NIF;
	}
	public void setNIF(int nIF) {
		NIF = nIF;
	}
	public int getCarros_Alugados() {
		return carros_Alugados;
	}
	public void setCarros_Alugados(int carros_Alugados) {
		this.carros_Alugados = carros_Alugados;
	}
	public Cliente(String nome, String cidade, int idade, int nIF) {
		super();
		this.nome = nome;
		this.cidade = cidade;
		this.idade = idade;
		NIF = nIF;
		this.carros_Alugados = 0;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return NIF == other.NIF && carros_Alugados == other.carros_Alugados && Objects.equals(cidade, other.cidade)
				&& idade == other.idade && Objects.equals(nome, other.nome);
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cidade=" + cidade + ", idade=" + idade + ", NIF=" + NIF
				+ ", carros_Alugados=" + carros_Alugados + "]";
	}
}

