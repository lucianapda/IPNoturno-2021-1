# Algumas anotações das aulas

Na última aula resolvemos dois problemas iniciais utilizando Java no VSCode.
Na aula de hoje, entenderemos um pouco mais a respeito do ambiente a ser utilizado durante o semestre, bem como resolveremos novos exercícios para treinar a habilidade de solucionar problemas e de interpretar textos.

## Mostrar VScode
- Como criar projeto;
- Como salvar arquivos (após salvar com a extensão correta o VSCode compreende que é código Java);
- Terminal: visualizar respostas, limpar, reiniciar;
- Como depurar código e visualizar as variáveis;
- Vídeo: o que é uma IDE? https://youtu.be/GPcIjsz-2cA

## Nomenclaturas
- Nome do projeto sempre iniciando com letra maiúscula;
- Nome do arquivo (classe) sempre iniciando com letra maiúscula
- Nome das variáveis sempre iniciando com letra minúscula

Nomes podem conter letras, números e _. Não podem conter caracteres especiais, espaços e acentuação! Devem iniciar sempre com uma letra.

## Sobre o que já desenvolvemos na última aula...
### Tipos de dados:
- Diferenciar os tipos de dados (inteiro, decimal e texto);
- Explicar a diferença de float e double (colocar "f" atrás do valor. Ex: float n = 4.5f;)
- Explicar brevemente diferença entre tipo primitivo e String

### Operadores:
- Atribuição
- Aritméticos
- Concatenação
  
### Comandos:
- Entrada: Scanner
- Saída: System.out.print / System.out.println

### Fluxogramas
- Explicar a notação usada
- Ter uma imagem sem ser um algoritmo e com legenda para cada símbolo usado no desenho do fluxograma
- Só mostrar os fluxogramas usados nos algoritmos acima
- Deixar um ou dois fluxograma para passarem para o VSCode


![Partes do Fluxograma](imgs/img_fluxogramaLegenda.png "Partes do Fluxograma")

### Estrutura de um algoritmo

#### Análise:
![Análise do algoritmo](imgs/img_formularioAnalise.png "Análise do algoritmo")

#### Entradas:
![Entradas](imgs/img_formularioEntradas.png "Entradas")

#### Saída:
![Saídas](imgs/img_formularioSaida.png "Saídas")

#### Testes:
![Testes](imgs/img_formularioTestes.png "Testes")

#### Algoritmo:

<div class="hidden">

```
@startuml img_formularioFluxograma
	title URI_1001
	start
		:ler(largura);
		:ler(comprimento);
		:area = largura * comprimento;
		:escrever(area);
	stop
@enduml

```
</div>

![Algoritmo](imgs/img_formularioFluxograma.svg "Algoritmo")

#### Teste de Mesa:
![Teste de mesa](imgs/img_formularioTesteMesa.png "Teste de Mesa")

#### Formulário completo:
![Formulário de estruturação de algoritmos](imgs/img_formularioDois.png "Formulário completo de estruturação de algoritmos")

## Algoritmos para práticar
 
 ### Problema 1 (URI_1002):
    A fórmula para calcular a área de uma circunferência é definida como A = π x R². Considerando este problema que π = 3,1415. Calcule a área usando a fórmula fornecida na descrição do problema.

- Entendendo o problema
  
![Calculo da área da circunferência](imgs/AA_Enunciado_URI_1002.png "Calculo da área da circunferência")

- fluxograma
  
![Algoritmo](imgs/img_URI_1002_fluxograma.png "Algoritmo")

### Problema 2 (URI_1008):
    Escreva um programa que leia o número do funcionário, o número de horas trabalhadas em um mês e o valor que ele recebeu por hora. Este valor sempre será um valor inteiro. Imprima o número do funcionário e o salário que ele receberá no final do mês.
- Entendendo o problema
  
- fluxograma
