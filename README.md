# Stock Portfolio Tracker

This project is a full-stack web application for tracking stock market data and managing a personal investment portfolio. It was developed to demonstrate proficiency in a modern, end-to-end tech stack, from a dynamic frontend to a robust, cloud-based backend.

---

## 🚀 Key Features

* **User Authentication**: Secure user registration and login using a REST API.
* **Portfolio Management**: Add, view, and manage stock holdings in a personalized portfolio.
* **Real-Time Stock Data**: Fetches and displays live price quotes for stocks from a third-party API.
* **Data Persistence**: Stores user, stock, and portfolio data in a managed MySQL database on the cloud.
* **Modular Architecture**: Built with a clear separation of concerns using the Spring Boot framework for the backend and a component-based approach with React for the frontend.

---

## 🛠️ Tech Stack

### Backend

* **Language**: Java
* **Framework**: Spring Boot
* **Database**: MySQL (hosted on Google Cloud SQL)
* **API Integration**: Alpha Vantage (for real-time stock data)
* **Build Tool**: Maven

### Frontend

* **Framework**: React
* **Build Tool**: Vite
* **Languages**: HTML, CSS, JavaScript

---

## 🏁 Getting Started

To run this project locally, follow these steps:

### 1. Backend Setup

1.  **Clone the repository.**
2.  Open the project in IntelliJ IDEA.
3.  Configure your Google Cloud SQL database details in `src/main/resources/application.properties`.
4.  Insert your Alpha Vantage API key into `src/main/java/com/faizan/stocktrackeroracle/controller/StockController.java`.
5.  Run the `StockTrackerOracleApplication.java` class. The backend will start on port `8080`.

### 2. Frontend Setup

1.  Open a terminal in the `frontend` directory.
2.  Install dependencies: `npm install`.
3.  Start the development server: `npm run dev`. The frontend will be available on port `5173`.

---

## 📈 API Endpoints

The backend exposes a set of RESTful API endpoints for the frontend to interact with:

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `POST` | `/api/users/register` | Creates a new user. |
| `POST` | `/api/users/login` | Authenticates a user and returns their data. |
| `GET` | `/api/stocks/all` | Retrieves all available stocks from the database. |
| `GET` | `/api/stocks/live/{symbol}` | Fetches and returns live price data for a given symbol. |
| `POST` | `/api/portfolio/add` | Adds a new stock entry to a user's portfolio. |
| `GET` | `/api/portfolio/{userId}` | Retrieves all stock entries for a specific user. |

---

## 💡 What I Learned

This project provided hands-on experience in several key areas:

* **Full-Stack Integration**: Seamlessly connecting a Java backend to a React frontend using REST APIs and managing state across the application.
* **Database Management**: Creating, configuring, and connecting a managed cloud database (Google Cloud SQL) and performing CRUD operations with Spring Data JPA.
* **Third-Party API Integration**: Successfully implementing a live data feed while navigating common issues like API rate limits and data parsing.
* **Error Handling**: Debugging and resolving complex errors related to database connections, file imports, and data format mismatches.
* **Project Management**: Taking a project from an idea to a fully functional application, which is a key skill for a role like Associate Consultant at a company like Oracle.

## 📄 License

This project is licensed under the MIT License.
