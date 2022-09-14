

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FrotaMotorizada1 {

	private ArrayList<Veiculo> veiculos;


	public FrotaMotorizada1( ) {
		this.veiculos = new ArrayList<Veiculo>();
	}

	public void adicionarVeiculoMotorizado(Veiculo mani) {
		this.veiculos.add(mani);
	}

	public void listarVeiculoMotorizado() {
		for(Veiculo mani:veiculos) {
			System.out.println(mani.toString());
		}
		System.out.println("Total = " + this.veiculos.size() + " veiculos listados com sucesso!\n");
	}
	
	public void excluirVeiculoMotorizado(Veiculo mani) {
		if (this.veiculos.contains(mani)) {
			this.veiculos.remove(mani);
			System.out.println("[Veiculo motorizado " + mani.toString() + "excluido com sucesso!]\n");
		}
		else
			System.out.println("Veiculo motorizado inexistente!\n");
	}

	public void excluirVeiculoMotorizado() {
		veiculos.clear();
		System.out.println("Veiculo motorizado excluidos com sucesso!\n");
	}
	public void gravarVeiculoMotorizado()  {
		ObjectOutputStream outputStream = null;
		try {
			outputStream = new ObjectOutputStream (new FileOutputStream("c:\\temp\\veiculos.dat"));
			for(Veiculo mani:veiculos) {
				outputStream.writeObject(mani);
			}
		}catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}catch (IOException ex) {
			ex.printStackTrace();
		}finally{
			try {
				if (outputStream != null ) {
					outputStream.flush();
					outputStream.close();
				}
			}catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	public void recuperarVeiculosMotorizados() {
		ObjectInputStream inputStream = null;
		try {
			inputStream	= new ObjectInputStream (new FileInputStream ("c:\\temp\\veiculos.dat"));
			Object obj = null;
			while((obj = inputStream.readObject ()) != null) {
				if (obj instanceof Carro)  
					this.veiculos.add((Carro)obj);
				else if (obj instanceof Caminhao)  
					this.veiculos.add((Caminhao)obj);
			}
		}catch (EOFException ex) {     // when EOF is reached
			System.out.println ("End of file reached");
		}catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}catch (IOException ex) {
			ex.printStackTrace();
		}finally{
			try {
				if (inputStream != null ) {
					inputStream.close();
					System.out.println("Veiculos motorizados recuperados com sucesso!\n");
				}
			}catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}


	public static void main(String[] args) {
		FrotaMotorizada1 frot  = new FrotaMotorizada1();

		Carro ford    = new Carro("Ford",   "Ka", 2018, "BDA-1N90", 30000, "Motor 1.0");
		Carro fiat = new Carro("Fiat", "uno", 2010, "MCD-2A34", 128000, "Motor 1.4");
		Caminhao  volvo      = new Caminhao ("Volvo", "FH540", 2022, "BCC-0A11", 000, 45000);
		Caminhao  mercedes    = new Caminhao ("Mercedes-Benz", "MB710", 2009, "ASW-2345", 238000, 5000);
		frot.adicionarVeiculoMotorizado(ford);
		frot.adicionarVeiculoMotorizado(fiat);
		frot.adicionarVeiculoMotorizado(volvo);
		frot.adicionarVeiculoMotorizado(mercedes);
		frot.listarVeiculoMotorizado();
		frot.gravarVeiculoMotorizado();
		frot.excluirVeiculoMotorizado(ford);
		frot.listarVeiculoMotorizado();
		frot.excluirVeiculoMotorizado();
		frot.listarVeiculoMotorizado();
		frot.recuperarVeiculosMotorizados();
		frot.listarVeiculoMotorizado();
	}

}
