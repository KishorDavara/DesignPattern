The **Decorator Design Pattern** is a **structural design pattern** that lets you **dynamically add new behavior** to an object **without modifying its existing code**.

In short: **wrap an object to extend its functionality**.

---

## 📌 Intent

* Add responsibilities to objects at runtime
* Avoid subclass explosion
* Follow **Open/Closed Principle**

---

## 🧠 When to Use

* You want to add features dynamically
* Inheritance would create too many subclasses
* You want flexible combinations of behaviors

---

## 🧩 Structure (UML)

![Image](https://media.geeksforgeeks.org/wp-content/uploads/20240405114106/Decoratorpatternclassdiagram.jpg)

![Image](https://journaldev.nyc3.cdn.digitaloceanspaces.com/2013/07/decorator-pattern.png)

### Participants

1. **Component** – common interface
2. **ConcreteComponent** – base object
3. **Decorator** – abstract wrapper
4. **ConcreteDecorator** – adds behavior

---

## 🆚 Decorator vs Inheritance

| Decorator             | Inheritance     |
| --------------------- | --------------- |
| Runtime behavior      | Compile-time    |
| Flexible combinations | Rigid           |
| No subclass explosion | Many subclasses |

---

## 🆚 Decorator vs Proxy

| Decorator           | Proxy             |
| ------------------- | ----------------- |
| Adds behavior       | Controls access   |
| Feature enhancement | Protection / Lazy |
| Multiple wrappers   | Usually single    |

---

## ☕ Decorator in Java IO (Real Example)

```java
InputStream in =
    new BufferedInputStream(
        new DataInputStream(
            new FileInputStream("file.txt")));
```

Each stream **decorates** the previous one.

---

## 🌱 Decorator in Spring (Conceptual)

* Spring Security filters
* Servlet filters
* AOP method interceptors

---

## 👍 Advantages

* Open/Closed Principle
* Runtime flexibility
* Clean alternative to inheritance

---

## 👎 Disadvantages

* Many small classes
* Harder to debug
* Order of decorators matters

---

## 🧠 Key Rules

✔ Same interface as component
✔ Uses composition
✔ Can stack multiple decorators

---

## 🔑 Key Takeaway

> **Decorator adds responsibilities dynamically, without changing existing code.**

---