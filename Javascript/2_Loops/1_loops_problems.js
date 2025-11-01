// Read the comments of 3rd question if you're running it with node and not in the browser (line 45 & 46)


/*
1. Write a 'while' loop that calculates the sum of all numbers from 1 to 5 
and stores the result in a variable named 'sum'.
*/

let i = 1;
let sum = 0;
while(i<=5){
    sum = sum + i;
    i++;
}
console.log(sum);


/*
2. Write a 'while' loop that counts down from 5 to 1 
and stores the numbers in an array named 'countdown'.
*/

let index = 5;
let countdown = [];
while (index>=1) {
    countdown.push(index)
    index--;
}
console.log(countdown);


/*
3. Write a 'do while' loop that prompts a user to enter their favorite tea type until they enter "stop".
Store each tea type in an arrya name 'teaCollection'.
*/

let teaCollection = [];
let input;

do {
    input = prompt('Enter a tea type (type "exit" to stop) : ')
    if (input !== 'exit') teaCollection.push(input) // For single condition without else if or else don't need { curly braces }
} while (input !== 'exit');
 
// Run the above code in browser console! Or comment this out (For not getting errors) - 
// Or you can download and import the prompt-sync (OR) readline-sync using npm || search in the web



/*
4. Write a 'do while' loop that adds numbers from 1 to 3
and stores the result in a variable named 'total'.
*/

let j = 1;
let total = 0;
do {
    total += j;
    j++;
} while (j<=3);
console.log(total);


/*
5. Write a 'for' loop that multiplies each element in the array '[2,4,6]' by 2 
and stores the results in a new array named 'multipliedNumbers'.
*/

let evenArray = [2,4,6];
let multipliedNumbers = []
for(let k = 0; k < evenArray.length; k++){
    multipliedNumbers.push( evenArray[k] * 2 )
}
console.log(multipliedNumbers);


/*
6. Write a 'for' loop that lists all the cities in the array '["Paris","New York", "Tokyo", "London"]'
and stores each city in a new array named 'cityList'.
*/

let cityArray = ['Paris', 'New York', 'Tokyo', 'London'];
let cityList = [];
for (let y = 0; y < cityArray.length; y++) {
    cityList[y] = cityArray[y]
    // Another method
    /*
        const value = cityArray[y]
        cityList.push(value)
    */
}
console.log(cityArray);
console.log(cityList);