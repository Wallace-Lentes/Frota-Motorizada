

import java.io.Serializable;

public abstract class Veiculo implements Serializable {

	private static final long serialVersionUID = 1L;
	private   String marca;
	private   String modelo;
	private   int ano;
	private String placa;
	private double quilometragem;
	private int assento;
	private double cargamax;
	private String motorizacao;
	
	public Veiculo(String marca, String modelo, int ano, String placa, double quilometragem) {
		this.marca = marca;
		this.ano = ano;
		this.modelo = modelo;
		this.placa = placa;
		this.quilometragem = quilometragem;
	}
	public String toString() {
		String retorno = "";
		retorno += "Marca: "     + this.marca     + "\n";
		retorno += "Modelo: "    + this.modelo    + " \n";
		retorno += "Ano: "     + this.ano     + "\n";
		retorno += "Placa: "  + this.placa  + "\n";
		retorno += "Quilometragem: "  + this.quilometragem       + "KM\n";
		return retorno;
	}
	public int getAssento() {
		return assento;
	}
	public void setAssento(int assento) {
		this.assento = assento;
	}
	public double getCargamax() {
		return cargamax;
	}
	public void setCargamax(double cargamax) {
		this.cargamax = cargamax;
	}
	public String getMotorizacao() {
		return motorizacao;
	}
	public void setMotorizacao(String motorizacao) {
		this.motorizacao = motorizacao;
	}
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
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public double getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
