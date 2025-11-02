// 1. Checking if a number is greater than another number:

let num1 = 5;
let num2 = 8;

if (num1 > num2) {
    console.log("Num1 is greater than Num2");  
} else if (num1 < num2) {
    console.log("Num2 is greater than Num1"); 
} else {
    console.log('Both are equal');
}
/* Modern style - You can also write like the below as well as for other codes!

if (num1 > num2) console.log("Num1 is greater than Num2");  
else if (num1 < num2) console.log("Num2 is greater than Num1");
else console.log('Both are equal'); */



// 2. Check if a string is equal to another string

let userName = 'Beniel';
let anotherUserName = 'Beniel';

if(userName === anotherUserName){
    // You can also use double == | this triple === means strictly equals to which also checks the datatype.
    console.log("There is already someone having the same username!");
} else {
    console.log("You can have that username");
}


// 3. Check if a variable is a number or not: 

let isNumber = 33;
if (typeof isNumber == 'number') {
    // You can also write like => typeof(isNumber)
    console.log("It is a number");
} else {
    console.log("It is NOT a number");
}


// 4. Check if a boolean value is true or false:

let isLoggedIn = true;
if (isLoggedIn) { 
    // if statement runs only the condition is true!
    console.log("The user is logged in");
} else {
    console.log("The user is NOT logged in");
}


// 5. Check if an array is empty or not

let arr = ['item1']
// console.log(arr.length); => arr.length is used to find the length of the array
if(arr.length == 0){
    // Array can't have negative index like (-1,-2,...) so we don't have to check like (<=)
    console.log("The array is empty");
} else {
    console.log("The array is NOT empty");
}