public class gerente extends funcionario {
    public gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.25;
    }
}
