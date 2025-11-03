// Learning Objective: JavaScript coding tasks focused on Type Conversions

/* 
Task 1:
Write a function stringToNumber that takes a string input and tries to convert it to a number. 
If the conversion fails, return "Not a number".
*/

function stringToNumber(input) {
  let number = Number(input);
  if (isNaN(number)) {
    // isNaN() checks whether a value is “Not a Number”
    return "Not a number";
  } else {
    return number;
  }
}

// Example:
const input1 = "42";
console.log(`Input: "${input1}" → Output:`, stringToNumber(input1));
// Try other examples:
console.log(stringToNumber("3.14"));     // 3.14
console.log(stringToNumber("hello"));    // "Not a number"
console.log(stringToNumber(""));         // 0
console.log(stringToNumber("100abc"));   // "Not a number"



/*
Task 2:
Write a function flipBoolean that takes any input and converts it to its boolean equivalent, then flips it.
For example, true becomes false, 0 becomes true, etc.
*/

function flipBoolean(input) {
  // Boolean(input) converts the value to true or false
  // The ! operator flips (negates) that boolean value
  return !Boolean(input);
}

// Example:
const input2 = 0;
console.log(`Input: ${input2} → Output:`, flipBoolean(input2));
// Try other examples:
console.log(flipBoolean(true));      // false
console.log(flipBoolean(false));     // true
console.log(flipBoolean(1));         // false
console.log(flipBoolean(""));        // true
console.log(flipBoolean("hello"));   // false



/*
Task 3:
Write a function whatAmI that takes an input and returns a string describing its type after conversion.
If it's a number, return "I'm a number!", if it's a string, return "I'm a string!", etc.
*/

function whatAmI(input) {
  let type = typeof input;
  return `I'm a ${type}!`;
}

// Example:
const input3 = [1, 2, 3];
console.log(`Input: ${JSON.stringify(input3)} → Output:`, whatAmI(input3));
// Try other examples:
console.log(whatAmI(42));          // "I'm a number!"
console.log(whatAmI("hello"));     // "I'm a string!"
console.log(whatAmI(true));        // "I'm a boolean!"
console.log(whatAmI(undefined));   // "I'm a undefined!"



/*
Task 4:
Write a function isItTruthy that takes an input and returns "It's truthy!" 
if the value is truthy in JavaScript, or "It's falsey!" if it's falsey.
*/

function isItTruthy(input) {
  if (input) {
    return "It's truthy!";
  } else {
    return "It's falsey!";
  }
}

// Example:
const input4 = "";
console.log(`Input: "${input4}" → Output:`, isItTruthy(input4));
// Try other examples:
console.log(isItTruthy(true));       // "It's truthy!"
console.log(isItTruthy(false));      // "It's falsey!"
console.log(isItTruthy(0));          // "It's
