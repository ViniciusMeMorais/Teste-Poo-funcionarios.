abstract class funcionario {
    private String nome;
    private double salarioBase; 
    public funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    public String getNome() {
        return nome;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public abstract double calcularSalario();

}
