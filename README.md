Apache Kafka with Spring Boot - Event-Driven Microservices

Project Overview:
This project demonstrates an event-driven microservices architecture using Apache Kafka with Spring Boot. It includes four microservices that communicate asynchronously through Kafka topics:

- base-domains: Shared models and configurations.
- order-service: Produces Kafka events when an order is placed.
- stock-service: Listens to order events.
- email-service: Listens to order events.

 Technologies Used
- Java 17
- Spring Boot 3
- Apache Kafka
- Spring Kafka
- Maven
- IntelliJ IDEA

 Project Setup

 1. Start Kafka & Zookeeper
Ensure Kafka & Zookeeper are running by executing the following CLI commands:

Start Zookeeper
Mac: bin\zookeeper-server-start.sh config\zookeeper.properties OR
Windows: .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

Start Kafka Broker
Mac: bin\kafka-server-start.sh config\server.properties OR
Windows: .\bin\windows\kafka-server-start.bat .\config\server.properties

 2. Clone the Repository

git clone https://github.com/your-repo/kafka-springboot-microservices.git
cd kafka-springboot-microservices


 3. Build & Run Services
Each microservice is a separate Spring Boot application. Navigate to each service and run:

sh
mvn clean install
mvn spring-boot:run


 Microservices Breakdown

 1. base-domains (Shared Module)
- Contains Order Entity and OrderEvent class.
- Defines the Kafka topic name and dependencies.
- Imported as a dependency in other services.

 2. order-service (Producer)
- Publishes messages to Kafka when an order is placed.
- Implements an Order Producer using `KafkaTemplate`.
- Exposes a REST API to trigger Kafka events.

 3. stock-service (Consumer)
- Listens for `OrderEvent` messages from Kafka.
- Implements `@KafkaListener` to listen to message.

 4. email-service (Consumer)
- Listens for `OrderEvent` messages from Kafka.

 API Endpoints
 Order Service
- Place Order:
  http
  POST /api/order/place
  
  Request Body:
  json
  {
    "product": "Laptop",
    "quantity": 2,
    "price" : 500
  }
  

 Challenges Faced
- Debugging Kafka connectivity issues.

 Future Enhancements
- Implement database persistence for order tracking.
- Add Kafka Streams for real-time processing.
- Introduce Resilient Error Handling with Dead Letter Queue (DLQ).

 Contributing
Contributions are welcome! Feel free to fork the repo, create a branch, and submit a pull request.

 License
This project is open-source.

