// Learning Objective: Perform arithmetic operations on variables in JS

/* Task:
Perform the following mathematical operations
on the provided variables a and b

Add
Subtract
Multiply
Divide
Increment
Decrement
Reminder
*/

const a = 18;
const b = 24;

// Addition of two values
function add() {
    return a + b;
}

// Subtract small value from larger one
function subtract() {
    if (b > a) {
        return b - a;
    } else {
        return a - b;
    }
}

function multiply() {
    return a * b;
}

// Divide larger value by small
function divide() {
    if (b > a) {
        return b / a;
    } else {
        return a / b;
    }
}

// Increase value of a by 1
function increment() {
    return a + 1;  // We can't use ' a++ ' because a is declared as a constant in the top
}

// Decrease value of b by 1
function decrement() {
    return b - 1;
}

// Divide larger value by small to find the reminder
function reminder() {
    if(b > a){
        return b % a;
    } else {
        return a % b;
    }
}
