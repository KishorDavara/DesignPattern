The **Prototype Design Pattern** is a **creational pattern** that lets you create new objects by **cloning existing ones**, rather than instantiating new objects from scratch.

It’s especially useful when:

* Object creation is **expensive or complex**
* You want to **avoid subclassing**
* You need many similar objects with slight variations

---

## 1. Intent

> **Create new objects by copying an existing object (the prototype).**

Instead of:

```java
new ComplexObject(...);
```

You do:

```java
prototype.clone();
```

---

## 2. Structure

**Key participants:**

1. **Prototype** – declares a cloning method
2. **ConcretePrototype** – implements cloning
3. **Client** – clones objects instead of creating them directly

---

## 3. Basic Java Example (Using `Cloneable`)

### Step 1: Prototype Interface

```java
public interface Prototype extends Cloneable {
    Prototype clone();
}
```

---

### Step 2: Concrete Prototype

```java
public class Employee implements Prototype {

    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public Employee clone() {
        try {
            return (Employee) super.clone(); // shallow copy
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', department='" + department + "'}";
    }
}
```

---

### Step 3: Client Code

```java
public class PrototypeDemo {
    public static void main(String[] args) {

        Employee original = new Employee("Alice", "Engineering");
        Employee copy = original.clone();

        System.out.println(original);
        System.out.println(copy);
    }
}
```

**Output:**

```
Employee{name='Alice', department='Engineering'}
Employee{name='Alice', department='Engineering'}
```

---

## 4. Deep Copy Example

If your object contains **mutable objects**, you need a **deep copy**.

```java
class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Person clone() {
        try {
            Person copy = (Person) super.clone();
            copy.address = new Address(this.address.city); // deep copy
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
```

---

## 5. Prototype Registry (Common Variant)

A **registry** stores reusable prototypes.

```java
import java.util.HashMap;
import java.util.Map;

class PrototypeRegistry {
    private static final Map<String, Prototype> registry = new HashMap<>();

    static {
        registry.put("dev", new Employee("Default Dev", "Engineering"));
        registry.put("hr", new Employee("Default HR", "Human Resources"));
    }

    public static Prototype getPrototype(String key) {
        return registry.get(key).clone();
    }
}
```

**Usage:**

```java
Employee emp = (Employee) PrototypeRegistry.getPrototype("dev");
```

---

## 6. Advantages

✔ Faster object creation
✔ Reduces subclassing
✔ Simplifies complex object creation
✔ Runtime flexibility

---

## 7. Disadvantages

✖ Cloning can be complex
✖ Deep copy is tricky
✖ `Cloneable` is considered poorly designed by many Java developers

---

## 8. Modern Java Alternative (Recommended)

Instead of `Cloneable`, use:

* **Copy constructors**
* **Factory methods**

```java
public Employee(Employee other) {
    this.name = other.name;
    this.department = other.department;
}
```

or

```java
public Employee copy() {
    return new Employee(this.name, this.department);
}
```

---

## 9. When to Use Prototype

✅ Creating many similar objects
✅ Object creation is costly
✅ Configuration-based object creation
❌ Simple objects with cheap constructors

---