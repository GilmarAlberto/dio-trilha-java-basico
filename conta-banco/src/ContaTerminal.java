/*
 Vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário.

 1. Crie o projeto ContaBanco que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
 Dentro do projeto, crie a classe ContaTerminal.java para realizar toda a codificação do nosso programa.

 Atributo	Tipo	Exemplo
  Numero	Inteiro	1021
  Agencia	Texto	067-8
  Nome Cliente	Texto	MARIO ANDRADE
  Saldo	Decimal	237.48

 2. Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:
 Programa: "Por favor, digite o número da Agência !"
 Usuário: 1021 (depois ENTER para o próximo campo)

 3. Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
 "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".

 Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.
*/

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Conta Corrente: ");
        numero = scan.nextInt();
        scan.nextLine();

        System.out.println("Agência: ");
        agencia = scan.nextLine();

        System.out.println("Nome do cliente: ");
        nomeCliente = scan.nextLine();

        System.out.println("Saldo: ");
        saldo = scan.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);

        scan.close();

    }
}
