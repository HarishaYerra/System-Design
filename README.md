Design Patterns in Java – Pizza Example

This repository demonstrates 23 GoF Design Patterns implemented in Java using simple Pizza/Order examples.
The goal is to learn patterns in a practical way that’s easy to connect with real-world scenarios.

📖 What are Design Patterns?

Design patterns are proven solutions to common software design problems.
They provide a reusable template for solving recurring challenges in object-oriented design.

1️⃣ Creational Patterns

These deal with object creation mechanisms.

✅ Factory Method

Concept: Define an interface for creating an object, but let subclasses decide which class to instantiate.

Analogy: Pizza Store → Customer orders "Veg Pizza" or "Cheese Pizza".

Java Example: PizzaFactory creates different pizzas.

Use Case: When you don’t know which class object you’ll need at runtime.

✅ Abstract Factory

Concept: Provides an interface for creating families of related objects without specifying their concrete classes.

Analogy: Italian Pizza Factory vs Indian Pizza Factory (each provides Veg & Non-Veg pizzas).

Use Case: When you need to create related objects that should be used together.

✅ Singleton

Concept: Ensure only one instance of a class exists in the application.

Analogy: Only one Pizza Oven in the kitchen.

Java Example: PizzaOven.getInstance()

Use Case: Database connections, config managers, logging.

✅ Builder

Concept: Separates construction of a complex object from its representation.

Analogy: PizzaBuilder → Step by step add base, cheese, toppings.

Use Case: When object has many optional configurations.

✅ Prototype

Concept: Clone existing objects instead of creating new ones.

Analogy: Copy an existing Pizza order as a template for another.

Use Case: Performance optimization, cloning large objects.

2️⃣ Structural Patterns

These deal with class and object composition.

✅ Adapter

Concept: Converts one interface into another.

Analogy: Pizza Cutter adapter lets you cut with a knife API.

Use Case: When integrating incompatible systems.

✅ Bridge

Concept: Decouple abstraction from implementation.

Analogy: Pizza order abstraction (Veg/Non-Veg) + Payment Implementation (Cash/Card).

Use Case: When you want flexibility in abstraction & implementation independently.

✅ Composite

Concept: Compose objects into tree structures.

Analogy: Menu → MenuItem (Veg Pizza, Cheese Pizza) & MenuCategory (Beverages).

Use Case: Represent part-whole hierarchies.

✅ Decorator

Concept: Add new functionality to objects dynamically.

Analogy: Add Extra Cheese, Olives, or Mushrooms to Pizza.

Use Case: When you need flexible object behavior extension.

✅ Facade

Concept: Provide a simplified interface to complex subsystems.

Analogy: PizzaOrderFacade handles Order, Payment, Delivery behind the scenes.

Use Case: Simplify complex APIs (Spring Facade, Hibernate).

✅ Flyweight

Concept: Reuse shared objects to save memory.

Analogy: Pizza toppings (Cheese, Olives) reused across many pizzas.

Use Case: Large number of similar objects (text editors, game sprites).

✅ Proxy

Concept: Provide a surrogate for another object to control access.

Analogy: Pizza Delivery Boy is a proxy for the Pizza Store.

Use Case: Security, lazy loading, remote proxy.

3️⃣ Behavioral Patterns

These deal with object interaction & responsibility delegation.

✅ Chain of Responsibility

Concept: Pass request along a chain of handlers.

Analogy: Waiter → Cashier → Chef handle parts of pizza order.

Use Case: Logging frameworks, request validation.

✅ Command

Concept: Encapsulate a request as an object.

Analogy: Pizza Order command executed by Chef.

Use Case: Undo/Redo operations, task scheduling.

✅ Interpreter

Concept: Define grammar for language and interpret expressions.

Analogy: "Order Veg Pizza AND Coke".

Use Case: SQL parsing, expression evaluation.

✅ Strategy

Concept: Define a family of algorithms, encapsulate each, and make them interchangeable.

Analogy: Payment Strategy → Cash, Card, UPI.

Use Case: Sorting algorithms, payment gateways.

✅ Observer

Concept: One-to-many dependency between objects.

Analogy: Customers (observers) get notified when Pizza is ready.

Use Case: Event systems, Spring ApplicationEvents.

✅ State

Concept: Object behavior changes based on its internal state.

Analogy: Pizza order → Ordered, Baking, Delivered.

Use Case: Workflow, vending machines.

✅ Mediator

Concept: Define an object that encapsulates communication between objects.

Analogy: Pizza Shop Chat Room (Mediator) between Customer, Waiter, Chef.

Use Case: Chat apps, air traffic control systems.

✅ Memento

Concept: Capture and restore object’s state.

Analogy: Save Pizza order draft & restore later.

Use Case: Undo functionality in editors.

✅ Template Method

Concept: Define algorithm skeleton in base class, let subclasses fill steps.

Analogy: Pizza order process → Select Item, Pay, Deliver.

Use Case: Framework hooks, servlet lifecycle, Spring templates.

🚀 How to Run

Clone repo

git clone https://github.com/your-username/design-patterns-pizza.git
cd design-patterns-pizza


Import into Eclipse/IntelliJ

Run individual Demo.java files inside each pattern package

📌 Why Pizza Example?

Pizza ordering is a common real-world analogy. Each design pattern is connected with:

Pizza creation (Creational)

Pizza structure (Structural)

Pizza ordering & delivery process (Behavioral)
