/*
Código copiado do site da DIO : 
https://web.dio.me/track/trainee-grupo-carrefour-brasil-lideranca-negra
exceto as partes indicadas por comentário.
*/

object ReceitaFederal {
    fun calcularImposto(salario: Double): Double {
    	val aliquota = when {
            (salario >= 0 && salario <= 1100) -> 0.05
            (salario > 1100 && salario <=2500) -> 0.1
            else -> 0.15
            }
        }
    	return aliquota * salario
    }
}

fun main() {
   val valorSalario = readLine()!!.toDouble();
   val valorBeneficios = readLine()!!.toDouble();
   
   val valorImposto = ReceitaFederal.calcularImposto(valorSalario);
   val saida = valorSalario - valorImposto + valorBeneficios;
   
   println(String.format("%.2f", saida));
}