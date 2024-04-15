package exercicio1;

import org.junit.Test;
import static org.junit.Assert.*;

public class TrianguloTest {

    @Test
    public void testTrianguloEscalenoValido() {
        assertEquals("Triângulo escaleno", Triangulo.classificarTriangulo(3, 4, 5));
    }

    @Test
    public void testTrianguloIsoscelesValido() {
        assertEquals("Triângulo isósceles", Triangulo.classificarTriangulo(5, 5, 3));
    }

    @Test
    public void testTrianguloEquilateroValido() {
        assertEquals("Triângulo equilátero", Triangulo.classificarTriangulo(6, 6, 6));
    }

    @Test
    public void testTrianguloIsoscelesPermutacoes() {
        assertEquals("Triângulo isósceles", Triangulo.classificarTriangulo(5, 3, 5));
        assertEquals("Triângulo isósceles", Triangulo.classificarTriangulo(3, 5, 5));
    }

    @Test
    public void testValorZero() {
        assertEquals("Não é um triângulo", Triangulo.classificarTriangulo(0, 4, 5));
    }

    @Test
    public void testValorNegativo() {
        assertEquals("Não é um triângulo", Triangulo.classificarTriangulo(-3, 4, 5));
    }

    @Test
    public void testSomaIgualAoTerceiroLado() {
        assertEquals("Não é um triângulo", Triangulo.classificarTriangulo(2, 2, 4));
    }

    @Test
    public void testSomaIgualAoTerceiroLadoPermutacoes() {
        assertEquals("Não é um triângulo", Triangulo.classificarTriangulo(2, 4, 2));
        assertEquals("Não é um triângulo", Triangulo.classificarTriangulo(4, 2, 2));
    }

    @Test
    public void testSomaMenorQueTerceiroLado() {
        assertEquals("Não é um triângulo", Triangulo.classificarTriangulo(1, 2, 4));
    }

    @Test
    public void testSomaMenorQueTerceiroLadoPermutacoes() {
        assertEquals("Não é um triângulo", Triangulo.classificarTriangulo(2, 4, 1));
        assertEquals("Não é um triângulo", Triangulo.classificarTriangulo(4, 1, 2));
    }

    @Test
    public void testTodosOsLadosZero() {
        assertEquals("Não é um triângulo", Triangulo.classificarTriangulo(0, 0, 0));
    }
}
