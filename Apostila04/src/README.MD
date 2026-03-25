Resumo do que foi feito no seu código (baseado nos comentários)
Estrutura do projeto

Você criou 3 classes:

Categoria
Produto
Terminal (classe principal com main)

Isso mostra que você já está trabalhando com:

criação de classes
objetos
associação entre classes
entrada de dados com Scanner
1️⃣ Classe Categoria

Você criou uma classe simples para representar uma categoria de produto.

Atributos:

nome
descrição

Observação do seu comentário:
Você escreveu que não é recomendado usar System.out.println dentro da entidade.

Ou seja:

a classe modelo (model) só guarda dados
quem mostra informações é a classe Terminal

Isso é uma boa prática de organização do código.

2️⃣ Classe Produto

Essa classe representa um produto da loja.

Atributos criados:

nome
preço
quantidade
garantia (true ou false)
categoria (objeto da classe Categoria)

Aqui acontece algo importante que você já aplicou:

👉 Associação entre classes

Um produto possui uma categoria.

Ou seja:

Produto tem uma Categoria
3️⃣ Classe Terminal (main)

Aqui você fez o fluxo principal do programa.

Passos que seu programa faz
Criar um Scanner para ler dados
Criar um objeto Produto
Pedir dados do produto ao usuário
Criar um objeto Categoria
Pedir dados da categoria
Associar categoria ao produto
Mostrar os dados na tela
Parte mais importante do seu comentário (explicação do professor)

Você explicou isso:

produto.categoria = categoria1;

Significa:

você criou um objeto produto
dentro dele existe um atributo que guarda uma categoria
você colocou dentro dele o objeto categoria que criou

Visualmente seria assim:

Produto
|
|---- Categoria