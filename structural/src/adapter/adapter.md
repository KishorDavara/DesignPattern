The **Adapter Design Pattern** is a **structural design pattern** that allows **incompatible interfaces to work together** by converting one interface into another expected by the client.

In short: **Adapter = translator between two incompatible systems**.

---

## 📌 Intent

* Convert one interface into another
* Enable reuse of existing or legacy code
* Promote loose coupling

---

## 🧠 When to Use

* Integrating legacy systems
* Working with third-party libraries
* When you cannot change existing classes
* API / DTO transformations

---

## 🧩 Structure (UML)

![Image](https://media.geeksforgeeks.org/wp-content/uploads/20250905161148734950/Adapter-Design-Pattern.webp)

![Image](https://www.digitalocean.com/api/static-content/v1/images?src=https%3A%2F%2Fjournaldev.nyc3.cdn.digitaloceanspaces.com%2F2013%2F07%2Fadapter-pattern-java-class-diagram.png\&width=1920)

### Participants

1. **Target** – interface expected by the client
2. **Adaptee** – existing incompatible class
3. **Adapter** – converts Adaptee to Target
4. **Client** – uses Target interface

---


## 🆚 Adapter vs Decorator vs Proxy

| Pattern   | Purpose           |
| --------- | ----------------- |
| Adapter   | Convert interface |
| Decorator | Add behavior      |
| Proxy     | Control access    |

---

## 🌱 Adapter in Spring / Enterprise Java

### Example: DTO Adapter

```java
public class UserAdapter {

    public static UserDto toDto(UserEntity entity) {
        return new UserDto(entity.getId(), entity.getName());
    }
}
```

✔ Common in REST APIs
✔ Clean separation between layers

---

## ☕ Adapter in Java Standard Library

* `Arrays.asList()`
* `InputStreamReader`
* `OutputStreamWriter`
* JDBC Drivers

---

## 👍 Advantages

* Enables reuse of existing code
* Improves maintainability
* Supports Open/Closed Principle

---

## 👎 Disadvantages

* Extra abstraction layer
* Can increase complexity if overused

---

## 🧠 Key Rule

✔ Adapter **changes interface**, not behavior

---

## 🔑 Key Takeaway

> **Adapter makes two incompatible interfaces compatible — without changing either.**

---