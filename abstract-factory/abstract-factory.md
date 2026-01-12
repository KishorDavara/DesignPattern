The **Abstract Factory Design Pattern** is a **creational GoF pattern** that provides an **interface for creating families of related or dependent objects** **without specifying their concrete classes**.

In short:
👉 *A factory of factories.*

---

## 🎯 Intent (GoF Definition)

> Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

---

## 🧠 When to Use Abstract Factory

Use it when:

* You need to create **groups of related objects**
* You want to **ensure compatibility** between products
* You want to **switch entire families** of objects at runtime
* You want to follow **Open/Closed Principle**

---

## 🧩 Classic Example: GUI Toolkit

* **Windows UI** → `WindowsButton`, `WindowsCheckbox`
* **Mac UI** → `MacButton`, `MacCheckbox`

---

## 📦 Full Java Implementation (Complete & Runnable)

---

### 1️⃣ Abstract Products

```java
public interface Button {
    void paint();
}
```

```java
public interface Checkbox {
    void paint();
}
```

---

### 2️⃣ Concrete Products (Windows Family)

```java
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering Windows Button");
    }
}
```

```java
public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering Windows Checkbox");
    }
}
```

---

### 3️⃣ Concrete Products (Mac Family)

```java
public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering Mac Button");
    }
}
```

```java
public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering Mac Checkbox");
    }
}
```

---

### 4️⃣ Abstract Factory

```java
public interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
```

---

### 5️⃣ Concrete Factories

```java
public class WindowsUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
```

```java
public class MacUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
```

---

### 6️⃣ Client Code

```java
public class Application {

    private final Button button;
    private final Checkbox checkbox;

    public Application(UIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

    public static void main(String[] args) {

        UIFactory factory;

        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            factory = new WindowsUIFactory();
        } else {
            factory = new MacUIFactory();
        }

        Application app = new Application(factory);
        app.paint();
    }
}
```

---

## 🔄 Execution Flow

```
Client → AbstractFactory → ConcreteFactory
                ↓
        Creates Product Family
        (Button + Checkbox)
```

---

## 🧠 Key Differences: Factory Method vs Abstract Factory

| Feature      | Factory Method    | Abstract Factory                    |
| ------------ | ----------------- | ----------------------------------- |
| Creates      | One product       | Families of products                |
| Uses         | Inheritance       | Composition                         |
| Pattern Type | Creational        | Creational                          |
| Example      | `createPayment()` | `createButton() + createCheckbox()` |

---

## 📌 Real-World Java Examples

* `javax.xml.parsers.DocumentBuilderFactory`
* `javax.xml.transform.TransformerFactory`
* Spring’s `AbstractFactoryBean`
* JDBC driver families

---

## ⚠ Common Mistakes

* ❌ Using Abstract Factory when only **one object** is created
* ❌ Mixing product families (WindowsButton + MacCheckbox)
* ❌ Adding too many products (pattern becomes heavy)

---

## ✔ Summary

* Abstract Factory creates **families of related objects**
* Enforces **product compatibility**
* Makes systems **scalable and flexible**
* Common in **frameworks & cross-platform apps**


# 1️⃣ UML Diagram – Abstract Factory Pattern

```
          ┌──────────────────────┐
          │     UIFactory        │  «interface»
          │──────────────────────│
          │ + createButton()     │
          │ + createCheckbox()   │
          └─────────▲────────────┘
                    │
      ┌─────────────┴─────────────┐
      │                           │
┌───────────────┐        ┌───────────────┐
│ WindowsFactory│        │   MacFactory  │
│───────────────│        │───────────────│
│ +createButton │        │ +createButton │
│ +createCheckbox│       │ +createCheckbox│
└───────▲───────┘        └───────▲───────┘
        │                         │
   ┌────┴────┐              ┌─────┴─────┐
   │ Button  │              │ Checkbox  │
   └────▲────┘              └─────▲─────┘
        │                         │
 ┌──────────────┐        ┌────────────────┐
 │WindowsButton │        │WindowsCheckbox │
 │MacButton     │        │MacCheckbox     │
 └──────────────┘        └────────────────┘
```

---

# 2️⃣ Real-World Spring Example (Very Important)

Spring uses **Abstract Factory heavily**.

---

### Spring Example: `BeanFactory`

```java
BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
MyService service = factory.getBean(MyService.class);
```

### Why this is Abstract Factory?

* `BeanFactory` / `ApplicationContext` = **Abstract Factory**
* XML / Java Config / Annotation Config = **Concrete Factories**
* Beans = **Product families**
* Spring decides **which beans belong together**

---

### Another Example: JDBC

```java
DocumentBuilderFactory factory =
        DocumentBuilderFactory.newInstance();

DocumentBuilder builder = factory.newDocumentBuilder();
```

* Factory creates **related XML parsers**
* Client doesn’t know concrete implementation

---

# 3️⃣ Interview Questions & Answers (Must Know)

---

### Q1: What problem does Abstract Factory solve?

**Answer:**
It solves the problem of creating **families of related objects** while ensuring **compatibility** and **loose coupling**.

---

### Q2: Difference between Factory Method and Abstract Factory?

**Answer:**

* Factory Method → creates **one product**
* Abstract Factory → creates **families of products**

---

### Q3: Is Abstract Factory better than Factory Method?

**Answer:**
No. It depends on use case.

* Use Factory Method for **single object creation**
* Use Abstract Factory for **related object groups**

---

### Q4: What is the biggest disadvantage?

**Answer:**

* Hard to add **new product types**
* Every factory must be changed

---

### Q5: Where is it used in real projects?

**Answer:**

* Spring Framework
* JDBC drivers
* Cross-platform UI toolkits
* XML/JSON parsers

---

# 4️⃣ Abstract Factory vs Builder Pattern

| Feature | Abstract Factory         | Builder                   |
| ------- | ------------------------ | ------------------------- |
| Purpose | Create object families   | Build complex objects     |
| Focus   | **What** to create       | **How** to create         |
| Objects | Multiple related objects | Single complex object     |
| Uses    | Interfaces               | Step-by-step construction |
| Example | UI Toolkit               | Creating a House          |

---

### Builder Example (Contrast)

```java
House house = new HouseBuilder()
        .addWalls()
        .addRoof()
        .addGarage()
        .build();
```

* Builder → controls **construction steps**
* Abstract Factory → controls **object families**

---

## 🧠 Memory Trick (Interview Gold)

* **Factory Method** → One product
* **Abstract Factory** → Product families
* **Builder** → Step-by-step construction
* **Prototype** → Clone objects

---

## ✅ Final Summary

✔ Abstract Factory = factory of factories
✔ Ensures compatibility between products
✔ Widely used in frameworks
✔ Best for platform-specific or theme-based systems
