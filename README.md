🏥 Hospital Management System
A web-based Hospital Management System designed to simplify and centralize hospital operations like doctor management, patient tracking, appointment scheduling, and transactions.
Built with Java Spring Boot (backend), HTML/CSS/JavaScript (frontend), and MySQL (database).


🚀 Features


-🔐 Secure Login and Authentication


-📊 Admin Dashboard with Data Visualization


-🩺 Doctor Management (Add, Update, View, Delete Doctors)


-👨‍⚕️ Patient Management (Add, Update, View, Delete Patients)


-📅 Appointment Scheduling and Management


-💳 Transaction and Billing Management


-🗂️ Organized Codebase following MVC Architecture


-📱 Responsive UI for better user experien


🛠️ Technologies Used


Backend: Java Spring Boot


Frontend: HTML, CSS, JavaScript


Database: MySQL


Tools: Spring Data JPA, Maven, VS Code


🏗️ Project Structure


hospital-management-system/


├── src/


│   ├── main/


│   │   ├── java/


│   │   │   └── com/hospitalmanagement/


│   │   │       ├── controller/


│   │   │       ├── model/


│   │   │       ├── repository/


│   │   │       ├── service/


│   │   │       └── HospitalManagementApplication.java


│   │   └── resources/


│   │       ├── static/  (CSS, JS, Images)


│   │       ├── templates/ (HTML files)


│   │       └── application.properties


├── pom.xml


└── README.md


⚙️ Installation and Setup


Clone the repository:


bash
Copy
Edit
git clone https://github.com/your-username/hospital-management-system.git


Open in VS Code or any IDE supporting Java Spring Boot.


Set up the MySQL database:


Create a database named hospital_db.


Update your application.properties with your MySQL username and password.


Run the application:


From your IDE: Run HospitalManagementApplication.java.


Or using terminal:


bash
Copy
Edit
mvn spring-boot:run


Access the system:


Open your browser and go to: http://localhost:8080/














