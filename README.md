### Padrão de Projeto Adapter.:package:



Proposto pela **DIO** o desafio explorar os padrões de projeto, na qual optei pelo **Adapter** que é um projeto estrutural que permite objetos com interfaces incompatíveis colaborarem entre si.



#### O Código.

Na proposta como demonstração simulei a situação de uso de uma classe ***"SdkPagamentoCredito"*** como uma implementação que não pode ser acessada e modificada (métodos definidos), e que foi incorporada ao restante código. A ideia é um adaptador que encobre um dos objetos para esconder a complexidade da conversão. Ou seja, adaptadores podem não só converter dados em vários formatos, mas também podem ajudar objetos com diferentes interfaces a colaborar. Assim:

1. O adaptador obtém uma interface, compatível com um dos objetos existentes.
2. Usando essa interface, o objeto existente pode chamar os métodos do adaptador com segurança.
3. Ao receber a chamada, o adaptador passa o pedido para o segundo objeto, mas em um formato e ordem que o segundo objeto espera.



#### Vantagens e desvantagens.

1. *Princípio de responsabilidade única*. Você pode separar a conversão de interface ou de dados da lógica primária do negócio do programa.
2. *Princípio aberto/fechado*. Você pode introduzir novos tipos de adaptadores no programa sem quebrar o código cliente existente, desde que eles trabalhem com os adaptadores através da interface cliente.
3. A complexidade geral do código aumenta porque você precisa introduzir um conjunto de novas interfaces e classes. Algumas vezes é mais simples mudar a classe serviço para que ela se adeque com o resto do seu código.

Para demais informações e outros padrões caso queira explorar indico o seguinte site: https://refactoring.guru/pt-br. Na qual tirei referências para o desenvolvimento do código. E também do canal do YouTube: https://www.youtube.com/c/RinaldoDev.

