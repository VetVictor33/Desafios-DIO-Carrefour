// Para ler e escrever dados em C#, utilizamos os seguintes métodos da classe Console: 
// - Console.ReadLine: lê UMA linha com dado(s) de Entrada (Inputs) do usuário;
// - Console.WriteLine: imprime um texto de Saída (Output) e pulando uma linha.  

/*
Código copiado do site da DIO : 
https://web.dio.me/track/trainee-grupo-carrefour-brasil-lideranca-negra
exceto as partes indicadas por comentário
*/

using System;

public class Desafio
{
	public static void Main()
	{
	  //Lê os valores de Entrada:
	  float valorSalario = float.Parse(Console.ReadLine());
	  float valorBeneficios = float.Parse(Console.ReadLine());
	  
	  float valorImposto = 0;
	  if (valorSalario >= 0 && valorSalario <= 1100)
	  {
	    //Atribiu a aliquota de 5% mediante o salário:
	    valorImposto = 0.05F * valorSalario;
	  }
	  //TODO Criar as demais condições para as aliquotas de 10.00% e 15.00%.
      //parte editada por mim
	  else if (valorSalario <= 2500)
	  {
	    valorImposto = 0.1F * valorSalario;
	  }else if (valorSalario > 2500)
	  {
	    valorImposto = 0.15F * valorSalario;
	  }
	  //fim da parte editada por mim
	  //Calcula e imprime a Saída (com 2 casas decimais):
	  float saida = valorSalario - valorImposto + valorBeneficios;
	  Console.WriteLine(saida.ToString("0.00"));
	}
}