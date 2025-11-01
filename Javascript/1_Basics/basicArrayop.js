/*
1. Declare an array named 'teaFlavors' that contains the strings "green tea"`, `"black tea"`, and "oolong tea".
Access the first element of the array and store it in a variable named 'firstTea`.
*/

const teaFlavors = ['green tea','black tea','oolong tea'];
// let anotherWayOfArray = new Array('green tea','black tea','oolong tea') 
// is another way to create arrays, but it’s rarely used because the literal [] syntax is simpler and clearer.
const firstTea = teaFlavors[0]
console.log(firstTea);


/* 
2. Declare an array named 'cities' containing "London", "Tokyo", "Paris"`, and '"New York",
Access the third element in the array and store it in a variable named 'favoriteCity`. 
*/

let cities = ['London','Tokyo','Paris','New York']
const favoriteCity = cities[2]
console.log(favoriteCity);


/*
3. You have an array named 'teaTypes' containing "herbal tea", "white tea", and "masala chai",
Change the second element of the array to "jasmine tea"
*/

const teaTypes = ['herbal tea','white tea','masala chai']
console.log(teaTypes);
teaTypes[1] = 'jasmine tea'
console.log(teaTypes);


/*
4. Declare an array named 'citiesVisited' containing "Mumbai" and "Sydney"`
Add "Berlin" to the array using the push method.
*/

const citiesVisited = ['Mumbai','Sydney']

/* citiesVisited.length // This will give the n+1th Index | the total length of the array starts from 1, not 0
citiesVisited[citiesVisited.length] = 'Berlin' // So this will added in the n+1th Index so last element in that array */

citiesVisited.push('Berlin')
// Push method is used to insert an item in the end
console.log(citiesVisited);


/*
5. You have an array named 'teaOrders' with "chai", "iced tea", "matcha", and "earl grey".
Remove the last element of the array using the `pop` method and store it in a variable named `lastOrder`,
*/
const teaOrders = ['chai','iced tea','matcha','earl grey']
let LastOrder = teaOrders.pop();
console.log(teaOrders);
console.log(LastOrder);


/*
6. You have an array named `popularTeas containing "green tea", "oolong tea" and "chai"
Create a soft copy of this array named 'softCopyTeas`.
*/

const popularTeas = ['green tea', 'oolong tea', 'chai'];
let softCopyTeas = popularTeas;
softCopyTeas.pop();
// Both will point towards the same memory location. So if any changes happened to anyone of it, it'll affect both = Softcopy
console.log(popularTeas);
console.log(softCopyTeas); // Priting both for understanding the reference point is same for both


/*
7. You have an array named 'topCities' containing "Berlin", "Singapore", and "New York".
Create a hard copy of this array named 'hardCopyCities'.
*/

const topCities = ['Berlin','Singapore','New York']
let hardCopyCities = [...topCities] // this will make a separate copy in the memory location
// ... (three dots) is called the "Spread or Rest" - you can have a quick search with it!
topCities.pop()
console.log(hardCopyCities);
console.log(topCities);


/*
8. You have two arrays: 
    'europeanCities' containing "Paris" and "Rome" and
    'asianCities' containing "Tokyo" and "Bangkok".
Merge these two arrays into a new array named 'worldCities'.
*/

let europeanCities = ['Paris','Rome']
let asianCities = ['Tokyo','Bangkok']
/* Trying out things 
let practice = europeanCities + asianCities
console.log(practice);
console.log(typeof practice); 
let practice1 = [europeanCities, asianCities]
console.log(practice1); */
// let worldCities = [europeanCities.concat(asianCities)];

let worldCities = europeanCities.concat(asianCities);
console.log(worldCities);
console.log(typeof worldCities); // Array is an Object!


/*
9. You have an array named 'teaMenu' containing "masala chai", "oolang tea", "green tea" and "earl grey"
   Find the length of the array and store it in a variable name 'menuLength'.
*/

const teaMenu = ['Masala chai', 'Oolang tea', 'Green tea', "Earl grey"];
let menuLength = teaMenu.length;
console.log("The total Menu items in number: " + menuLength);


/*
10. You have an array named 'cityBucketList' containing "Kyoto", "London", "Cape Town" and "Vancouver".
    Check if "london" is in the array and store the result in a variable name "isLondonInList".
*/

let cityBucketList = ["Kyoto", "London", "Cape Town", "Vancouver"];
let isLondonInList = cityBucketList.includes('London') // the value inside the quote is case sensitive. Mismatch of upper/lower case will result in false
console.log(isLondonInList);

// console.log(cityBucketList.includes('London'));
// includes is used to find whether it is in or not - true or false