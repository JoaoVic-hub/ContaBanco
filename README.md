# ContaBanco - Desafio de Sintaxe

## Descrição
Este projeto tem como objetivo exercitar todo o conteúdo apresentado no módulo de Sintaxe, codificando um cenário de criação de contas em um banco. O projeto `ContaBanco` receberá dados via terminal contendo as características de uma conta bancária e exibirá uma mensagem final ao usuário.

## Estrutura do Projeto
- **ContaBanco**
  - `ContaTerminal.java`: Classe responsável por realizar toda a codificação do programa.

## Requisitos
O projeto deve receber os seguintes dados via terminal:

| Atributo       | Tipo    | Exemplo       |
| -------------- | ------- | ------------- |
| Numero         | Inteiro | 1021          |
| Agencia        | Texto   | 067-8         |
| Nome Cliente   | Texto   | MARIO ANDRADE |
| Saldo          | Decimal | 237.48        |

## Funcionalidades
1. **Entrada de Dados**: Permitir que os dados da conta bancária sejam inseridos via terminal. O usuário receberá uma mensagem solicitando cada informação, por exemplo:
   - Programa: "Por favor, digite o número da Agência!"
   - Usuário: 067-8 (depois ENTER para o próximo campo)

2. **Mensagem Final**: Após todas as informações serem inseridas, o sistema exibirá uma mensagem com os dados passados.
