# 💳 Simulador de Operações Bancárias

Uma aplicação simples em Java que simula operações bancárias básicas, como consulta de saldo, depósito e saque, via terminal.  
É um programa em Java puro, baseado em console, que permite ao usuário interagir com uma conta bancária fictícia.  
A aplicação valida as entradas do usuário, impedindo operações inválidas, como saques maiores que o saldo disponível ou valores negativos.
Ao iniciar, o sistema exibe os dados da conta e oferece um menu de opções.

## Preview

![image](https://github.com/user-attachments/assets/d2cff6b4-2939-402e-99d7-7840e71d1248)
![image](https://github.com/user-attachments/assets/72b995ac-3356-4edf-bf7d-d3375f90c454)  
![image](https://github.com/user-attachments/assets/a2813b32-f8a2-4812-a394-ccc4b0a5ade0)
![image](https://github.com/user-attachments/assets/5b4d057b-6092-41a3-bbfe-0d17d4581112)

## Tecnologias & Ferramentas

- Java 21
- JDK (Java Development Kit)
- Entrada de dados via Scanner
- Sem uso de bibliotecas externas – 100% Java puro
- Git

## Usabilidade

A aplicação oferece uma interação simples e intuitiva através do terminal, permitindo que o usuário navegue pelas funcionalidades utilizando um menu numérico.

Foram implementadas validações para garantir a integridade das operações, impedindo cenários como:

- Inserção de texto em campos numéricos;
- Valores negativos ou zerados;
- Opções inexistentes no menu;
- Tentativas de saque com saldo insuficiente;
- Entradas vazias.

A experiência do usuário foi aprimorada com mensagens claras de sucesso, erro e confirmação das operações realizadas.

## Funcionalidades

### Gerenciamento de Conta

- Exibição dos dados da conta;
- Consulta do saldo disponível em tempo real;
- Encerramento seguro da sessão bancária.

### Operações Financeiras

- Realização de depósitos;
- Atualização automática do saldo após depósito;
- Realização de saques;
- Validação de saldo disponível antes da operação;
- Atualização automática do saldo após saque.

### Validação de Dados

- Verificação de entradas vazias;
- Tratamento de valores não numéricos;
- Restrição de valores menores ou iguais a zero;
- Validação das opções do menu;
- Tratamento de erros sem interrupção do programa.

### Controle de Fluxo

- Execução contínua da aplicação até solicitação de saída;
- Gerenciamento de estados por meio de estruturas condicionais e de repetição;
- Reaproveitamento de lógica de validação através de métodos específicos.

---

### Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- Estruturas condicionais (`if`, `else`, `switch`)
- Estruturas de repetição (`while`)
- Encapsulamento de regras de validação
- Manipulação de entrada e saída de dados
- Tratamento de exceções (`try-catch`)
- Modularização de código
- Reutilização de métodos

## Licença
Este projeto está licenciado sob a Licença MIT. Veja o arquivo [LICENSE](https://github.com/luizadaso/Simulador-de-Operacoes-Bancarias/blob/master/LICENSE.txt) para mais detalhes.

## Autora

Para mais informações, sinta-se à vontade para entrar em contato:

<div>
  <img src="https://github.com/user-attachments/assets/57cac2a3-49b1-4a0a-aef3-e968523971eb" width="15%" alt="autora" />
</div>

- [Github](https://github.com/luizadaso)
- [Linkedin](https://www.linkedin.com/in/luizadaso)



