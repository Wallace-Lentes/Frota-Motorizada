

public class Carro extends Veiculo {

	private static final long serialVersionUID = 1L;

	private String motorizacao;
	
	public Carro(String marca, String modelo, int ano, String placa, double quilometragem, String motorizacao) {
		super(marca, modelo, ano, placa, quilometragem);
		this.motorizacao = motorizacao;
			}

	public String getMotorizacao() {
		return motorizacao;
	}

	public void setMotorizacao(String motorizacao) {
		this.motorizacao = motorizacao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}




	
}
