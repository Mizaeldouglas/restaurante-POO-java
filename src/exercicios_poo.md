<h3>Lista de Exercícios POO</h3>
<ol>

<li>Crie uma classe que modele um aluno de academia:
<ul>
<li>Atributos: Nome, data de nascimento, peso e altura.</li>
<li>Métodos:</em> Calcula idade.</li>
</ul>
</li>

<li>Crie uma classe que modele uma avaliação física  de academia:
<ul>
<li>Atributos:</em> Id matricula, data da matrícula, aluno e avaliações físicas.</li>
<li>Informações do aluno, informações da última avaliação e informações de uma avaliação qualquer.</li>
</ul>
</li>

<li>Crie uma classe que modele uma conta corrente:
<ul>
<li>Atributos: número da conta, nome do correntista e saldo.</li>
<li>Métodos:</em> alterar nome, depósito e saque.<br>
No construtor, o saldo é opcional, com o valor default zero e os demais atributos são obrigatórios.  
</li>
</ul>
</li>

<li>Faça um programa que simule um televisor criando-o como um objeto:
<ul>
<li>O usuário deve ser capaz de informar o número do canal e aumentar ou diminuir o volume.</li>
<li>Certifique-se de que o número do canal e o nível do volume permanecem dentro de faixas válidas.</li>
</ul>
</li>

<li>Crie uma classe que modele um macaco:
<ul>
<li>Atributos: Nome e bucho (estômago).</li>
<li>Métodos: Comer, verBucho e digerir.</li>
<li>Faça um programa e teste interativamente:
<ul>
<li>Crie 2 macacos</li>
<li>Alimente-os com 3 alimentos diferentes e verificando o conteúdo do estômago a cada refeição.</li>
<li>Experimente fazer com que um macaco coma o outro. É possível criar um macaco canibal?</li>
</ul>
</li>
</ul>
</li>

<li>Crie uma classe que modele uma bomba de combustível:
<ul>
<li>Atributos: tipo de combustível, valor do litro, quantidade do combustível.</li>
<li>Métodos: 
<ol>
<li>Abastecer por valor: método onde é informado o valor a ser abastecido e mostra a quantidade de litros que foi colocada no veículo.</li>
<li>Abastecer por litro: método onde é informado a quantidade em litros de combustível e mostra o valor a ser pago pelo cliente.</li>
<li>Alterar o valor do litro do combustível: altera o valor do litro do combustível.</li>
<li>Alterar quantidade de combustível: altera a quantidade de combustível restante na bomba.</li>
<li>Sempre que acontecer um abastecimento é necessário atualizar a quantidade de combustível total na bomba. A bomba inicia com 100 L de combustível.</li>
</ol>
</li>
</ul>
</li>

<li>Faça uma classe contaInvestimento que seja semelhante a classe ContaBancaria, com a diferença de que se adicione um atributo taxaJuros.
<ul>
<li>Forneça um construtor que configure tanto o saldo inicial com a taxa de juros</li>
<li>Forneça um método adicioneJuros (sem parâmetro explícito) que adicione juros à conta</li>
<li>Escreva um programa que construa uma poupança com um saldo inicial de R$1.000,00 e uma taxa de juros de 10%</li>
<li>Depois aplique o método adicioneJuros() cinco vezes e imprima o saldo resultante</li>
</ul>
</li>

<li>Crie uma classe que modele um funcionário.
<ul>
<li>Um empregado tem um nome (String) e um salário (Double)</li>
<li>Escreva um construtor com dois parâmetros (nome e salário)</li>
<li>Métodos para devolver nome, salário, aumentar salário (porcentualDeAumento) que aumente o salário do funcionário em uma certa porcentagem.</li>
<li>Escreva um pequeno programa que teste sua classe.</li>
</ul>
</li>

<li>Identifique	 as	 classes	 e	 implemente	 um	 programa	 para	 a	 seguinte	 especificação:	 “O	
supermercado	 vende	 diferentes	 tipos	 de	 produtos.	 Cada	 produto	 tem	 um	 preço	 e	 uma	
quantidade	em	estoque.	Um	pedido	de	um	cliente	é	composto	de	itens,	onde	cada	item	
especifica	o	produto	que	o	cliente	deseja	e	a	respectiva	quantidade. Esse	pedido	pode	ser	
pago	em	dinheiro,	cheque	ou	cartão.”</li>
<li>Faça	 um	 programa	 para	 controle	 de	 empréstimo	 de	 livros,	 com	 as	 classes Emprestimo,	
Livro e	Pessoa.</li>

<li>Faça	 um	 programa	 que	 calcule	 a	 área	 de	 uma	 figura	 geométrica.	 Aceite	 quatro	 tipos	 de	
figura	geométrica:	quadrado,	retângulo,	triângulo	e	círculo. Use	herança	e	polimorfismo.</li>
<li>Escreva uma classe que represente um país. Um país é representado através dos atributos: código ISO 3166-1 (ex.: BRA), nome (ex.:
Brasil), população (ex.: 193.946.886) e a sua dimensão em Km2 (ex.: 8.515.767,049). Além disso, cada país mantém uma lista de outros
países com os quais ele faz fronteira. Escreva a classe em Java e forneça os seus membros a seguir:
<ol>
<li>Construtor que inicialize o código ISO, o nome e a dimensão do país;</li>
<li>Métodos de acesso (getter/setter) para as propriedades código: ISSO, nome, população e dimensão do país;</li>
<li>Um método que permita verificar se dois objetos representam o mesmo país (igualdade semântica). Dois países são iguais se
tiverem o mesmo código ISO;</li>
<li>Um método que informe se outro país é limítrofe do país que recebeu a mensagem;</li>
<li>Um método que retorne a densidade populacional do país;</li>
<li>Um método que receba um país como parâmetro e retorne a lista de vizinhos comuns aos dois países.</li>
<li>Considere que um país tem no máximo 40 outros países com os quais ele faz fronteira.</li>
</ol>
</li>

<li>Escreva em Java uma classe Continente. Um continente possui um nome e é composto por um conjunto de países. Forneça os membros de
classe a seguir:
<ol>
<li>Construtor que inicialize o nome do continente;</li>
<li>Um método que permita adicionar países aos continentes;</li>
<li>Um método que retorne a dimensão total do continente;</li>
<li>Um método que retorne a população total do continente;</li>
<li>Um método que retorne a densidade populacional do continente;</li>
<li>Um método que retorne o país com maior população no continente;</li>
<li>Um método que retorne o país com menor população no continente;</li>
<li>Um método que retorne o país de maior dimensão territorial no continente;</li>
<li>Um método que retorne o país de menor dimensão territorial no continente;</li>
<li>Um método que retorne a razão territorial do maior pais em relação ao menor país.</li>
</ol>
</li>

<li>Escreva uma classe Pessoa que representa uma pessoa numa árvore genealógica. A pessoa possui um nome, um pai e uma mãe (que também
são pessoas). Forneça os seguintes membros para a classe:
<ol>
<li>Construtores sobrecarregados que:
<ol>
<li>Inicialize o nome da pessoa, bem como seus antecessores (pai e mãe);</li>
<li>Inicialize o nome da pessoa, e coloque seus antecessores para null;</li>
</ol>
</li>
<li>Um método que verifique a igualdade semântica entre duas pessoas (as pessoas são iguais se possuem o mesmo nome e a mesma mãe);</li>
<li>Um método que verifique se duas pessoas são irmãs;</li>
<li>Um método que verifique se uma pessoa é antecessora da pessoa que recebeu a mensagem (é seu pai ou sua mãe, ou antecessor do
pai ou antecessor da mãe).</li>
</ol>
</li>

</ol>