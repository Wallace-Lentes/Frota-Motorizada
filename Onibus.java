
public class Onibus extends Veiculo {
	private static final long serialVersionUID = 1L;
	
	private int assentos;

	public Onibus(String marca, String modelo, int ano, String placa, double quilometragem, int assentos) {
		super(marca, modelo, ano, placa, quilometragem);
		this.assentos = assentos;
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
