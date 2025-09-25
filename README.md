# 🏎️ Heat Online (projeto em desenvolvimento)

![Made with Angular](https://img.shields.io/badge/frontend-Angular-DD0031?logo=angular&logoColor=white)
![Backend Spring Boot](https://img.shields.io/badge/backend-Spring%20Boot-6DB33F?logo=spring&logoColor=white)
![Database PostgreSQL](https://img.shields.io/badge/database-PostgreSQL-4169E1?logo=postgresql&logoColor=white)
![Status](https://img.shields.io/badge/status-planning-blue)

---

## 🎯 Visão
Heat Online é uma adaptação digital competitiva do jogo de tabuleiro *Heat: Pedal to the Metal*.  
O objetivo é recriar a emoção das corridas estratégicas, com suporte para partidas online, ranking competitivo e campeonatos no futuro.

---

## 🚀 Funcionalidades Planeadas
- ✅ **Partidas online** até 5 jogadores (1v1v1v1v1).  
- ✅ **Sistema de matchmaking** com MMR/Elo.  
- ✅ **Chat integrado** (global, privado, in-game).  
- ✅ **Cartas oficiais**: velocidade, upgrades, patrocinadores, heat, stress.  
- ✅ **Pistas digitais** com setores, curvas e condições.  

---

## 🛠️ Stack Tecnológico
- **Frontend**: Angular, HTML, SCSS.  
- **Backend**: Java Spring Boot (microserviços).  
- **Base de Dados**: PostgreSQL.  
- **Comunicação em tempo real**: WebSockets.  
- **Infraestrutura**: Docker, Kubernetes, CI/CD.  

---

## 📂 Estrutura da Arquitetura
- **Auth Service** → Login OAuth 2.0 + JWT.  
- **Matchmaking Service** → Emparelhamento de jogadores.  
- **Game Service** → Motor de regras e corridas.  
- **Chat Service** → Mensagens globais, privadas e por jogo.  
- **Ranking Service** → Cálculo de MMR e ligas.  

---

## 🏁 Fluxo de Jogo
1. Jogador autentica com OAuth 2.0.  
2. Entra no matchmaking → emparelhado com até 4 jogadores.  
3. Corrida decorre em turnos → jogadas processadas pelo backend.  
4. Resultado enviado via WebSocket.  
5. Atualização de MMR, estatísticas e conquistas.  

---

## 🔮 Backlog
- **Campeonatos**
  - Corridas em sequência com pontos acumulados.  
  - Corridas agendadas em datas distintas.  
  - Sistema de inscrições e eliminatórias.  
- **Equipes e modos especiais**
  - Suporte a 2v2v2v2 (modo F1 por equipas).  
  - Campeonatos de equipes.  
- **Progressão & Conteúdo**
  - Customização de carros (skins, cores).  
  - Conquistas (ex: “3 vitórias seguidas”).  
  - Passe de temporada / eventos temporários.  
- **Infraestrutura**
  - Replay de corridas.  
  - Anti-cheat avançado.  
  - Crossplay (PC/Mobile).  
  - Suporte offline (vs IA).  
- **Social**
  - Amigos, convites e sistema de blocos.  
  - Histórico de chat.  
  - Notificações push.  

---

## 📌 Status
Projeto em fase inicial de **planejamento e arquitetura**.  
Próximos passos:  
- [ ] Finalizar documento de arquitetura.  
- [ ] Definir modelo inicial de base de dados.  
- [ ] Criar protótipo frontend + backend minimal (auth + lobby + chat).  

---
