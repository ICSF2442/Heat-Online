# 🏎️ Heat Online (project in development)

![Made with Angular](https://img.shields.io/badge/frontend-Angular-DD0031?logo=angular&logoColor=white)
![Backend Spring Boot](https://img.shields.io/badge/backend-Spring%20Boot-6DB33F?logo=spring&logoColor=white)
![Database PostgreSQL](https://img.shields.io/badge/database-PostgreSQL-4169E1?logo=postgresql&logoColor=white)
![Status](https://img.shields.io/badge/status-planning-blue)

---

## 🎯 Vision
Heat Online is a competitive digital adaptation of the board game *Heat: Pedal to the Metal*.  
The goal is to recreate the thrill of strategic racing, with support for online matches, competitive ranking, and championships.

---

## 🚀 Main Features
- ✅ **Online matches** with up to 5 players (1v1v1v1v1).  
- ✅ **Matchmaking system** with MMR/Elo.  
- ✅ **Integrated chat** (global, private, in-game).  
- ✅ **Official cards**: speed, upgrades, sponsors, heat, stress.  
- ✅ **Digital tracks** with sectors, curves, and conditions.  
- ✅ **Championships** (sequential races with scoring).  

---

## 🛠️ Tech Stack
- **Frontend**: Angular, HTML, SCSS.  
- **Backend**: Java Spring Boot (microservices).  
- **Database**: PostgreSQL.  
- **Real-time communication**: WebSockets.  
- **Infrastructure**: Docker, Kubernetes, CI/CD.  

---

## 📂 Architecture Structure
- **Auth Service** → OAuth 2.0 Login + JWT.  
- **Matchmaking Service** → Player pairing.  
- **Game Service** → Rules engine and races.  
- **Chat Service** → Global, private, and in-game messages.  
- **Championship Service** → Sequential races and scoring.  
- **Ranking Service** → MMR calculation and leagues.  

---

## 🏁 Game Flow
1. Player authenticates via OAuth 2.0.  
2. Enters matchmaking → paired with up to 4 other players.  
3. Race proceeds in turns → moves processed by the backend.  
4. Results sent via WebSocket.  
5. Update of MMR, stats, and achievements.  

---

## 🔮 Future
- Scheduled championship races.  
- 2v2v2v2 team mode (F1-style teams).  
- Car customization.  
- Replays and spectator mode.  
- Crossplay (PC/Mobile).  
- Friends, invites, and push notifications.  

---

## 📌 Status
Project in the early phase of **planning and architecture**.  
Next steps:  
- [ ] Finalize architecture document.  
- [ ] Define initial database model.  
- [ ] Create minimal frontend + backend prototype (auth + lobby + chat).  

---
