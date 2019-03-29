
public class CalculoBruto {
	public static void main(String[] args) {
		TestaSalarioBruto calculandosalario = new TestaSalarioBruto(40, 150.0, 3);
		System.out.println("Salario Bruto: "+calculandosalario.Bruto());
		System.out.println("Desconto INSS: "+calculandosalario.INSS());
		System.out.println("Desconto IR: "+calculandosalario.IR());
		System.out.println("Salario Liquido: "+calculandosalario.Liquido());
	}
}
