import java.util.Objects;

public class Carro {
		private String marca, modelo, alugado;
		private int ano, km, cilindrada, potencia;
		private double preco_compra, preco_aluguer;
		
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public String getAlugado() {
			return alugado;
		}
		public void setAlugado(String alugado) {
			this.alugado = alugado;
		}
		public int getAno() {
			return ano;
		}
		public void setAno(int ano) {
			this.ano = ano;
		}
		public int getKm() {
			return km;
		}
		public void setKm(int km) {
			this.km = km;
		}
		public int getCilindrada() {
			return cilindrada;
		}
		public void setCilindrada(int cilindrada) {
			this.cilindrada = cilindrada;
		}
		public int getPotencia() {
			return potencia;
		}
		public void setPotencia(int potencia) {
			this.potencia = potencia;
		}
		public double getPreco_compra() {
			return preco_compra;
		}
		public void setPreco_compra(double preco_compra) {
			this.preco_compra = preco_compra;
		}
		public double getPreco_aluguer() {
			return preco_aluguer;
		}
		public void setPreco_aluguer(double preco_aluguer) {
			this.preco_aluguer = preco_aluguer;
		}
		@Override
		public String toString() {
			return "Carro [marca=" + marca + ", modelo=" + modelo + ", alugado=" + alugado + ", ano=" + ano + ", km="
					+ km + ", cilindrada=" + cilindrada + ", potencia=" + potencia + ", preco_compra=" + preco_compra
					+ ", preco_aluguer=" + preco_aluguer + "]";
		}
		public Carro(String marca, String modelo, int ano, int km, int cilindrada, int potencia, double preco_compra,
				double preco_aluguer) {
			super();
			this.marca = marca;
			this.modelo = modelo;
			this.ano = ano;
			this.km = km;
			this.cilindrada = cilindrada;
			this.potencia = potencia;
			this.preco_compra = preco_compra;
			this.preco_aluguer = preco_aluguer;
			this.alugado="Não alugado";
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Carro other = (Carro) obj;
			return Objects.equals(alugado, other.alugado) && ano == other.ano && cilindrada == other.cilindrada
					&& km == other.km && Objects.equals(marca, other.marca) && Objects.equals(modelo, other.modelo)
					&& potencia == other.potencia
					&& Double.doubleToLongBits(preco_aluguer) == Double.doubleToLongBits(other.preco_aluguer)
					&& Double.doubleToLongBits(preco_compra) == Double.doubleToLongBits(other.preco_compra);
		}
		
		
}
