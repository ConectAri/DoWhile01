# DoWhile01

Exemplo de programa em Java que solicita ao usuário que digite um número e só finaliza quando o usuário digitar 0:

Explicando o código: https://github.com/ConectAri/DoWhile01/commit/ce26958e0f0639ce0421ea142d27b86548e965e0


EstruturaDeRepeticao01:  

Primeiro, importamos a classe Scanner, que permite ler a entrada do usuário a partir do console.

Em seguida, declaramos duas variáveis: scanner, do tipo ler, que será utilizada para ler a entrada do usuário, e numero, do tipo int,
que armazenará o número digitado pelo usuário.

O laço do-while é utilizado para solicitar ao usuário que digite um número até que ele digite 0.

A cada iteração, o programa exibe a mensagem "Digite um número (digite 0 para sair)" e aguarda que o usuário digite um número.

A variável numero é atualizada a cada iteração, com o valor digitado pelo usuário.

Quando o usuário digita 0, o laço é interrompido e o programa exibe a mensagem "Programa finalizado."

Por fim, o método close() é chamado na variável ler(scanner) para liberar os recursos utilizados pelo objeto.


=======================================================================================================================================================================

EstruturaDeRepeticao02:  

Uma outra forma de programa em Java que solicita ao usuário para digitar um número e só finaliza quando o usuário digitar 0:

Nesta versão, é utilizado um laço while com a condição de parada baseada no valor digitado pelo usuário, que só finaliza quando o valor digitado for igual a 0. 

Além disso, é inicializado o valor da variável numero como 1, garantindo que o laço seja executado pelo menos uma vez.

Ao final, o programa exibe a mensagem "Programa finalizado." e fecha o objeto Scanner.

==============================================================================================================================================

EstruturaDeRepeticao03:

https://github.com/ConectAri/DoWhile01/commit/7bef9a0209a7d827a03bd04ef0542128df9f98bc



Código em Java que pede ao usuário para digitar um número e só finaliza quando o usuário digitar 0. Ao final, o programa imprime a soma de todos os números digitados:

Explicação do código:

Primeiro, importamos a classe Scanner do pacote java.util. Essa classe nos permite ler a entrada do usuário a partir do teclado.

Criamos um objeto Scanner chamado ler e inicializamos duas variáveis inteiras: numero (inicializado com -1) e soma (inicializado com 0).

Em seguida, utilizamos um loop while que só irá parar quando o usuário digitar 0. Dentro do loop, exibimos uma mensagem pedindo para o usuário digitar um número e lemos a entrada do usuário utilizando o método nextInt() do objeto ler.

Em seguida, somamos o número digitado à variável soma.

Ao final do loop, exibimos a mensagem com a soma de todos os números digitados utilizando o método println() do objeto System.out.

java
