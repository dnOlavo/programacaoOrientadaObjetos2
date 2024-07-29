public class App {
    public static void main(String[] args) throws Exception {
        CalculadoraDescontos calculadora = new CalculadoraDescontos();

        // Cliente Regular
        calculadora.setDescontoStrategy(new DescontoClienteRegular());
        System.out.println("Desconto Cliente Regular: " + calculadora.calcularDesconto(1200));

        // Cliente VIP
        calculadora.setDescontoStrategy(new DescontoClienteVIP());
        System.out.println("Desconto Cliente VIP: " + calculadora.calcularDesconto(1200));

        // Funcionário
        calculadora.setDescontoStrategy(new DescontoFuncionario());
        System.out.println("Desconto Funcionário: " + calculadora.calcularDesconto(1200));
    }
}
