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

/*
Example Inputs and Outputs:
--------------------------------
stringToNumber("42")        ➜  42
stringToNumber("3.14")      ➜  3.14
stringToNumber("hello")     ➜  "Not a number"
stringToNumber("")          ➜  0
stringToNumber("100abc")    ➜  "Not a number"
*/



/*
Task 2:
Write a function flipBoolean that takes any input and converts it to its boolean equivalent, then flips it.
For example, true becomes false, 0 becomes true, etc.
*/

function flipBoolean(input) {
    return !Boolean(input);
}

/*
Example Inputs and Outputs:
--------------------------------
flipBoolean(true)      ➜  false
flipBoolean(false)     ➜  true
flipBoolean(1)         ➜  false
flipBoolean(0)         ➜  true
flipBoolean("")        ➜  true
flipBoolean("hello")   ➜  false
*/



/*
Task 3:
Write a function whatAmI that takes an input and returns a string describing its type after conversion.
If it's a number, return "I'm a number!", if it's a string, return "I'm a string!", etc.
*/

function whatAmI(input) {
    let type = typeof input;
    return `I'm a ${type}!`;
}

/*
Example Inputs and Outputs:
--------------------------------
whatAmI(42)           ➜  "I'm a number!"
whatAmI("hello")      ➜  "I'm a string!"
whatAmI(true)         ➜  "I'm a boolean!"
whatAmI([1, 2, 3])    ➜  "I'm a object!"
whatAmI(undefined)    ➜  "I'm a undefined!"
*/



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

/*
Example Inputs and Outputs:
--------------------------------
isItTruthy(true)       ➜  "It's truthy!"
isItTruthy(false)      ➜  "It's falsey!"
isItTruthy(0)          ➜  "It's falsey!"
isItTruthy(1)          ➜  "It's truthy!"
isItTruthy("")         ➜  "It's falsey!"
isItTruthy("hello")    ➜  "It's truthy!"
isItTruthy(null)       ➜  "It's falsey!"
isItTruthy(undefined)  ➜  "It's falsey!"
*/
