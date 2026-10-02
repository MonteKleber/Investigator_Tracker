# 🐙 Investigator Tracker - Native Android RPG Companion

![Status](https://img.shields.io/badge/Status-MVP_Concluído-brightgreen)
![Linguagem](https://img.shields.io/badge/Kotlin-100%25-blue)
![Testes](https://img.shields.io/badge/Testes-JUnit4-success)

## 📌 Visão Geral
O **Investigator Tracker** é um aplicativo Android nativo desenvolvido em **Kotlin** para otimizar a experiência de jogadores e Mestres no sistema de RPG *Call of Cthulhu* (7ª Edição).

O projeto foi construído com foco em **Desenvolvimento Mobile e Engenharia de Software**, isolando a complexa regra de negócios do sistema BRP da interface visual. O aplicativo substitui cálculos mentais de limiares (sucessos normais, sólidos e extremos) por um motor lógico testado.

## 📱 Arquitetura e Funcionalidades (MVP v1.0)
*   **Motor de Regras Isolado:** A lógica matemática não possui dependências do Android SDK, aderindo ao princípio de Responsabilidade Única.
*   **Cálculo Dinâmico de Limiares:** Processamento imediato de níveis de sucesso (Normal, Sólido 1/2 e Extremo 1/5).
*   **Regra de Desastre Condicional:** Implementação da regra avançada onde o desastre varia consoante o nível da perícia (< 50 ou >= 50).

## 🧪 Qualidade de Software (QA) e Testes
Aplicando conceitos da trilha "Processos de testes de Softwares" (Instituto Eldorado), o projeto conta com testes de unidade (JUnit4) e testes de interface (Espresso).

**Cobertura de Testes:**
- [x] Validação de Sucesso Normal, Sólido e Extremo (Lógica).
- [x] Regras de Acerto Crítico e Desastres Dinâmicos (Lógica).
- [x] Validação de renderização dos componentes visuais (UI).

## 🚀 Como Executar o Projeto Localmente
1. Clone este repositório: `git clone https://github.com/MonteKleber/Investigator_Tracker.git`
2. Abra o diretório no **Android Studio**.
3. Aguarde a sincronização do *Gradle*.
4. Execute no emulador Android (ex: Pixel 7).
