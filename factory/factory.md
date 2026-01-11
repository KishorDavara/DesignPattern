The **Factory Design Pattern** in Java is a **creational pattern** that provides an **interface for creating objects**, but lets subclasses or a separate factory class decide **which concrete class to instantiate**.

In simple terms:
👉 *You ask a factory for an object instead of creating it directly with `new`.*

---

## Why use the Factory Pattern?

It helps you:

* ✅ **Decouple object creation from usage**
* ✅ **Follow Open/Closed Principle** (add new types without modifying existing code)
* ✅ **Centralize object creation logic**
* ✅ **Improve maintainability and testability**

---

## Basic Problem (Without Factory)

```java
import simple.CreditCardPayment;
import simple.PaypalPayment;

public class PaymentService {
    public void pay(String type) {
        if (type.equals("CREDIT")) {
            CreditCardPayment payment = new CreditCardPayment();
            payment.process();
        } else if (type.equals("PAYPAL")) {
            PaypalPayment payment = new PaypalPayment();
            payment.process();
        }
    }
}
```

❌ Problems:

* Tight coupling
* Hard to add new payment types
* Violates Open/Closed Principle

---


## Factory Pattern Variants

### 1. Simple Factory (Most Common)

* One factory class
* Static method
* Easy to understand
* ❌ Not a GoF pattern officially, but widely used

---

### 2. Factory Method Pattern (GoF)

Instead of a single factory class, **subclasses decide what to create**.

```java
import simple.Payment;

public abstract class PaymentCreator {
    public abstract Payment createPayment();
}
```

```java
import simple.CreditCardPayment;
import simple.Payment;

public class CreditPaymentCreator extends PaymentCreator {
    @Override
    public Payment createPayment() {
        return new CreditCardPayment();
    }
}
```

✅ Useful when creation logic varies by subclass

---

### 3. Abstract Factory Pattern

Creates **families of related objects**.

Example:

* UI Toolkit Factory → `Button`, `Checkbox`
* OS Factory → Windows / Mac components

---

## When Should You Use Factory Pattern?

Use it when:

* Object creation is **complex**
* You need to **switch implementations at runtime**
* You want to **hide instantiation logic**
* You expect **frequent additions of new types**

---

## Real-World Java Examples

* `java.util.Calendar.getInstance()`
* `java.sql.DriverManager.getConnection()`
* `Spring BeanFactory / ApplicationContext`

---

## Key Takeaways

* Factory pattern **encapsulates object creation**
* Promotes **loose coupling**
* Makes code **scalable and maintainable**
* Widely used in **Spring, Hibernate, and Java frameworks**