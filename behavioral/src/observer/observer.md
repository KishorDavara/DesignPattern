The **Observer Design Pattern** is a **behavioral design pattern** where an object (called the **Subject**) maintains a list of dependents (**Observers**) and **automatically notifies them** of any state changes.

In short: **one-to-many dependency with automatic updates**.

---

## 📌 Intent

* Define a **subscription mechanism**
* Notify multiple objects when one object changes
* Promote **loose coupling** between objects

---

## 🧠 When to Use

* When changes in one object require updates to others
* When you want to avoid tight coupling between components
* Event-driven systems (UI, messaging, notifications)
* Publish–subscribe scenarios

---

## 🧩 Structure (UML)

![Image](https://upload.wikimedia.org/wikipedia/commons/thumb/a/a8/Observer_w_update.svg/500px-Observer_w_update.svg.png)

![Image](https://media.geeksforgeeks.org/wp-content/uploads/20240205163046/ObserverPatternExample.webp)

### Participants

1. **Subject** – maintains observers and notifies them
2. **Observer** – interface for receiving updates
3. **ConcreteSubject** – stores state
4. **ConcreteObserver** – reacts to changes

---

## 🔄 Push vs Pull Model

### Push Model

```java
observer.update(data);
```

✔ Subject sends data directly

### Pull Model

```java
observer.update();
observer.getState();
```

✔ Observer pulls data from subject

---

## 🆚 Observer vs Pub-Sub

| Observer                | Pub-Sub              |
| ----------------------- | -------------------- |
| Subject knows observers | Decoupled via broker |
| Tight relationship      | Loose relationship   |
| Simple                  | Scalable             |
| In-memory               | Distributed systems  |

---

## ☕ Java Built-in Observer (⚠ Deprecated)

```java
// java.util.Observer & Observable (Deprecated since Java 9)
```

❌ Not recommended
✔ Use **custom implementation**, **listeners**, or **Spring Events**

---

## 🌱 Observer Pattern in Spring Boot (Event-Based)

```java
@Component
public class OrderCreatedEventListener {

    @EventListener
    public void handleOrderCreated(OrderCreatedEvent event) {
        System.out.println("Order received: " + event.getOrderId());
    }
}
```

✔ Clean
✔ Decoupled
✔ Production-ready

---

## 👍 Advantages

* Loose coupling
* Supports Open/Closed Principle
* Dynamic subscription/unsubscription

---

## 👎 Disadvantages

* Unexpected updates
* Order of notifications not guaranteed
* Possible memory leaks if observers aren’t removed

---

## 🧠 Real-World Examples

* GUI event listeners
* Stock price updates
* News subscriptions
* Messaging systems
* Notification services

---

## 🔑 Key Difference from Strategy

| Strategy         | Observer         |
| ---------------- | ---------------- |
| Chooses behavior | Reacts to change |
| One-to-one       | One-to-many      |
| Algorithm-based  | Event-based      |

---