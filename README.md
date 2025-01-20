# AtividadeCliente

## Sobre o Projeto
O projeto **AtividadeCliente** é uma aplicação em Java desenvolvida para ser executada no terminal. Este programa simula funcionalidades de um banco virtual, permitindo que os usuários criem contas, realizem transações financeiras e consultem informações de suas contas.

## Funcionalidades
1. **Cadastro de Cliente**:
   - Nome
   - CPF
   - Telefone
   - CEP
   - E-mail
   - RG
   - Data de nascimento

2. **Escolha do Tipo de Conta**:
   - Conta Corrente
   - Conta Salário

3. **Operações Bancárias**:
   - Saque
   - Depósito
   - Consulta de Saldo
   - Geração de Extrato

## Pré-requisitos
Para executar este projeto, é necessário:
- Java JDK 17 ou superior
- Um terminal compatível com Windows ou outro sistema operacional

## Como Executar
1. Clone o repositório ou copie os arquivos do projeto para o seu computador.
2. Compile o código utilizando o seguinte comando no terminal (dentro do diretório do projeto):
   ```bash
   javac -d bin src/*.java
   ```
3. Execute o programa utilizando a extenção Java run.

## Exemplo de Execução
```text
Bem-vindo ao Banco Virtual!
Opa, percebi que você não possui cadastro, irei te cadastrar no nosso banco.
Digite seu nome: leo
Digite seu CPF: 99999999999
Digite seu telefone: 99999999999
Digite seu CEP: 99999999
Digite seu e-mail: leonardopaniz@outlook.com
Digite seu RG: 8450165
Digite sua data de nascimento: 99999999
Cadastro realizado com sucesso!
Escolha o tipo de conta:
1 - Conta Corrente
2 - Conta Salário
1
Digite o saldo inicial da conta:
50000
Digite o limite de crédito da Conta Corrente:
100000

Escolha uma opção:
1 - Saque
2 - Depósito
3 - Consulta de saldo
4 - Gerar Extrato
5 - Sair
3
Saldo da conta CC123: R$50000.0
Limite de crédito disponível: R$100000.0

Escolha uma opção:
1 - Saque
2 - Depósito
3 - Consulta de saldo
4 - Gerar Extrato
5 - Sair
1
Digite o valor que deseja sacar:
```

## Estrutura do Projeto
- **src/**: Contém os arquivos-fonte do projeto.
- **bin/**: Diretório gerado após a compilação contendo os arquivos `.class`.

## Tecnologias Utilizadas
- Linguagem: Java
- Ambiente de desenvolvimento: Visual Studio Code

## Autor
**Leonardo Paniz**
- E-mail: leonardopaniz@outlook.com

