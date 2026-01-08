# Bajaj Broking – Trading SDK (Simulation)

## Overview
This project is a simplified backend simulation of a trading platform, developed as part of the Bajaj Broking campus hiring assignment.

It demonstrates core trading workflows such as viewing tradable instruments, placing buy and sell orders, order execution and status tracking, viewing executed trades, and portfolio aggregation.

The system uses in-memory storage and does not integrate with real market data.

## Tech Stack
Java 17  
Spring Boot  
Maven  
REST APIs (JSON)  
In-memory data storage (Maps and Lists)  
GitHub Codespaces (development environment)

## Architecture
The application follows a layered architecture consisting of controller, service, repository, and model/DTO layers.  
This structure ensures separation of concerns, maintainability, and clean code organization.

## API Endpoints

### Instruments API
GET /api/v1/instruments

Returns a list of tradable instruments.

Sample Response:
[
  {
    "symbol": "TCS",
    "exchange": "NSE",
    "instrumentType": "EQUITY",
    "lastTradedPrice": 3500.0
  },
  {
    "symbol": "INFY",
    "exchange": "NSE",
    "instrumentType": "EQUITY",
    "lastTradedPrice": 1500.0
  },
  {
    "symbol": "RELIANCE",
    "exchange": "NSE",
    "instrumentType": "EQUITY",
    "lastTradedPrice": 2800.0
  }
]

### Order Management APIs

POST /api/v1/orders

Places a new BUY or SELL order with MARKET or LIMIT type.

Sample Request:
{
  "symbol": "TCS",
  "side": "BUY",
  "type": "MARKET",
  "quantity": 5
}

Sample Response:
{
  "orderId": "uuid",
  "status": "EXECUTED"
}

GET /api/v1/orders/{orderId}

Fetches the status of an order using orderId.

### Trades API
GET /api/v1/trades

Returns a list of executed trades.  
Only executed (MARKET) orders generate trades.

### Portfolio API
GET /api/v1/portfolio

Returns current portfolio holdings derived from executed trades.

Sample Response:
[
  {
    "symbol": "TCS",
    "quantity": 5,
    "averagePrice": 3500.0,
    "currentValue": 17500.0
  }
]

## Order Execution Logic
Market orders are executed immediately.  
Limit orders are validated and stored but not executed.  
Executed orders generate trades.  
Portfolio holdings are derived by aggregating executed trades.

## Assumptions
Single hardcoded user is used for simulation.  
In-memory storage is used, so data resets on application restart.  
Execution price is fixed for simplicity.  
No real market integration is performed.

## How to Run the Application
mvn spring-boot:run -Dspring-boot.run.arguments=--server.port=8080

Application runs at:
http://localhost:8080

## Testing APIs
APIs can be tested using curl, Postman, or any REST client.

Example:
curl http://localhost:8080/api/v1/instruments

## Future Improvements
Persistent database integration.  
Authentication and authorization.  
Order matching engine for LIMIT orders.  
Real-time price updates.  
Unit and integration testing.

## Author
Developed as part of the Bajaj Broking Campus Hiring Assignment.
