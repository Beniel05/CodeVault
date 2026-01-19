let arr1 = [20,30,40]
let arr2 = [100,200,400]
let arr3 = arr1.concat(arr2)
console.log(arr3.length);
console.log(arr3);


// PROBLEM:
// We work for a company building a smart home thermometer. Our most recent task is this:
// "Given an array of temperatures of one day, calculate the temperature amplitude.
// Keep in mind that sometimes there might be a sensor error."

const temperatures = [3, -2, -6, -1, 'error', 9, 13, 17, 15, 14, 9, 5];
const temp2 = [100]

// 1) Understand the problem
// 2) Breaking up into sub-problems
const calcAmplitude = function (arr, arr2) {
    let arr3 = arr.concat(arr2);
    let highest = Number.MIN_SAFE_INTEGER;
    let lowest = Number.MAX_SAFE_INTEGER;
    for (let i = 0; i < arr3.length; i++) {
        const curTemp = arr3[i];
        if (typeof curTemp !== 'number') continue;
        if (curTemp > highest) highest = curTemp;
        if (curTemp < lowest) lowest = curTemp;
    }
    return highest - lowest;
};

console.log(calcAmplitude(temperatures, temp2));


// Reverse an array
let array = [1,3,5,7]

const reverse = function (arr) {
    let tempArr = [];
    for (let i = arr.length - 1; i >= 0; i--) {
        tempArr.push(arr[i]) 
    }
    return tempArr;     
}
console.log(reverse(array));


// Celcius to Kelvin
// const measureKelvinSample = function () {
//     let Celcius = Number(prompt("Enter the celcius: "))
//     return `${Celcius + 273} Kelvin`;
// }

const measureKelvin = function () {
    const measurement = {
        type: 'temp',
        unit: 'kelvin',
        value: 10,
    }

    const value = measurement.value;
    const kelvin = value + 273;
    return `${value} celcius is equals to ${kelvin} kelvin`
}

console.log(measureKelvin());