public class main {
    public static void main(String[] args) {
        funcionario dev = new desenvolvedor("Fulanin", 3000);
        funcionario ger = new gerente("Sicranin", 5000);
        
        System.out.println(dev.getNome() + " - Salario: " + dev.calcularSalario());
        System.out.println(ger.getNome() + " - Salario: " + ger.calcularSalario());
    }
}
