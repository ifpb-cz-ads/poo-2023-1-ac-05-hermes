**2 -** Apesar de ambos serem estruturas de repetição muito utilizados as vezes para o mesmo propósito, o While é utilizado quando não se sabe a quantidade de vezes que determinado código deve se repetir, enquanto For possui uma inicialização mais complexa pois deve ser especificado quantas vezes ocorrerá a repetição.<br><br>
<br>----------------------------------------------------------------------------<br>

**3 -** Do While deve ser utilizado quando o código precisa ser executado ao menos uma vez, na maioria das vezes quando ainda não se tem um resultado previsível. Por exemplo: Um programa na qual é exibido um menu com várias opções diferentes e o usuário deve escolher alguma delas. Esse menu deve ser exibido pelo menos uma vez, e é bem mais eficiente utilizar o do while para isso do que alguns artificios como colocar algum número alto ou improvável como padrão na variável da escolha. Outro exemplo seria um programa que realize um cálculo matemático, primeiro tem que começar o cálculo para depois saber se o código deve continuar sendo repetido.<br><br>
<br>----------------------------------------------------------------------------<br>

**4 -** Tanto break quanto continue servem para simplesmente interromper um loop, porém "continue" interrompe o loop mas retorna para o teste de condição e continua a próxima iteração, enquanto "break" simplesmente interrompe o loop inteiro, fazendo com que o programa continue fora da condição.<br><br>
<br>----------------------------------------------------------------------------<br>

**5 -** <br>
A: Primeiro: as 3 especificações presentes no for (inicialização, condição e iteração) devem ser separadas por ponto e vírgula, e não apenas virgulas como nesse caso. Segundo: devido ao i++, o código simplesmente não terá fim tendo em vista que não ele sempre irá aumentar e não chegará em 1.<br>
```
for (i = 100; i >= 1; i--) System.out.println(i);
```
B: Deve ser adicionado um break depois de cada instrução de um case - switch.
```
int value = 8;
switch (value % 2) {
  case 0: System.out.println("Inteiro par"); break;
  case 1: System.out.println("Inteiro ímpar"); break;
}
```
C: Mesmo erro do código da questão A: ele será executado interruptamente. Para corrigir isso, basta apenas editar o += para -=, assim cada repetição irá reduzir 2 da variável i até finalmente o programa ser finalizado.

D: Primeiramente não foi especificado nenhum tipo para a variável counter. Segundo, a repetição do programa está específicada para terminar antes do 100 (counter < 100) e a instrução do programa pede para que exiba o valor 100 também. Nesse caso, basta apenas mudar para "menor ou igual" (counter <= 100).
```
int counter = 2;
do {
  System.out.println(counter);
  counter += 2;
} while (counter <= 100);
```
<br>----------------------------------------------------------------------------<br>
**6 -**
Ele exibe o caractere @ 5 vezes seguidas por 10 linhas.
