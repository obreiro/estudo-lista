package entidades;

public class FuncionarioTercerizado extends Funcionarios {

	private Double adicional;
	
	public FuncionarioTercerizado(String nome, Integer hora, Double valorHora, Double adicional) {
		super(nome, hora, valorHora);
		this.adicional = adicional;
	}

	public Double getAdicional() {
		return adicional;
	}

	public void setAdicional(Double adicional) {
		this.adicional = adicional;
	}

	public double adicionalSal() {
		return super.pagamento() + this.adicional * 1.1;
	}
	
	public double pagamento() {
		return super.pagamento() + this.getAdicional()*1.1;
	}
	
}
