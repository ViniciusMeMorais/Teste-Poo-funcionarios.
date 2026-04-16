public class desenvolvedor extends funcionario {
    public desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    @Override
    public double calcularSalario() {
        return getSalarioBase() + 400; 
    }
}
    

