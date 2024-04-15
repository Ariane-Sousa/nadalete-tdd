package exercicio3;

public class CalculadoraSalario {

    public static double calcularSalarioLiquido(Funcionario funcionario) {
        double desconto = 0;
        switch (funcionario.getCargo()) {
            case DESENVOLVEDOR:
                desconto = funcionario.getSalarioBase() >= 3000 ? 0.2 : 0.1;
                break;
            case DBA:
            case TESTADOR:
                desconto = funcionario.getSalarioBase() >= 2000 ? 0.25 : 0.15;
                break;
            case GERENTE:
                desconto = funcionario.getSalarioBase() >= 5000 ? 0.3 : 0.2;
                break;
        }
        return funcionario.getSalarioBase() * (1 - desconto);
    }
}