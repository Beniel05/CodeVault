// This one entire code file has been taken from Chatgpt - to take NOTES or last min preparations 

/*
🔹 Scope → Decides where a variable is accessible.
🔹 Closure → Lets an inner function remember variables from its parent function even after it finishes.
*/

// ---------------- Example 1: Scope + Closure ----------------

let globalTea = "Lemon Tea"; // 🌍 Global Scope

function outerFunction() {
  let localTea = "Green Tea"; // Function (local) Scope

  // 🔒 Inner function forms a closure
  return function innerFunction() {
    console.log(globalTea); // ✅ Accessible due to scope
    console.log(localTea);  // ✅ Accessible due to closure
  };
}

let teaMaker = outerFunction(); 
teaMaker(); // innerFunction remembers 'localTea' even after outerFunction ends




// ---------------- Example 2: Closure with Parameters ----------------

function createTeaMaker(name) {
  let score = 100; // Remembered by the closure

  return function (teaType) {
    // Inner function uses variables from both its own and outer scopes
    return `Making ${teaType} ${name} ${score}`;
  }; 
}

let teaMaker1 = createTeaMaker("Beniel");
let result = teaMaker1("green tea");
console.log(result); // Output: Making green tea Beniel 100




// ---------------- Example 3: Closure Maintaining State ----------------

function outer() {
  let count = 0; // Private variable for the closure

  return function inner() {
    count++; // Inner function modifies remembered variable
    console.log(count);
  };
}

const counter = outer();
counter(); // 1
counter(); // 2

/*
🧠 Summary:
- Scope: Defines accessibility.
- Closure: Keeps data alive inside returned inner functions.
*/
