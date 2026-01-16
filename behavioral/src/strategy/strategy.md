The **Strategy Design Pattern** is a **behavioral design pattern** that lets you define a family of algorithms, put each one in a separate class, and make them interchangeable at runtime.

In short: **behavior can be selected at runtime instead of being hard-coded**.

---

## 📌 Intent

* Encapsulate algorithms in separate classes
* Allow behavior to vary independently from clients that use it
* Favor **composition over inheritance**

---

## 🧠 When to Use

* You have multiple ways to perform an operation
* You want to avoid large `if-else` or `switch` statements
* You want to change behavior at runtime
* You want to follow the **Open/Closed Principle**

---

## 🧩 Structure

1. **Strategy (interface)** – declares the algorithm
2. **ConcreteStrategy** – implements different versions of the algorithm
3. **Context** – uses a Strategy and delegates the work to it

---

## 👍 Advantages

* Eliminates conditional logic
* Easy to add new strategies
* Promotes single responsibility
* Runtime flexibility

---

## 👎 Disadvantages

* Increased number of classes
* Clients must be aware of different strategies

---

## 🆚 Strategy vs Inheritance

| Strategy                | Inheritance           |
| ----------------------- | --------------------- |
| Runtime behavior change | Compile-time behavior |
| Composition             | Tight coupling        |
| Flexible                | Rigid                 |

---

## 📚 Real-World Examples

* Sorting algorithms (`Comparator`)
* Payment methods
* Compression strategies
* Authentication mechanisms

---
