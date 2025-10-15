# JavaScript — Reference Variables vs Actual Values
> Not only for Javascript this is a common methodology used in many languages including Java!

## 🔹 1. Introduction
In JavaScript, **variables** can store two kinds of data:
- **Primitive values** → directly stored in memory.
- **Reference values** → stored as a reference (address pointing to the actual data in memory).

Understanding this difference is very important because it affects how **data is copied and modified** in your programs.

---

## 🔸 2. Primitive Data Types (Actual / Value Types)

Primitive data types **store actual values directly** in the variable’s memory space.

### 🧩 Primitive Types:
- `Number`
- `String`
- `Boolean`
- `Null`
- `Undefined`
- `Symbol`
- `BigInt`

### 💻 Example:
```js
let a = 10;
let b = a; // Value of 'a' is copied to 'b'

b = 20; // Changing 'b' does not affect 'a'

console.log(a); // 10
console.log(b); // 20
```

### 💡 Explanation:
- `a` holds the actual value `10`.
- When you assign `a` to `b`, JavaScript **copies the value**.
- Changing `b` doesn’t affect `a` because they’re **stored separately**.

📦 **In Memory:**

| Variable | Stored Value |
|-----------|--------------|
| a         | 10           |
| b         | 20           |

✅ Each variable has **its own separate memory space**.

---

## 🔸 3. Non-Primitive Data Types (Reference Types)

Non-primitive types (like **arrays** and **objects**) are stored as **references**.

When you assign one object or array to another variable, **only the reference (memory address)** is copied — not the actual data.

### 💻 Example (Array):
```js
const teas = ['green tea', 'oolong tea', 'chai'];
let popularTeas = teas; // Reference copy

popularTeas.pop(); // Removes last element

console.log(teas);        // ['green tea', 'oolong tea']
console.log(popularTeas); // ['green tea', 'oolong tea']
```

### 💡 Explanation:
- Both `teas` and `popularTeas` point to the **same memory location**.
- Any modification to one will reflect in the other.

📦 **In Memory:**

| Variable     | Memory Address | Value (Stored at Address)        |
|---------------|----------------|----------------------------------|
| teas          | 0x100          | → ['green tea', 'oolong tea']   |
| popularTeas   | 0x100          | → ['green tea', 'oolong tea']   |

➡️ Both share the **same reference (0x100)**.

---

## 🔹 4. Creating a True Copy (Hard Copy)

If you want to create a **new, independent array or object**, you must make a **hard copy**.

### ✅ Using Spread Operator:
```js
let hardCopyTeas = [...teas];
hardCopyTeas.push('black tea');

console.log(teas);         // ['green tea', 'oolong tea']
console.log(hardCopyTeas); // ['green tea', 'oolong tea', 'black tea']
```

### ✅ Using `slice()`:
```js
let anotherCopy = teas.slice();
```

### ✅ Using `Array.from()`:
```js
let copyArray = Array.from(teas);
```

Now, both arrays are stored in **different memory locations**, so changing one will not affect the other.

---

## 🔸 5. Example with Objects
Objects behave the same way as arrays — they’re also **reference types**.

### 💻 Example:
```js
const user = { name: 'Beniel', age: 20 };
let copyUser = user; // Reference copy

copyUser.age = 25;

console.log(user.age); // 25 (also changed)
```

### ✅ Hard Copy (Independent Object):
```js
let realCopy = { ...user };
realCopy.age = 30;

console.log(user.age);     // 25
console.log(realCopy.age); // 30
```

🧠 Now `user` and `realCopy` are **completely separate objects**.

---

## 🧩 6. Quick Comparison Table

| Type              | Stored As      | Copy Behavior          | Example Type     |
|-------------------|----------------|------------------------|------------------|
| **Primitive**     | Actual value   | Value copied           | `let x = 5`      |
| **Reference**     | Memory address | Reference copied       | `let arr = []`   |

---

## 🔹 7. Visual Comparison

### 🧱 Primitive Type (Different Boxes)
```
a ──► [10]
b ──► [10]   (separate copy)
```

### 🧩 Reference Type (Shared Box)
```
teas ──► [ 'green tea', 'oolong tea', 'chai' ]
             ▲
             │ (same memory reference)
             ▼
popularTeas ─┘
```

---

## 💬 8. Summary

| Concept | Primitive | Reference |
|----------|------------|------------|
| Stores | Actual value | Memory address |
| Copies | New value | Same reference |
| Change effect | Independent | Shared between variables |
| Example types | `number`, `string`, `boolean` | `array`, `object`, `function` |
| Copy method | Simple assignment | Spread, slice, Array.from, Object.assign |

---

## ✅ 9. Example Recap

```js
// Primitive (Value Copy)
let a = 5;
let b = a;
b = 10;
console.log(a); // 5 (no change)
console.log(b); // 10

// Reference (Same Memory)
let arr1 = [1, 2, 3];
let arr2 = arr1;
arr2.push(4);
console.log(arr1); // [1, 2, 3, 4]
console.log(arr2); // [1, 2, 3, 4]

// Hard Copy (Independent)
let arr3 = [...arr1];
arr3.push(5);
console.log(arr1); // [1, 2, 3, 4]
console.log(arr3); // [1, 2, 3, 4, 5]
```

---

## 🧾 10. Final Takeaway

> - **Primitive types** store and copy the actual value.  
> - **Reference types** store and copy a reference (memory address).  
> - To avoid unwanted changes, always make a **hard copy** of arrays or objects before modifying them.

---

### ✨ Quick Tip:
Always use the spread operator (`...`) for safe copying:
```js
let safeArray = [...originalArray];
let safeObject = { ...originalObject };
```

---

📚 **End of Notes**
