// Slightly Advanced

// NOTE: 
// 1. i for index is a 'scoped variable' so we can use it in n-number of different 'for' loops
// 2. Array is also an Object - (datatype)


/*
1. Write a 'for' loop that loops through the array ['green tea','black tea','chai','oolang tea'] and stops the loop when it finds 'chai'. 
Store all teas before "chai" in a new array named 'selectedTeas'.
*/

const teas = ['green tea', 'black tea', 'chai', 'oolang tea'];
const selectedTeas = [];
for (let i = 0; i < teas.length; i++) {
    // selectedTeas.push(teas[i]) -> If you include 'chai' then place it here. 
    if(teas[i] === 'chai'){
        break; // When 'chai' is in the array it'll break before pushing 'chai'
    } else {
        selectedTeas.push(teas[i]); // Placing this line here will exclude 'chai'
    }
}
console.log(teas);
console.log(selectedTeas);


/*
2. Write a 'for' loop that loops through the array ['London','New York','Paris','Berlin'] and skips "Paris". 
Store the other cities in a new array named 'visitedCities'.
*/

let cities = ['London','New York','Paris','Berlin'];
let visitedCities = [];
for (let i = 0; i < cities.length; i++) { // This i for index is a scoped variable so we can use it in multiple different for loops
    if (cities[i] === 'paris' || cities[i] === 'Paris') {
        continue;
    } else {
        visitedCities.push(cities[i]);
    }
}
console.log(cities);
console.log(visitedCities);


/*
3. Use a 'for-of' loop to iterate through the array [1,2,3,4,5] and stop when the number '4' is found. 
Store the numbers before '4' in an array named 'smallNumbers'.
*/

let numbers = [1,2,3,4,5];
let smallNumbers = [];

for (const num of numbers) { // Iterates over each value in the numbers array
    if (num === 4) {
        break; // If num is 4 then i'll end the loop before pushing the num into the smallNumbers array
    } else {
        smallNumbers.push(num) // assigning the current value to element on each loop one by one.
    }
}
console.log(numbers);
console.log(smallNumbers);


/*
4. Use a 'for-of' loop to iterate through the array ['chai','green tea','herbal tea','black tea'] and skip 'herbal tea'. 
Store the other teas in an array named 'preferredTeas'.
*/

let teaTypes = ['chai','green tea','herbal tea','black tea'];
let preferredTeas = [];

for (const tea of teaTypes) {
    if (tea === 'herbal tea') {
        continue;
    } else {
        preferredTeas.push(tea);
    }
}
console.log(teaTypes);
console.log(preferredTeas);


/*
5. Use a 'for-in' loop to loop through an object containing city populations. 
Stop the loop when the populaion of 'Berlin' is found and store all previous cities populations in a new object named 'newCitiesPopulations'.
let citiesPopulation = {
    "London": 8900000,
    "New York": 8400000,
    "Paris": 2200000,
    "Berlin": 3500000
}; 
*/
let citiesPopulations = {
    "London": 8900000, 
    "New York": 8400000,
    "Paris": 2200000,
    "Berlin": 3500000
}; 
//for...in loops iterate keys in order of ascending numeric keys first, then string keys in insertion order — so it’s mostly ordered but not strictly guaranteed for all cases.
let newCitiesPopulations = {};
// Inbuilt methods => console.log(Object.keys(citiesPopulation)); - To print just keys && console.log(Object.values(citiesPopulation)); - To print just values

for (const key in citiesPopulations) {
    // console.log(key);  - to get the value of that specific key in that iteration (loop) || This will print - the KEYs 
    // console.log(citiesPopulations[key]); - to get the value of that specific key in that iteration (loop) || This will print - the VALUEs
    if(key==="Berlin"){
        break;
    } else {
        newCitiesPopulations[key] = citiesPopulations[key] // It copies the key and its value to form the same key–value pair in the new object.
    }
}
console.log(citiesPopulations);
console.log(newCitiesPopulations);
/*
Study Prompt (copy this) - if you have any doubts on the above section - 5th Question:
💬 Explain clearly and step-by-step:
How a for...in loop works when looping through an object like citiesPopulation.
The difference between console.log(key) and console.log(citiesPopulation[key]) — why one prints only keys and the other prints only values.
Why object.key and object[key] behave differently, and how newCityPopulations[key] = citiesPopulations[key] actually adds both key and value dynamically.
📘 Use examples, a small table, and a simple analogy (like “box and label”) to help me understand how it works inside JavaScript.
*/



/*
6. Use a 'for-in' loop to loop through an object containing city populations. 
Skip any city with a population below 3 million and store the rest in a new object named 'largeCities'.
let worldCities = {
    "Sydney": 5000000,
    "Tokyo": 9000000, 
    "Berlin": 3500000, 
    "Paris": 2200000
};
*/

let worldCities = {
    "Sydney": 5000000,
    "Tokyo": 9000000, 
    "Berlin": 3500000, 
    "Paris": 2200000
};

let largeCities = {}

for (const key in worldCities) {
    // console.log(worldCities[key]); // we can check the values with this => worldCities[key]
    if (worldCities[key] < 3000000) {
        continue;
    }
    else {
        largeCities[key] = worldCities[key];
    }    
}

console.log(worldCities);
console.log(largeCities);



/*
7 (a). Write a 'forEach' loop that iterates through the array '["earl grey", "green tea", "chai", "oolang tea"]'. 
Store all other tea types except 'chai' in an array name 'availableTeas'.
*/

let arr = ['earl grey', 'green tea', 'chai', 'oolang tea'];

let availableTeas = [];

arr.forEach(element => {
    if (element == 'chai') {
        return; // In functions 'break' cannot be used to stop the loop => here we are inside the function in a loop. So we use 'return' here
        // 'return' is not equals to 'break'
    } else {
        availableTeas.push(element)
    }
});
console.log(availableTeas);
/* arr.forEach(function (e) {   // Also can be written like this - with function keyword and without a function name
    console.log(e); 
}); */ 



/*
7 (b). Write a 'forEach' loop that iterates through the array '["earl grey", "green tea", "chai", "oolang tea"]'. 
Stop the loop when "chai" is found, and store all previous tea types in an array name 'availableTeas'.
*/

let arr1 = ["earl tea", "green tea", "chai", "oolong tea"]; 
let availableTeas1 = [];
 
arr1.forEach(function (teaType, index) {
  if (index < arr1.indexOf("chai")) {
    availableTeas1.push(teaType);
  }
});
console.log(availableTeas1);



/*
8. Write a 'forEach' loop that iterates through the array ['Berlin','Tokyo','Sydney','Paris']. 
Skip "Sydney" and store the other cities in a new array named 'traveledCities'.
*/

let Newcities = ['Berlin','Tokyo','Sydney','Paris'];
let traveledCities = []
// Newcities.forEach(function (city) { ... });  - This also works (old style)
Newcities.forEach(city => {
    if (city == 'Sydney') {
        return;
    } traveledCities.push(city) // You can also put this statement inside an 'else' block
}); console.log(traveledCities);



/*
9. Write a 'for' loop that iterates through the array [2,5,7,9]. Skip the value '7' and multiply the rest by 2. 
Store the result in a new array named 'doubledNumbers'.
*/

let Numbers = [2,5,7,9];
let doubledNumbers = [];

for (let i = 0; i < Numbers.length; i++) {
    if (Numbers[i] === 7) {  // if(Numbers[i] == '7') { ... } - This will also run but not recommended. Always use === 'Strictly equals to'
        continue;
    } else {
        doubledNumbers.push(Numbers[i]*2);
    }
}
console.log(Numbers);
console.log(doubledNumbers);



/*
10. Use a 'for-of' loop to iterate through the array ['chai', 'green tea', 'black tea', 'jasmine tea', 'herbal tea'] 
and stop when the length of the current tea name is greater than 10. 
Store the teas iterated over in an array named 'shortTeas'.
*/

let Teas = ['chai', 'green tea', 'herbal tea', 'jasmine tea', 'black tea'];
let shortTeas = [];

for (const element of Teas) {
    if (element.length > 10) {
        break;
    } shortTeas.push(element)
}

console.log(Teas);
console.log(shortTeas);