console.log('--- 1. Object ---');

const username = {
    "first name": 'Beniel', // If there is a space in the property or the key (first name). We cannot use (.) to access it.
    // We have to use object["key"] => username['first name']
    isLoggedin: true 
};
console.log(username);

username['first name'] = 'Mr. B' // Changing the existing value - the reference is still the same in the memory, 
// that's why we can change even it is declared with const keyword in objects
username.lastname = 'E'
username.age = 20 // Adding two new values to the object
console.log(username);

console.log(typeof username);

console.log(); // For empty spaces

console.log('--- 2. Object with array ---');

let today = new Date();
console.log(today);
console.log(today.getDate()); // Current Date
console.log(today.getDay()); // Monday = 1 ... Saturday = 6 => Sunday 0

let whichDay = today.getDay(); 
if (whichDay === 0) whichDay = 7; // This seven will get reduced by -1 to get sunday
// You don't need a curly braces when you have only one condition statement like the above

const days = ['Monday','Tuesday','Wednesday','Thursday','Friday','Saturday','Sunday']; // This is an array - index from 0 - 6 [Total 7 days]
console.log(`Today is ${days[whichDay - 1]}`); // Monday = 1 but it's index = 0 [So we'll get 1 - 1 = 0 => Index of Monday = 0]

// `String1 String2 ${value}` - Data interpolation => ` called as Backticks
// Old way: 'Today is ' + days[whichDay - 1]