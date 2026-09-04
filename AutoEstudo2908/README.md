# Atividade de Autoestudo — Encapsulamento, Herança e Polimorfismo

**Nome completo:** Samuel Morais Ferreira Campos
**Turma:** Técnicas de Programação - 2º DSM

## Descrição dos exercícios

### Exercício 1 — Cofrinho digital (Encapsulamento)
Classe `Cofrinho` com atributos privados `objetivo` e `saldo`. O saldo só pode
ser alterado pelos métodos `depositar()` e `retirar()`, que validam os valores
(rejeitam depósitos ou retiradas inválidas e impedem saldo negativo). Não há
setter para `saldo`.

### Exercício 2 — Plataforma de conteúdos (Herança)
Superclasse `Conteudo` com `titulo`, `duracaoMinutos` e `exibirResumo()`. As
subclasses `VideoAula` e `Podcast` herdam esses membros com `extends` e
`super(...)`, sem sobrescrever `exibirResumo()`, apenas acrescentando seus
próprios atributos e métodos (`reproduzirVideo()` e `ouvirPodcast()`).

### Exercício 3 — Calculadora (Polimorfismo por sobrecarga)
Classe `Calculadora` com três versões do método `somar()`, diferenciadas pela
quantidade e pelo tipo dos parâmetros (dois `int`, dois `double`, três `int`).
O compilador escolhe a versão correta em tempo de compilação (polimorfismo
estático).

### Exercício 4 — Sistema de pagamentos (Encapsulamento + Herança + Polimorfismo)
Superclasse `Pagamento` com `valor` privado e os métodos `calcularTaxa()`,
`calcularTotal()` e `processar()`. As subclasses `PagamentoPix` e
`PagamentoCartao` estendem `Pagamento` e sobrescrevem (`@Override`)
`calcularTaxa()` e `processar()` com regras próprias. No `Main`, as variáveis
são declaradas do tipo `Pagamento`, mas cada chamada a `processar()` executa a
versão correspondente ao objeto real (polimorfismo dinâmico). Foi incluído
também o desafio adicional `PagamentoBoleto`, com taxa fixa de R$ 2,50.

## Instruções para compilar e executar

Cada exercício está em sua própria pasta e pode ser compilado e executado de
forma independente. Exemplo para o exercício 1:

```bash
cd exercicio1-encapsulamento
javac *.java
java Main
```

Repita o mesmo processo (`javac *.java` seguido de `java Main`) dentro de
cada uma das pastas `exercicio2-heranca`, `exercicio3-polimorfismo` e
`exercicio4-integrado`.

## Onde cada conceito foi utilizado

- **Encapsulamento:** atributos privados (`saldo` no Exercício 1; `valor` e
  `parcelas` no Exercício 4), acessados apenas por métodos da própria classe
  ou por getters.
- **Herança:** `VideoAula extends Conteudo` e `Podcast extends Conteudo`
  (Exercício 2); `PagamentoPix extends Pagamento`, `PagamentoCartao extends
  Pagamento` e `PagamentoBoleto extends Pagamento` (Exercício 4).
- **Polimorfismo:**
  - Sobrecarga (estático) no Exercício 3, com três versões de `somar()`.
  - Sobrescrita (dinâmico) no Exercício 4: variáveis do tipo `Pagamento`
    apontando para objetos de subclasses diferentes, onde `processar()` e
    `calcularTaxa()` executam a versão específica de cada objeto em tempo de
    execução.

## Dificuldades encontradas e como foram resolvidas

Aqui vai a versão resumida:

```
## Dificuldades encontradas e como foram resolvidas

**Exercício 1 (Cofrinho):** Separei a validação da retirada em duas condições
e isso gerava mensagens de erro duplicadas. Uni tudo em uma única condição
com `&&`, como sugere a Pista 3, e o problema foi resolvido.

**Exercício 2 (Conteúdo):** Esqueci de chamar `super(titulo, duracaoMinutos)`
no construtor das subclasses e o código não compilava. Entendi que essa
chamada precisa ser a primeira instrução do construtor para inicializar os
atributos herdados.

**Exercício 3 (Calculadora):** Tentei diferenciar duas versões de `somar()`
só pelo tipo de retorno, o que deu erro de ambiguidade. Percebi que a
sobrecarga depende da lista de parâmetros, não do retorno, e ajustei.

**Exercício 4 (Pagamentos):** Não entendia por que `calcularTotal()`, na
superclasse, já usava a taxa certa de cada subclasse sem eu reescrevê-lo.
Vi que, como ele chama `calcularTaxa()` internamente, o Java executa a
versão sobrescrita do objeto real — foi aí que o polimorfismo dinâmico fez
sentido. Apliquei o mesmo raciocínio no desafio extra (`PagamentoBoleto`).
```
