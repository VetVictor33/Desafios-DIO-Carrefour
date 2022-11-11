
// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

/*
Código copiado do site da DIO :

exceto as partes indicadas por comentário
*/

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        // Lê os valores de Entrada:
        Scanner leitorDeEntradas = new Scanner(System.in);
        float valorSalario = leitorDeEntradas.nextFloat();
        float valorBeneficios = leitorDeEntradas.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            // Atribiu a aliquota de 5% mediante o salário:
            valorImposto = 0.05F * valorSalario;
        }
        // TODO Criar as demais condições para as aliquotas de 10.00% e 15.00%
        // início da parte editada por mim
        else if (valorSalario > 1100 && valorSalario <= 2500) {
            valorImposto = 0.1F * valorSalario;
        } else if (valorSalario > 2500) {
            valorImposto = 0.15F * valorSalario;
        }
        // fim da parte editada por mim

        // Calcula e imprime a Saída (com 2 casas decimais):
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));
    }
}