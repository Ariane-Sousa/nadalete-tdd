package exercicio3;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraSalarioTest {

    @Test
    public void testCalculoSalarioDesenvolvedorMaiorOuIgual3000() {
        Funcionario desenvolvedor = new Funcionario("João", "joao@example.com", 3500, Cargo.DESENVOLVEDOR);
        assertEquals(2800, CalculadoraSalario.calcularSalarioLiquido(desenvolvedor), 0);
    }

    @Test
    public void testCalculoSalarioDesenvolvedorMenor3000() {
        Funcionario desenvolvedor = new Funcionario("Maria", "maria@example.com", 2500, Cargo.DESENVOLVEDOR);
        assertEquals(2250, CalculadoraSalario.calcularSalarioLiquido(desenvolvedor), 0);
    }

    @Test
    public void testCalculoSalarioDBAMaiorOuIgual2000() {
        Funcionario dba = new Funcionario("Pedro", "pedro@example.com", 2500, Cargo.DBA);
        assertEquals(1875, CalculadoraSalario.calcularSalarioLiquido(dba), 0);
    }

    @Test
    public void testCalculoSalarioDBAMenor2000() {
        Funcionario dba = new Funcionario("Ana", "ana@example.com", 1500, Cargo.DBA);
        assertEquals(1275, CalculadoraSalario.calcularSalarioLiquido(dba), 0);
    }

    @Test
    public void testCalculoSalarioTestadorMaiorOuIgual2000() {
        Funcionario testador = new Funcionario("Carlos", "carlos@example.com", 2500, Cargo.TESTADOR);
        assertEquals(1875, CalculadoraSalario.calcularSalarioLiquido(testador), 0);
    }

    @Test
    public void testCalculoSalarioTestadorMenor2000() {
        Funcionario testador = new Funcionario("Julia", "julia@example.com", 1500, Cargo.TESTADOR);
        assertEquals(1275, CalculadoraSalario.calcularSalarioLiquido(testador), 0);
    }

    @Test
    public void testCalculoSalarioGerenteMaiorOuIgual5000() {
        Funcionario gerente = new Funcionario("Paulo", "paulo@example.com", 6000, Cargo.GERENTE);
        assertEquals(4200, CalculadoraSalario.calcularSalarioLiquido(gerente), 0);
    }

    @Test
    public void testCalculoSalarioGerenteMenor5000() {
        Funcionario gerente = new Funcionario("Fernanda", "fernanda@example.com", 4000, Cargo.GERENTE);
        assertEquals(3200, CalculadoraSalario.calcularSalarioLiquido(gerente), 0);
    }
}
