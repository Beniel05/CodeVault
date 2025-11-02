/*
1. Write a function named 'makeTea' that takes one parameter 'typeOfTea',
and returns a string like "Making green tea" when called with "green tea". 
Store the result in a variable name 'teaOrder'.
*/

function makeTea(typeOfTea) {
    return "Making " + typeOfTea;
    // return `Making ${typeOfTea}`;   -> Can be also written like this with backticks ` STRING ` and for variables use ${ VARIABLE }
}
let teaOrder = makeTea("green tea"); // Calling the function with passing argument -> function will return a value -> that will get stroed in the variable teaOrder
console.log(teaOrder);



/*
2. Create a function named 'orderTea' that takes one parameter 'teaType'. 
Inside this function, create another function named 'confirmOrder' that returns a message like "Order confirmed for chai". 
Call 'confirmOrder' from within 'orderTea' and return the result.
*/
 
function orderTea(teaType) {
    function confirmOrder() {
        return `Order confirmed for ${teaType}`;
    }
    return confirmOrder()
}

let result = orderTea("chai");
console.log(result);



/*
3. Write an Arrow function named 'calculateTotal' that takes two parameters: 'price' and 'quantity'. 
The function should return the total cost by multiplying the 'price' and 'quantity'. 
Store the result in a variable named 'totalCost'.
*/

const calculateTotal = (price,quantity) => {
    return price * quantity;
};
// const calculateTotal = (price,quantity) => price * quantity;    // -> You can also write the above arrow function without return and in a single line like this

let totalCost = calculateTotal(10,3);
console.log(totalCost);



/*
4. Write a function named 'processTeaOrder',
that takes another function 'makeTea1' as a parameter and calls it with the argument 'earl grey'. 
Return the result of calling 'makeTea'.
*/
// First-Class Function || Higher Order Function

function makeTea1(params) { // 2nd - Creating a secondary function which wants to be inside the primary function's placeholder/parameter
    return `makeTea1: ${params}`; // 5th - That 'earl grey' will replace the 'params' in the argument of this secondary function
}

function processTeaOrder(placeholder) { // 1st - Creating a primary function with a parameter/placeholder
    return placeholder('earl grey'); // 4th - The placeholder will become -> makeTea1('earl grey') -> And this will call the secondary function
}

let order = processTeaOrder(makeTea1); // 3rd - Calling the primary function with the secondary function as an argument

console.log(order);

// One line summary : 
// processTeaOrder calls the makeTea1 function with 'earl grey' and returns whatever makeTea1 returns — a perfect example of 'function callback chaining'.




/*
5. Write a function named 'createTeaMaker' that returns another function.
The returned function should take one parameter 'teaType' and return a message like "Making green tea".
Store the returned function in a variable named 'teaMaker' and call it with "green tea".
*/

function createTeaMaker() { // 2nd - This function called from 1st
    return function(teaType) { // 3rd - This function returns a nameless function which will be returned to the variable which called 1st
        return `Making ${teaType}` // 5th - teaType (placeholder / parameter ) will get a value 'green tea'. And gets returned
    }    
}

let teaMaker = createTeaMaker();    // 1st - The main function will be called. That will return a nameless function that'll be assigned to the variable teaMaker

let storingTheValue = teaMaker('green tea') // 4th - Passing 'green tea' to the nameless function which has been returned from 3rd
// 6th - The returned value is get stored in 'storingTheValue'
console.log(storingTheValue);

/* 

let teaMaker = createTeaMaker();
console.log(teaMaker('green tea'));

-> This will also works - but it don't store any values - Use if you only want to print the result and not to store 
*/