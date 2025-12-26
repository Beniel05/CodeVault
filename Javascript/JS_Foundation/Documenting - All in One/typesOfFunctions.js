const currentYear = 2025;

/* Function Declaration */
// The entire function is hoisted and placed at the top of the scope,
// so it can be called before its definition.

const firstAge = functionName1(2005);

function functionName1(birthYear) {
  return currentYear - birthYear;
}

console.log(firstAge);

// --------------------------------------------------------------------

/* Function Expression */
// Only the variable name is hoisted, not the function itself,
// so it can be used only after assignment.

const functionName2 = function (birthYear) {
  return currentYear - birthYear;
};

const secondAge = functionName2(2005);

console.log(secondAge);

// --------------------------------------------------------------------

/* Arrow Function (ES6) */
// If the function body has a single expression,
// the value is returned implicitly without using the return keyword.

const arrowFunction = birthYear => currentYear - birthYear;
// const arrowFunction = (birthYear) => currentYear - birthYear;
const result = arrowFunction(2005);
console.log(result);



const yearsUntilRetirement = (birthYear, firstName) => {
  const age = currentYear - birthYear;
  const retirement = 65 - age;
  return retirement > 0
    ? `${firstName} retires in ${retirement} years.`
    : `${firstName} is already retired.`;
}

console.log(yearsUntilRetirement(2005, 'Beniel'));
console.log(yearsUntilRetirement(1960, 'Ebenezer'));