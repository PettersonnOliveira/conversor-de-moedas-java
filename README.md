# 💱 Conversor de Moedas em Java

Este projeto é um conversor de moedas que utiliza a API **[ExchangeRate API](https://www.exchangerate-api.com/)** para obter cotações em tempo real. O programa é feito em **Java**, com interação via **console**, permitindo a conversão entre diferentes moedas.

---

## 🛠 Tecnologias Utilizadas

- Java 17+ (ou versão compatível)
- [Gson](https://github.com/google/gson) para desserialização de JSON
- [ExchangeRate API](https://www.exchangerate-api.com/) para cotações em tempo real
- `HttpClient` da biblioteca padrão do Java

---

## 🔧 Como Executar

1. Clone este repositório:

```bash
git clone https://github.com/seu-usuario/conversor-moedas-java.git
cd conversor-moedas-java
``

## ✅ Funcionalidades

- ✅ Requisição em tempo real de cotações via API
- ✅ Menu interativo com 6 opções de conversão:
  - Dólar ⇄ Peso Argentino
  - Dólar ⇄ Real Brasileiro
  - Dólar ⇄ Peso Colombiano
- ✅ Entrada de valor personalizada pelo usuário
- ✅ Exibição formatada do valor convertido
- ✅ Validação de opção no menu
- ✅ Encerramento seguro do programa

---

## 📦 Estrutura do Projeto

```bash
📁 src/
├── Conversor.java       # Classe responsável pela requisição HTTP e desserialização JSON
├── Moedas.java          # Record que representa a estrutura do JSON da API
└── Principal.java       # Classe principal com o menu de interação e lógica de conversão
