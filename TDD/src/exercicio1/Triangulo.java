package exercicio1;

public class Triangulo {
    public static String classificarTriangulo(int lado1, int lado2, int lado3) {
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0)
            return "Não é um triângulo";
        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1)
            return "Não é um triângulo";

        if (lado1 == lado2 && lado2 == lado3)
            return "Triângulo equilátero";
        else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
            return "Triângulo isósceles";
        else
            return "Triângulo escaleno";
    }
}
