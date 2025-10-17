// 🖥️ Console Methods in JavaScript & Node.js
// Use these for debugging, logging, and measuring code performance.


// copy all the code and paste it in developer console!
// Open browser - Right click - click Inspect - click console - paste the code - click enter


// I've commented many lines to get a proper output in the browser! - You can uncomment it and try to debug or find it's purpose on your own
// ---------- BASIC LOGGING ----------
console.log("Hello World");          // Prints a general log message
console.info("Server started...");   // Prints an informational message
console.warn("Low battery!");        // Prints a warning message in yellow
console.error("File not found!");    // Prints an error message in red
console.debug("Debugging info");     // Prints debug info (hidden in some browsers unless verbose mode)

// ---------- DISPLAYING DATA ----------
console.table(["HTML", "CSS", "JS"]);    // Displays data as a formatted table
console.dir(document.body);              // Displays an object’s properties (tree view, works in browsers)

// ---------- COUNTING & TIMING ----------
console.count("Click");         // Counts how many times it’s called
console.count("Click");         // Second call increments the counter
console.countReset("Click");    // Resets the counter to zero

console.time("Loop Time");      // Starts a timer with the label "Loop Time"
for (let i = 0; i < 100000; i++) {} // Some test loop
console.timeEnd("Loop Time");   // Stops the timer and logs elapsed time in ms

// ---------- CONDITIONAL LOGGING ----------
console.assert(2 > 5, "2 is not greater than 5");  // Logs only if condition is false

// ---------- GROUPING MESSAGES ----------
console.group("User Info");     // Starts a grouped log section
console.log("Name: Beniel");    // Log inside the group
console.log("Age: 20");         // Another log inside the group
console.groupEnd();             // Ends the group

// ---------- CLEARING CONSOLE ----------
//console.clear();                // Clears all console messages (be careful using in Node—it clears the terminal)
// The above console was commented | you can type that in the console otherwise it'll clear all the above consoles when you run it


// ---------- NODE.JS SPECIFIC ----------
// console.trace("Trace example"); // Prints a stack trace (shows where this line was called)
// process.stdout.write("Hello via stdout\n"); // Prints directly to standard output (no auto newline)
// process.stderr.write("Error via stderr\n"); // Prints directly to error output (no auto newline)

// ---------- BONUS ----------
const user = { name: "Beniel", age: 20 };
console.log({ user });          // Log object inside curly braces (shows key-value cleanly)
console.log(JSON.stringify(user, null, 2)); // Logs formatted JSON
