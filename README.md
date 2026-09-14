# 📊 Enterprise Internal Data Management System

A lightweight, high-performance backend architecture built using **Java** and **SQL** for managing clients, tracking financial transactions, and calculating automated reports.

---

## 🚀 Key Features
- **Client & User Management:** Structured relational schema for enterprise users and clients.
- **Transaction Processing:** Track transaction status (`completed` vs `pending`).
- **Real-Time Analytics:** Java logic for aggregate metric calculations (Revenue & Pending Counts).

---

## 🛠️ Tech Stack
- **Backend Core:** Java (Object-Oriented Architecture)
- **Database:** SQL (SQLite / PostgreSQL Compatible)

---

## 💻 Database Schema Preview (SQL)
```sql
CREATE TABLE clients (
    client_id INTEGER PRIMARY KEY AUTOINCREMENT,
    client_name VARCHAR(150) NOT NULL,
    phone VARCHAR(20)
);

CREATE TABLE transactions (
    transaction_id INTEGER PRIMARY KEY AUTOINCREMENT,
    client_id INTEGER,
    title VARCHAR(200) NOT NULL,
    amount DECIMAL(12, 2) DEFAULT 0.00,
    status VARCHAR(20) DEFAULT 'pending',
    FOREIGN KEY (client_id) REFERENCES clients(client_id)
);
