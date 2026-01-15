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