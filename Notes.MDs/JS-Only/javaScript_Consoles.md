> I have also included the .js file in this folder! saved with .js <br/>
> If you want to see the outputs then use that .js file 

### Run it in browser 
> Open browser <br/>
> Right click - click Inspect - click console - paste the code - click enter <br/>

# 🖥️ Console Methods in JavaScript

The `console` object provides methods to display messages and debug information in the browser’s Developer Console.

---

## 🧩 Basic Logging

```js
console.log("Hello World");          // Prints a normal log message

console.info("Server started...");   // Prints an informational message

console.warn("Low battery!");        // Prints a warning message (yellow)

console.error("File not found!");    // Prints an error message (red)

console.debug("Debugging info");     // Prints debug info (visible in verbose mode)
```

## 🧾 Displaying Data

```js
console.table(["HTML", "CSS", "JS"]);    // Displays array or object in a table format

console.dir(document.body);              // Displays object properties in a tree-like structure
```

## 🧮 Counting & Timing

```js
console.count("Click");         // Counts how many times it's called

console.countReset("Click");    // Resets the counter

console.time("Loop Time");      // Starts a timer with a label
for (let i = 0; i < 100000; i++) {}

console.timeEnd("Loop Time");   // Stops the timer and logs elapsed time
```

## 🧠 Conditional Logging

```js
console.assert(2 > 5, "2 is not greater than 5");  // Logs message only if condition is false
```

## 📦 Grouping Messages

```js
console.group("User Info");     // Starts a grouped log section

console.log("Name: Beniel");    // Log inside the group
console.log("Age: 20");         // Another log inside the group

console.groupEnd();             // Ends the group
```

## 🧹 Clearing Console

```js
console.clear();                // Clears all console messages
```