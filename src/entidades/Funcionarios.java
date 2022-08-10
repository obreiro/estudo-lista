package entidades;

public class Funcionarios {

	private String nome;
	private Integer hora;
	private Double valorHora;
	
	public Funcionarios(String nome, Integer hora, Double valorHora) {
		super();
		this.nome = nome;
		this.hora = hora;
		this.valorHora = valorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}
	
	public double pagamento() {
		return hora*valorHora;
	}

	@Override
	public String toString() {
		String info = this.getNome() + " - " + " $ " + this.pagamento();
		return info;
	}
	
}
