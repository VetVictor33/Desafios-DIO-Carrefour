//Desafios JavaScript na DIO têm funções "gets" e "print" acessíveis globalmente:
//- "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
//- "print": imprime um texto de saída (output), pulando linha.
/*
Código copiado do site da DIO : 
https://web.dio.me/track/trainee-grupo-carrefour-brasil-lideranca-negra
exceto as partes indicadas por comentário
*/
//Lê os valores de Entrada:
const valorSalario = parseFloat(gets());
const valorBeneficios = parseFloat(gets());

//Calcula o imposto através da função "calcularImposto":
const valorImposto = calcularImposto(valorSalario);
//Calcula e imprime a Saída (com 2 casas decimais):
const saida = valorSalario - valorImposto + valorBeneficios;
print(saida.toFixed(2));

//Função útil para o calculo do imposto (baseado nas aliquotas).
function calcularImposto(salario) {
    let aliquota;
    if (salario >= 0 && salario <= 1100) {
        aliquota = 0.05;
    }
    //TODO Criar as demais condições para as aliquotas de 10.00% e 15.00%.
    //início do código digitado por mim
    else if (salario > 1100 & salario <= 2500) {
        aliquota = 0.1;
    } else if (salario > 2500)
        aliquota = 0.15;
    //fim do código digitado por mim
    return aliquota * salario;
}