Below is the **FULL & COMPLETE guide to ALL design patterns** — **all 23 GoF patterns**, with **purpose, intent, and quick Java-style examples**, structured for **learning + interviews**.

---

# 🧩 ALL Design Patterns (Complete – GoF)

![Image](https://miro.medium.com/1%2AhUgnjieqv0pGWj63JPYolQ.png)

![Image](https://miro.medium.com/1%2AxYqVG2heQBh9u_wPKp9NYw.png)

![Image](https://dz2cdn1.dzone.com/storage/temp/13417576-1588997702443.png)

---

## 🔵 1️⃣ Creational Design Patterns (5)

👉 *How objects are created*

---

### 1. **Singleton**

**Intent:** Ensure only one instance exists
**Use when:** Global shared resource

```java
class Singleton {
    private static final Singleton INSTANCE = new Singleton();
    private Singleton() {}
    public static Singleton getInstance() { return INSTANCE; }
}
```

---

### 2. **Factory Method**

**Intent:** Let subclasses decide object creation
**Use when:** One product, many implementations

```java
abstract class Creator {
    abstract Product create();
}
```

---

### 3. **Abstract Factory**

**Intent:** Create families of related objects
**Use when:** Product compatibility matters

```java
interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
```

---

### 4. **Builder**

**Intent:** Build complex objects step by step
**Use when:** Many optional fields

```java
House house = new House.Builder().garage(true).build();
```

---

### 5. **Prototype**

**Intent:** Create objects by cloning
**Use when:** Object creation is expensive

```java
class Shape implements Cloneable {
    public Shape clone() throws CloneNotSupportedException {
        return (Shape) super.clone();
    }
}
```

---

## 🟢 2️⃣ Structural Design Patterns (7)

👉 *How objects are composed*

---

### 6. **Adapter**

**Intent:** Convert one interface into another
**Use when:** Integrating legacy code

```java
class Adapter implements Target {
    private Adaptee adaptee;
}
```

---

### 7. **Bridge**

**Intent:** Separate abstraction from implementation
**Use when:** Avoid class explosion

```java
interface Device {}
abstract class Remote { Device device; }
```

---

### 8. **Composite**

**Intent:** Treat individual and group objects uniformly
**Use when:** Tree structures

```java
interface Component {
    void operation();
}
```

---

### 9. **Decorator**

**Intent:** Add behavior dynamically
**Use when:** Avoid subclass explosion

```java
class CoffeeDecorator implements Coffee {
    protected Coffee coffee;
}
```

---

### 10. **Facade**

**Intent:** Provide a simplified interface
**Use when:** Hide system complexity

```java
class PaymentFacade {
    void pay() { /* multiple subsystems */ }
}
```

---

### 11. **Flyweight**

**Intent:** Reduce memory usage by sharing objects
**Use when:** Large number of similar objects

```java
Map<String, Shape> cache = new HashMap<>();
```

---

### 12. **Proxy**

**Intent:** Control access to an object
**Use when:** Lazy loading, security

```java
class Proxy implements Service {
    private RealService service;
}
```

---

## 🟠 3️⃣ Behavioral Design Patterns (11)

👉 *How objects communicate*

---

### 13. **Chain of Responsibility**

**Intent:** Pass request along handlers
**Use when:** Multiple processors

```java
abstract class Handler {
    Handler next;
}
```

---

### 14. **Command**

**Intent:** Encapsulate request as object
**Use when:** Undo/Redo, queues

```java
interface Command {
    void execute();
}
```

---

### 15. **Interpreter**

**Intent:** Interpret grammar or language
**Use when:** DSLs

```java
interface Expression {
    int interpret();
}
```

---

### 16. **Iterator**

**Intent:** Traverse collection without exposing internals
**Use when:** Uniform iteration

```java
Iterator<String> it = list.iterator();
```

---

### 17. **Mediator**

**Intent:** Centralize communication
**Use when:** Reduce object coupling

```java
interface Mediator {
    void notify(Component c);
}
```

---

### 18. **Memento**

**Intent:** Capture and restore object state
**Use when:** Undo functionality

```java
class Memento {
    private final State state;
}
```

---

### 19. **Observer**

**Intent:** One-to-many notification
**Use when:** Event-driven systems

```java
interface Observer {
    void update();
}
```

---

### 20. **State**

**Intent:** Change behavior when state changes
**Use when:** Replace large conditionals

```java
interface State {
    void handle();
}
```

---

### 21. **Strategy**

**Intent:** Switch algorithms at runtime
**Use when:** Multiple algorithms

```java
interface Strategy {
    void execute();
}
```

---

### 22. **Template Method**

**Intent:** Define algorithm skeleton
**Use when:** Common workflow

```java
abstract class Template {
    final void run() {
        step1();
        step2();
    }
}
```

---

### 23. **Visitor**

**Intent:** Add operations without modifying classes
**Use when:** Stable object structure

```java
interface Visitor {
    void visit(Element e);
}
```

---

## 📊 COMPLETE SUMMARY TABLE

| Category   | Patterns                                                                                               |
| ---------- | ------------------------------------------------------------------------------------------------------ |
| Creational | Singleton, Factory Method, Abstract Factory, Builder, Prototype                                        |
| Structural | Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy                                        |
| Behavioral | Chain, Command, Interpreter, Iterator, Mediator, Memento, Observer, State, Strategy, Template, Visitor |

---

## 🧠 INTERVIEW MEMORY TRICK

* **Creational** → *How objects are created*
* **Structural** → *How objects are composed*
* **Behavioral** → *How objects interact*

---

## 🔥 MOST IMPORTANT FOR JAVA / SPRING

✅ Singleton
✅ Factory / Abstract Factory
✅ Builder
✅ Proxy
✅ Decorator
✅ Strategy
✅ Observer

---

Below is a **practical, industry-focused list of the MOST USED Design Patterns**, especially relevant for **Java, Spring, backend, and interview preparation**.

I’ve grouped them by **category**, ranked by **real-world usage**, and added **when you should use each**.

---

## 🔥 TOP 10 MOST USED DESIGN PATTERNS (Overall)

1. **Singleton**
2. **Factory Method**
3. **Strategy**
4. **Observer**
5. **Builder**
6. **Decorator**
7. **Adapter**
8. **Proxy**
9. **Facade**
10. **Template Method**

👉 If you master these 10, you cover **80–90% of real-world use cases**.

---

## 🧱 CREATIONAL PATTERNS (Object Creation)

![Image](https://www.tutorialspoint.com/design_pattern/images/singleton_pattern_uml_diagram.jpg)

![Image](https://upload.wikimedia.org/wikipedia/commons/4/43/W3sDesign_Factory_Method_Design_Pattern_UML.jpg)

![Image](https://media.geeksforgeeks.org/wp-content/uploads/20240206185827/UML-Class-Diagram-for-Builder-Design-Pattern.webp)

### 1️⃣ Singleton

**Most used pattern ever**

📌 Use when:

* Only **one instance** should exist
* Shared resources (config, cache, logger)

✔ Examples:

* Spring Beans (default scope)
* Logger
* Configuration classes

---

### 2️⃣ Factory Method

📌 Use when:

* Object creation logic should be hidden
* You want loose coupling

✔ Examples:

* `BeanFactory`
* `ShapeFactory`
* Payment object creation

---

### 3️⃣ Builder

📌 Use when:

* Object has many optional fields
* You want readable object creation

✔ Examples:

* `StringBuilder`
* Lombok `@Builder`
* Immutable objects

---

## 🧩 STRUCTURAL PATTERNS (Object Composition)

![Image](https://www.tutorialspoint.com/design_pattern/images/decorator_pattern_uml_diagram.jpg)

![Image](https://media.geeksforgeeks.org/wp-content/uploads/20250905161148734950/Adapter-Design-Pattern.webp)

![Image](https://upload.wikimedia.org/wikipedia/commons/6/6e/W3sDesign_Proxy_Design_Pattern_UML.jpg)

![Image](https://www.tutorialspoint.com/design_pattern/images/proxy_pattern_uml_diagram.jpg)

### 4️⃣ Decorator

📌 Use when:

* Add behavior **dynamically**
* Avoid subclass explosion

✔ Examples:

* Java I/O streams
* Spring filters
* Feature toggles

---

### 5️⃣ Adapter

📌 Use when:

* Integrating incompatible interfaces

✔ Examples:

* Legacy system integration
* API wrappers
* DTO adapters

---

### 6️⃣ Proxy

📌 Use when:

* Control access
* Lazy loading
* Add logging, security

✔ Examples:

* Spring AOP
* Hibernate lazy loading
* API gateway

---

### 7️⃣ Facade

📌 Use when:

* Simplify complex subsystems

✔ Examples:

* Service layer
* Library wrappers
* SDK APIs

---

## 🔄 BEHAVIORAL PATTERNS (Communication & Behavior)

![Image](https://upload.wikimedia.org/wikipedia/commons/3/39/Strategy_Pattern_in_UML.png)

![Image](https://upload.wikimedia.org/wikipedia/commons/thumb/a/a8/Observer_w_update.svg/500px-Observer_w_update.svg.png)

![Image](https://media.geeksforgeeks.org/wp-content/uploads/20240213124632/TemplateMethodComponent-%281%29.webp)

![Image](https://reactiveprogramming.io/_next/image?q=75\&url=%2Fbooks%2Fpatterns%2Fimg%2Fpatterns-articles%2Ftemplete-method-diagram.png\&w=3840)

### 8️⃣ Strategy

📌 Use when:

* Multiple algorithms
* Runtime behavior switching

✔ Examples:

* Payment methods
* Sorting
* Discount logic

---

### 9️⃣ Observer

📌 Use when:

* One-to-many notifications
* Event-driven systems

✔ Examples:

* Spring Events
* Message listeners
* UI listeners

---

### 🔟 Template Method

📌 Use when:

* Algorithm skeleton is fixed
* Steps vary

✔ Examples:

* Spring JDBC templates
* Workflow processing

---

## 📊 MOST USED IN SPRING / ENTERPRISE JAVA

| Pattern   | Usage |
| --------- | ----- |
| Singleton | ⭐⭐⭐⭐⭐ |
| Factory   | ⭐⭐⭐⭐⭐ |
| Proxy     | ⭐⭐⭐⭐⭐ |
| Strategy  | ⭐⭐⭐⭐  |
| Observer  | ⭐⭐⭐⭐  |
| Decorator | ⭐⭐⭐⭐  |
| Facade    | ⭐⭐⭐⭐  |
| Builder   | ⭐⭐⭐   |

---

## 🎯 MOST IMPORTANT FOR INTERVIEWS

**Must-know (No excuse):**

* Singleton
* Factory
* Strategy
* Observer
* Decorator
* Proxy

**Good to know:**

* Adapter
* Facade
* Template Method
* Chain of Responsibility

---

## 🧠 Quick Decision Guide

| If you need to…            | Use       |
| -------------------------- | --------- |
| Ensure one instance        | Singleton |
| Create objects flexibly    | Factory   |
| Change behavior at runtime | Strategy  |
| Notify many objects        | Observer  |
| Add features dynamically   | Decorator |
| Control access             | Proxy     |
| Simplify complexity        | Facade    |
| Build complex objects      | Builder   |

---

## 🚀 How to Learn Effectively

1. Learn **intent**
2. Learn **UML**
3. Code **one real example**
4. Map it to **Spring usage**
5. Practice **interview questions**

---