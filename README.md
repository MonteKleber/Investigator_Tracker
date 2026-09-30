# 🐙 Cthulhu Tracker - Native Android RPG Companion

![Status](https://img.shields.io/badge/Status-MVP_Concluído-brightgreen)
![Linguagem](https://img.shields.io/badge/Kotlin-100%25-blue)
![Testes](https://img.shields.io/badge/Testes-JUnit4-success)

## 📌 Visão Geral
O **Cthulhu Tracker** é um aplicativo Android nativo desenvolvido em **Kotlin** para otimizar a experiência de jogadores e Mestres no sistema de RPG *Call of Cthulhu* (7ª Edição).

O projeto foi construído com foco em **Desenvolvimento Mobile e Engenharia de Software**, isolando a complexa regra de negócios do sistema BRP (Basic Role-Playing) da interface visual. O aplicativo substitui cálculos mentais de limiares (sucessos normais, árduos e extremos) por um motor lógico testado e uma interface de alta usabilidade.

## 📱 Arquitetura e Funcionalidades (MVP v1.0)
A interface foi projetada em **XML** utilizando `ConstraintLayout` para garantir total responsividade em diferentes dimensões de ecrã, operando nativamente em Dark Mode para conforto visual.

*   **Motor de Regras Isolado:** A lógica matemática da `CalculadoraD100` não possui dependências do Android SDK, permitindo testes rápidos e aderência ao princípio de Responsabilidade Única.
*   **Cálculo Dinâmico de Limiares:** Processamento imediato de níveis de sucesso (Normal, Árduo 1/2 e Extremo 1/5) baseado no valor do atributo introduzido.
*   **Regra de Desastre Condicional:** Implementação da regra avançada onde o desastre varia consoante o nível da perícia do investigador (< 50 ou >= 50).
*   **Tratamento de Exceções na UI:** Prevenção de *crashes* (*NullPointerExceptions* e erros de conversão de tipo) com validação de campos vazios na `MainActivity`.

## 🧪 Qualidade de Software (QA) e Testes Unitários
A confiabilidade do motor de regras foi garantida através da prática de **Test-Driven Development (TDD)**.

Aplicando os conceitos de análise de valor limite e partição de equivalência — **práticas consolidadas durante a trilha "Processos de testes de Softwares" (Instituto Eldorado)** —, o projeto conta com uma bateria de testes automatizados utilizando **JUnit4**.

**Cobertura de Testes (Caminhos Felizes e Casos Extremos):**
- [x] Validação de Sucesso Normal, Árduo e Extremo.
- [x] Acerto Crítico Absoluto (Dado = 1).
- [x] Falha Comum.
- [x] Desastre Dinâmico (Perícia Alta com Dado = 100).
- [x] Desastre Dinâmico (Perícia Baixa com Dado >= 96).

## 🛠️ Tecnologias e Ecossistema
*   **Linguagem:** Kotlin
*   **Plataforma:** Android SDK (API 24+)
*   **Interface:** Views XML, ConstraintLayout, Toast Alerts
*   **Testes:** JUnit4
*   **Ferramentas:** Android Studio, Git, GitHub

## 🚀 Como Executar o Projeto Localmente
1. Clone este repositório: `git clone https://github.com/seu-usuario/Investigator-Tracker.git`
2. Abra o diretório no **Android Studio**.
3. Aguarde a sincronização do *Gradle*.
4. Execute os testes unitários no diretório `test` ou rode o projeto num emulador Android (ex: Pixel 7).