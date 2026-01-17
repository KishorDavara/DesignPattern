The **Proxy Design Pattern** is a **structural design pattern** that provides a **surrogate or placeholder** for another object to control access to it.

In short: **the proxy controls how and when the real object is accessed**.

---

## 📌 Intent

* Control access to an object
* Add behavior **without changing the real object**
* Support lazy loading, security, logging, caching

---

## 🧠 When to Use

* Object creation is expensive
* Access control is required
* Remote objects (network calls)
* Add cross-cutting concerns transparently

---

## 🧩 Structure (UML)

![Image](https://www.tutorialspoint.com/design_pattern/images/proxy_pattern_uml_diagram.jpg)

![Image](https://media.geeksforgeeks.org/wp-content/uploads/20240205165856/proxypatternclassdiagram.webp)

### Participants

1. **Subject** – common interface
2. **RealSubject** – actual object
3. **Proxy** – controls access to RealSubject
4. **Client** – interacts with Proxy

---

## 🧠 Types of Proxy (Very Important)

| Proxy Type           | Purpose        | Example            |
| -------------------- | -------------- | ------------------ |
| **Virtual Proxy**    | Lazy loading   | Large image        |
| **Protection Proxy** | Access control | Security           |
| **Remote Proxy**     | Remote objects | RMI                |
| **Caching Proxy**    | Cache results  | DB / API           |
| **Logging Proxy**    | Log access     | Audit              |
| **Smart Proxy**      | Extra logic    | Reference counting |

---


## ☕ Proxy Using Java Dynamic Proxy (Advanced)

```java
InvocationHandler handler = (proxy, method, args) -> {
    System.out.println("Before method");
    Object result = method.invoke(realObject, args);
    System.out.println("After method");
    return result;
};

MyInterface proxy = (MyInterface) Proxy.newProxyInstance(
        MyInterface.class.getClassLoader(),
        new Class[]{MyInterface.class},
        handler
);
```

✔ Used by **Spring AOP**, **Hibernate**, **Security**

---

## 🆚 Proxy vs Decorator vs Adapter

| Pattern   | Purpose              |
| --------- | -------------------- |
| Proxy     | Control access       |
| Decorator | Add behavior         |
| Adapter   | Interface conversion |

---

## 👍 Advantages

* Transparent access control
* Lazy initialization
* Separation of concerns
* No change to client code

---

## 👎 Disadvantages

* Extra layer of indirection
* Slight performance overhead
* Increased complexity

---

## 🌍 Real-World Examples

* Spring AOP proxies
* Hibernate lazy loading
* Security checks
* API gateways
* Caching layers

---

## 🔑 Key Takeaway

> **Proxy controls access; it doesn’t change behavior — it governs it.**

---