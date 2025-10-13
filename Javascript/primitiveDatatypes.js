console.log("--- 1. Number ---")
let a = 20;
console.log(a);
console.log(typeof a); // "number"

console.log(); // for empty space in terminal

console.log("--- 2. String ---")
let b = "Hello";
console.log(b);
console.log(typeof b); // "string"

console.log(); // for empty space in terminal

console.log("--- 3. Boolean ---")
let c = true;
console.log(c);
console.log(typeof c); // "boolean"

console.log(); // for empty space in terminal

console.log("--- 4. Undefined ---")
let d;
console.log("let d;");
console.log(typeof d); // "undefined"

console.log(); // for empty space in terminal

console.log("--- 5. Null ---")
let e = null;
console.log("let e = null;");
console.log(typeof e); 
console.log('"object" ❌ (this is an old JS bug)');

console.log(); // for empty space in terminal

console.log("--- 6. BigInt ---")
let f = 123456789012345678901234567890n;
console.log(f);
console.log(typeof f); // "bigint"

console.log(); // for empty space in terminal

console.log("--- 7. Symbol ---")
let g = Symbol("id");
console.log(typeof g); // "symbol"

let sm1 = Symbol("name")
let sm2 = Symbol("name") // Both are unique even with same string inside
console.log(sm1 == sm2); // false

console.log(); // for empty space in terminal

console.log("--- 8. Object ---")
let h = { name: "Ben", age: 20 };
console.log(typeof h); // "object"

console.log(); // for empty space in terminal

console.log("--- Extra examples (special object types) ---")
let arr = [1, 2, 3];
console.log(typeof arr); // "object"  (Array is a type of object)
let func = function() {};
console.log(typeof func); // "function" (special kind of object)

let number = 120;
let anotherNumber = new Number(120)
console.log(typeof(number)); // Number
console.log(typeof(anotherNumber)); // Object

