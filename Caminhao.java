

public class Caminhao extends Veiculo {

	private static final long serialVersionUID = 1L;

	private double cargamax;
	
	public Caminhao(String marca, String modelo, int ano, String placa, double quilometragem, double cargamax) {
		super(marca, modelo, ano, placa, quilometragem);
		this.cargamax = cargamax;
	}

	public double getCargamax() {
		return cargamax;
	}

	public void setCargamax(double cargamax) {
		this.cargamax = cargamax;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
