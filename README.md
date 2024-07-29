# Projects Overview

This repository contains various projects demonstrating different design patterns and practical implementations. Each project showcases a specific pattern or concept in software design. Below are the details for each project.

## 1. Weather Alert System

### Use Case Name
Weather Alert System

### Use Case Description
A weather alert system that sends notifications based on weather conditions. Users receive alerts for severe weather conditions like thunderstorms, high winds, or extreme temperatures.

### Logic of the Code
The system uses a strategy pattern to dynamically choose different alert strategies (e.g., email, SMS, push notifications) based on the weather conditions. It incorporates a `WeatherAlert` class that manages alerts and uses decorators to add additional features such as alert priorities or different notification methods.

### What It Solves
The system provides a flexible way to manage and deliver weather alerts. It allows easy addition of new alert methods and priorities without altering the core logic.

### Where It Is Used
This system can be used in weather apps, smart home systems, or any application requiring real-time weather notifications.

![Screenshot (137)](https://github.com/user-attachments/assets/8d7a32dd-0148-4f2e-9a9a-23dad873bbeb)

## 2. Lighting Control System

### Use Case Name
Adaptive Lighting Control System

### Use Case Description
An adaptive lighting control system that adjusts lighting based on different strategies. The system allows users to choose between different lighting strategies (e.g., bright, dim) based on their preferences or environmental conditions.

### Logic of the Code
The system employs the strategy pattern to switch between different lighting strategies dynamically. The `LightingStrategy` interface defines the lighting behavior, and concrete implementations like `BrightLightingStrategy` and `DimLightingStrategy` provide specific behaviors.

### What It Solves
This system provides flexibility in managing lighting conditions, allowing for adaptive responses to different needs and environments without modifying the core system.

### Where It Is Used
This system can be integrated into smart home automation systems, office environments, or any application requiring dynamic lighting adjustments.

![Screenshot (141)](https://github.com/user-attachments/assets/c9135818-3ef3-46f3-b8a4-2194f5bd91bf)


## 3. Meal Builder System

### Use Case Name
Custom Meal Builder

### Use Case Description
A meal builder system that allows users to customize their meal by selecting various options such as size, bread type, toppings, and sauce.

### Logic of the Code
The system uses the builder pattern to construct a meal with various customizable options. The `MealBuilder` class provides methods to set different meal components, and the `CustomMealBuilder` class extends this to handle user inputs for meal customization.

### What It Solves
It allows users to build a meal according to their preferences, providing a flexible and user-friendly interface for meal customization.

### Where It Is Used
This system is ideal for fast-food restaurants, meal delivery services, and any application that requires custom meal preparation.

![Screenshot (140)](https://github.com/user-attachments/assets/a8209ecb-ff77-4bba-aa4f-857e77b22907)

## 4. Smart Device Factory

### Use Case Name
Smart Device Factory

### Use Case Description
A factory system for creating smart devices like thermostats, lights, and cameras based on user specifications.

### Logic of the Code
The factory pattern is used to create instances of different smart devices. The `SmartDeviceFactory` class provides methods to create specific devices, encapsulating the creation logic and ensuring that devices are created according to the provided specifications.

### What It Solves
It simplifies the creation of various smart devices by centralizing the creation logic in one place, making the code more maintainable and extensible.

### Where It Is Used
This factory can be used in smart home systems, IoT applications, and any system that requires the creation of different types of smart devices.

![Screenshot (142)](https://github.com/user-attachments/assets/92d75202-1fd2-4cd1-bbac-4e59fbf73cc6)

## 5. Corporate Hierarchy System

### Use Case Name
Corporate Hierarchy Management

### Use Case Description
A system to manage corporate hierarchies, including employees and managers. The system allows users to add employees, assign them to managers, and view organizational details.

### Logic of the Code
The system employs composite and iterator patterns to manage and traverse a hierarchical structure of employees and managers. Classes like `Employee`, `Manager`, and `CorporateHierarchy` handle the hierarchical structure and operations.

### What It Solves
It provides a structured way to manage and view corporate hierarchies, making it easier to handle complex organizational structures and relationships.

### Where It Is Used
This system can be used in HR management software, organizational chart applications, and any application requiring management of employee hierarchies.

![Screenshot (138)](https://github.com/user-attachments/assets/c53f6dc7-5691-4d01-a8a9-649cdc9338d8)

## 6. Smart Home Notification System

### Use Case Name
Customizable Notification System for Smart Home

### Use Case Description
A notification system for a smart home application that allows users to receive alerts through various channels like sound, email, or mobile app notifications.

### Logic of the Code
The decorator pattern is used to enhance the base notification system with additional features. The `Notification` class represents the core notification functionality, while decorators like `SoundAlertDecorator`, `EmailNotificationDecorator`, and `MobileAppNotificationDecorator` add specific features.

### What It Solves
It provides a flexible and extensible way to manage and enhance notifications, allowing users to customize how they receive alerts without modifying the core notification logic.

### Where It Is Used
This system can be used in smart home applications, alert management systems, and any application requiring customizable notification features.

![Screenshot (139)](https://github.com/user-attachments/assets/3424be9d-4cfb-49ac-bbcf-8dcc89c0796e)

## Design Patterns Used

### 1. Weather Alert System - Observer Pattern
**Description:**  
The Observer Pattern is used to define a one-to-many dependency between objects. In the Weather Alert System, this pattern allows multiple observer objects (e.g., alert systems) to be notified and updated automatically when there is a change in the weather conditions (the subject). This decouples the weather monitoring logic from the alert notification logic, allowing for flexible and dynamic updates.

**Benefits:**
- **Decoupling:** Separates the core weather monitoring system from the alert notification system.
- **Dynamic Updates:** Observers are automatically notified of changes, ensuring up-to-date alerts.
- **Scalability:** Easily add or remove observers without modifying the core system.

### 2. Lighting Control System - Strategy Pattern
**Description:**  
The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. In the Adaptive Lighting Control System, different lighting strategies (e.g., bright, dim) are encapsulated as separate classes. The system can switch between these strategies dynamically based on user preferences or environmental conditions.

**Benefits:**
- **Flexibility:** Easily switch between different algorithms (lighting strategies) without changing the code that uses them.
- **Extensibility:** New strategies can be added without modifying existing code.

### 3. Meal Builder System - Builder Pattern
**Description:**  
The Builder Pattern is used to construct a complex object step by step. In the Custom Meal Builder, the pattern helps in assembling a meal with various customizable options such as size, bread type, toppings, and sauce. The MealBuilder class provides a fluent interface for setting different components of the meal.

**Benefits:**
- **Encapsulation:** Separates the construction of a complex object from its representation.
- **Flexibility:** Allows for customization of the meal without changing the underlying construction process.

### 4. Smart Device Factory - Factory Pattern
**Description:**  
The Factory Pattern defines an interface for creating objects but allows subclasses to alter the type of objects that will be created. In the Smart Device Factory, this pattern is used to create different types of smart devices (e.g., thermostats, lights, cameras) based on user specifications.

**Benefits:**
- **Encapsulation:** Hides the instantiation logic of devices, promoting a clean and easy-to-maintain codebase.
- **Extensibility:** New device types can be added without changing the existing factory code.

### 5. Corporate Hierarchy System - Composite and Iterator Patterns
**Description:**  
- **Composite Pattern:** Used to compose objects into tree structures to represent part-whole hierarchies. In the Corporate Hierarchy System, the pattern manages employees and managers, allowing for a flexible structure that can represent complex organizational hierarchies.
- **Iterator Pattern:** Provides a way to access elements of a collection sequentially without exposing its underlying representation. This pattern is used to traverse the hierarchical structure of employees and managers.

**Benefits:**
- **Flexibility:** Allows for a flexible and recursive representation of hierarchical structures.
- **Traversal:** Provides a standard way to access and iterate over elements in the hierarchy.

### 6. Smart Home Notification System - Decorator Pattern
**Description:**  
Similar to the Weather Alert System, the Decorator Pattern is used here to dynamically add features to a base notification system. The system allows for adding features such as sound alerts, email notifications, and mobile app notifications as decorators to the core notification functionality.

**Benefits:**
- **Flexibility:** Dynamically add or modify features without changing the core notification logic.
- **Modularity:** Enhancements are added in a modular fashion, allowing for easy updates and maintenance.

# Virtual Classroom

## Use Case Name
Virtual Classroom

## Use Case Description
The Virtual Classroom application is a terminal-based system designed to manage classroom operations, including class scheduling, student enrollment, assignment management, and attendance tracking. The system provides an efficient and user-friendly way to handle various aspects of a classroom environment.

## Logic of the Code
### ClassroomManager Class
- **Singleton Pattern**: Ensures only one instance of the `ClassroomManager` exists.
- **Classroom Management**: Handles adding and removing classrooms, listing all available classrooms.
- **Student Management**: Manages student enrollment in classrooms.
- **Assignment Management**: Schedules and tracks assignments, handles submission of assignments.

### Entities
- **Classroom**: Represents a classroom with a name, a list of students, and assignments. Provides methods to add students, assign assignments, and retrieve student information.
- **Student**: Represents a student with an ID and methods to submit assignments.
- **Assignment**: Represents an assignment with details and status.

### Commands
- **AddClassroomCommand**: Adds a new classroom.
- **AddStudentCommand**: Enrolls a student in a classroom.
- **ScheduleAssignmentCommand**: Schedules an assignment for a classroom.
- **SubmitAssignmentCommand**: Allows a student to submit an assignment.
- **ListStudentsCommand**: Lists all students in a specific classroom.
- **RemoveClassroomCommand**: Removes a classroom from the system.

### Exception Handling
Custom exceptions are used to handle specific errors such as duplicate classrooms, non-existent classrooms, or unregistered students.

## Design Patterns Used
### Singleton Pattern
- **Used In**: `ClassroomManager`
- **Description**: Ensures that there is only one instance of the `ClassroomManager` class throughout the application. This pattern provides a global point of access to the `ClassroomManager` instance and controls its creation.

### Command Pattern
- **Used In**: `AddClassroomCommand`, `AddStudentCommand`, `ScheduleAssignmentCommand`, `SubmitAssignmentCommand`, `ListStudentsCommand`, `RemoveClassroomCommand`
- **Description**: Encapsulates a request as an object, thereby allowing parameterization of clients with different requests, queuing of requests, and logging of the requests. It decouples the sender of a request from the receiver, allowing for easier management and extensibility of commands.

### Factory Pattern
- **Used In**: Not explicitly used in the current implementation but can be employed for creating instances of commands or entities if required.
- **Description**: Provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created. Useful for creating various command objects or entities based on dynamic input.

## What It Solves
The Virtual Classroom application provides a structured way to manage classroom operations, making it easier for administrators and teachers to handle tasks such as scheduling, student management, and assignment tracking. It streamlines administrative tasks and ensures that all relevant data is organized and accessible.

## Where It Is Used
- **Educational Institutions**: To manage and monitor classroom activities, including student enrollments and assignment submissions.
- **Online Learning Platforms**: To provide administrative functionality for virtual classrooms.
- **Training Centers**: To handle scheduling, assignments, and student management for various training programs.

## How to Run the Application

1. **Compile the Code**:
   Ensure that you have Java Development Kit (JDK) installed. Use the following command to compile the code:

   ```sh
   javac -d bin src/main/java/com/example/virtualclassroom/*.java src/main/java/com/example/virtualclassroom/commands/*.java src/main/java/com/example/virtualclassroom/exceptions/*.java src/main/java/com/example/virtualclassroom/entities/*.java

