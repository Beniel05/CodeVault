# Variable Naming in Java & JavaScript

---

## 📘 Rules for Naming Variables

1. Must start with a **letter**, `$`, or `_`.  
2. **Cannot start with a number.**  
3. **Cannot use reserved keywords** (like `class`, `for`, `if`, etc.).  
4. **Names are case-sensitive** — `age` ≠ `Age`.  
5. Should be **meaningful and readable**.

---

## 💡 Conventions / Best Practices

- **Camel Case** → `myVariableName` (common in both Java & JS).  
- **Constants** → Use uppercase with underscores: `MAX_SCORE`.  
- **Avoid single letters** unless used as loop counters (`i`, `j`).  
- `$` and `_` are **allowed**, but mostly used for special or internal variables.

---

>Java Examples

```java
int age = 25;                // normal variable
String firstName = "Beniel"; // camelCase
final int MAX_SCORE = 100;   // constant
int _temp = 10;              // starts with underscore (valid)
int $value = 50;             // starts with dollar sign (valid)
```

>Javascript Examples 

```Javascript
let age = 25;                  // normal variable
const firstName = "Beniel";    // constant with const
const MAX_SCORE = 100;         // constant uppercase
let _temp = 10;                // starts with underscore
let $value = 50;               // starts with dollar sign
```