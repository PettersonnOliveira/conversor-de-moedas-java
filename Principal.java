import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conversor conversor = new Conversor();
        Moedas moedas = conversor.Convertendo();

        int opcao;

        do {
            System.out.println("*******************************");
            System.out.println("Seja bem-vindo ao Conversor de Moeda =]");
            System.out.println("*******************************");
            System.out.println("1) Dólar => Peso argentino");
            System.out.println("2) Peso argentino => Dólar");
            System.out.println("3) Dólar => Real brasileiro");
            System.out.println("4) Real brasileiro => Dólar");
            System.out.println("5) Dólar => Peso colombiano");
            System.out.println("6) Peso colombiano => Dólar");
            System.out.println("7) Sair");
            System.out.println("*******************************");
            System.out.print("Escolha uma opção válida: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor em Dólar (USD): ");
                    double valorUSD1 = scanner.nextDouble();
                    double taxaARS = moedas.conversion_rates().get("ARS");
                    double convertidoParaARS = valorUSD1 * taxaARS;
                    System.out.printf("Valor convertido: %.2f ARS\n", convertidoParaARS);
                    break;

                case 2:
                    System.out.println("Digite o valor em Peso argentino (ARS): ");
                    double valorARS = scanner.nextDouble();
                    double taxaARS2 = moedas.conversion_rates().get("ARS");
                    double convertidoParaUSD1 = valorARS / taxaARS2;
                    System.out.printf("Valor convertido: %.2f USD\n", convertidoParaUSD1);
                    break;

                case 3:
                    System.out.println("Digite o valor em Dólar (USD): ");
                    double valorUSD2 = scanner.nextDouble();
                    double taxaBRL = moedas.conversion_rates().get("BRL");
                    double convertidoParaBRL = valorUSD2 * taxaBRL;
                    System.out.printf("Valor convertido: %.2f BRL\n", convertidoParaBRL);
                    break;

                case 4:
                    System.out.println("Digite o valor em Real brasileiro (BRL): ");
                    double valorBRL = scanner.nextDouble();
                    double taxaBRL2 = moedas.conversion_rates().get("BRL");
                    double convertidoParaUSD2 = valorBRL / taxaBRL2;
                    System.out.printf("Valor convertido: %.2f USD\n", convertidoParaUSD2);
                    break;

                case 5:
                    System.out.println("Digite o valor em Dólar (USD): ");
                    double valorUSD3 = scanner.nextDouble();
                    double taxaCOP = moedas.conversion_rates().get("COP");
                    double convertidoParaCOP = valorUSD3 * taxaCOP;
                    System.out.printf("Valor convertido: %.2f COP\n", convertidoParaCOP);
                    break;

                case 6:
                    System.out.println("Digite o valor em Peso colombiano (COP): ");
                    double valorCOP = scanner.nextDouble();
                    double taxaCOP2 = moedas.conversion_rates().get("COP");
                    double convertidoParaUSD3 = valorCOP / taxaCOP2;
                    System.out.printf("Valor convertido: %.2f USD\n", convertidoParaUSD3);
                    break;

                case 7:
                    System.out.println("Saindo do Conversor de Moeda. Obrigado por usar!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

            System.out.println(); // Adiciona uma linha em branco para melhorar a leitura

        } while (opcao != 7);

        scanner.close();
    }


    }

