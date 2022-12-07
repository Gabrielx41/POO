import java.io.*;
import java.util.ArrayList;
public class FuncCarros{
	public void cria_carro(ArrayList <Carro> carros) {
		System.out.println("Digite a marca do carro: ");
		String marca = Ler.umaString();
		System.out.println("Digite a modelo do carro: ");
		String modelo = Ler.umaString();
		System.out.println("Digite o ano do carro: ");
		int ano = Ler.umInt();
		System.out.println("Digite a quilometragem do carro: ");
		int km = Ler.umInt();
		System.out.println("Digite a cilindrada do carro: ");
		int cilindrada = Ler.umInt();
		System.out.println("Digite a potência do carro: ");
		int potencia = Ler.umInt();
		System.out.println("Digite o preço de aluguer do carro: ");
		double preco_aluguer = Ler.umDouble();
		System.out.println("Digite o preço de compra do carro: ");
		double preco_compra = Ler.umDouble();
		Carro novoCarro = new Carro(marca,modelo,ano,km,cilindrada,potencia,preco_aluguer,preco_compra);
		carros.add(novoCarro);
	}

	public void lista_Carros() {

	}
	
	public void apaga_Carro() {
		
	}
	
	public void pesquisa() {
		
	}
	
	public void alugar_Carro() {
		
	}
	
	public void entregar_Carro() {
		
	}
	
	public void pagar_Aluguer() {
		
	}
	
	public void mais_Alugado() {
		
	}
	
	//+ Estatísticas

}

