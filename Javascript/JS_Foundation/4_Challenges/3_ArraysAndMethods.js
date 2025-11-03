// Utilise the inbuilt methods of arrays in JavaScript to solve the below tasks

/*
Task 1: Array Filtering
Write a function filterNumbers(arr) that returns only numbers from a mixed array
*/

function filterNumbers(arr) {
  return arr.filter(item => typeof item === 'number');
  /*
    .filter() goes through every element in the array.
    For each item, it checks if the type is 'number'.
    If true → it’s kept in the new array.
    If false → it’s skipped.
  */
}

// Example:
const mixedArray = [1, 'hello', true, 42, 'world', 7];
console.log("Filtered Numbers:", filterNumbers(mixedArray));
// Output: [1, 42, 7]



/*
Task 2: Array Reversal
Write a function reverseArray(arr) that reverses the array
*/

function reverseArray(arr) {
  return arr.reverse();
  // .reverse() changes the order of elements (it also modifies the original array)
}

// Example:
const fruits = ['apple', 'banana', 'cherry'];
console.log("Reversed Array:", reverseArray(fruits));
// Output: ['cherry', 'banana', 'apple']



/*
Task 3: Find Maximum in an Array
Write a function findMax(arr) that returns the largest number in the array
*/

function findMax(arr) {
  // Math.max() finds the biggest number from given values
  // The spread operator (...) expands the array into individual numbers
  return Math.max(...arr);
}

// Example:
const numbers = [10, 25, 3, 99, 42];
console.log("Maximum Number:", findMax(numbers));
// Output: 99



/*
Task 4: Remove Duplicates from an Array
Write a function removeDuplicates(arr) that returns a new array with all duplicates removed
*/

function removeDuplicates(arr) {
  // Set stores only unique values (no duplicates)
  // The spread operator (...) converts the Set back into a normal array
  return [...new Set(arr)];
}

// Example:
const duplicates = [1, 2, 2, 3, 4, 4, 5];
console.log("Array without Duplicates:", removeDuplicates(duplicates));
// Output: [1, 2, 3, 4, 5]



/*
Task 5: Flatten a Nested Array
Write a function flattenArray(arr) that takes a nested array and returns a single flattened array
*/

function flattenArray(arr) {
  // .flat(Infinity) removes all levels of nesting inside the array
  return arr.flat(Infinity);
}

// Example:
const nestedArray = [1, [2, [3, [4, [5]]]]];
console.log("Flattened Array:", flattenArray(nestedArray));
// Output: [1, 2, 3, 4, 5]
