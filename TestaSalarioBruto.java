
public class TestaSalarioBruto {
	
	private int qtdade;
	private double salarioHora;
	private int nDependentes;
	private double descontoINSS;
	private double descontoIR;

	public TestaSalarioBruto(int qtdade, double salarioHora, int nDependentes) {
		this.qtdade = qtdade;
		this.salarioHora = salarioHora;
		this.nDependentes = nDependentes;
		this.descontoINSS = descontoINSS;
		this.descontoIR = descontoIR;
		// TODO Auto-generated constructor stub
	}
	public double Bruto() {
		return qtdade*salarioHora + (50*nDependentes);
	}
	public double INSS() {
		if(Bruto() <= 1000) {
			return descontoINSS = Bruto() * 8.5/100;
		}
		if(Bruto() > 1000) {
			return descontoINSS = Bruto() * 9/100;
		}
		return descontoINSS;
	}
	public double IR() {
		if(Bruto() <= 500) {
			return descontoIR = 0;
		}
		if(Bruto() > 500 && Bruto() <= 1000) {
			return descontoIR = Bruto() * 5/100;
		}
		if(Bruto() > 1000) {
			return descontoIR = Bruto() * 7/100;
		}
		return descontoIR;
	}
	public double Liquido() {
		return Bruto()- INSS() - IR();
	}
}
