// Coding Challenge #1

/*
Give an array of forecasted maximum temperatures, the thermometer displays a string with these temperatures.

Example: [17, 21, 23] will print "... 17°C in 1 days ...21°C in 2 days ... 23°C in 3 days ..."

Create a function 'printForecast' which takes in an array 'arr' and logs a string like the above to the console.

Use the problem-solving framework: Understand the problem and break it up into sub-problems!

TEST DATA 1: [17 21, 23]
TEST DATA 2: [12, 5, -5, 0, 4]
*/

let arr = [17, 21, 23]

const printForecast = function (arr) {
    debugger;
    let str = '... '
    for (let i = 0; i < arr.length; i++) {
        str += `${arr[i]}°C in ${i + 1} days ... `;        
    }    
    return str;
}

console.log(printForecast(arr))



// Coding Challenge #2

/*
Let's say you're building a time tracking application for freelancers.
At some point in building this app, you need a function that receives daily work hours for a certain week, and returns:
1. Total hours worked
2. Average daily hours
3. The day with the most hours worked
4. Number of days worked
5. Whether the week was full-time (worked 35 hours or more)

TEST DATA: [7, 5, 8, 6.5, 0, 8.5, 4, 0]
*/

/* 
let record =  [7.5, 8, 6.5, 0, 8.5, 4, 0]

const tracker = function (arr) {
    let totalHoursWorked = 0;
    let maxWorkedDay = 0;
    let numberOfWorkedDays = 0;
    for (let i = 0; i < arr.length; i++) {
        totalHoursWorked += arr[i]
        if (arr[i] > maxWorkedDay) {
            maxWorkedDay = i + 1;
        }
        if (arr[i] !== 0) {
            numberOfWorkedDays += 1
        }
    }
    console.log("Total hours worked:", totalHoursWorked);
    console.log("Average daily hours:", Math.round(totalHoursWorked / record.length));
    console.log("The day with the most hours worked:", maxWorkedDay)
    if (totalHoursWorked >= 35) {
        console.log("You have worked more than", totalHoursWorked, "hrs");
    }
}

tracker(record) 
*/

const tracker = function (arr) {
    // validation: max 7 days
    if (arr.length > 7) {
        console.log("Error: A week can have at most 7 days.");
        return;
    }

    const days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"];

    let totalHours = 0;
    let maxHours = 0;
    let maxDayIndex = -1;
    let daysWorked = 0;

    for (let i = 0; i < arr.length; i++) {
        totalHours += arr[i];

        if (arr[i] > maxHours) {
            maxHours = arr[i];
            maxDayIndex = i;
        }

        if (arr[i] > 0) {
            daysWorked++;
        }
    }

    console.log("Total hours worked:", totalHours);
    console.log("Average daily hours:", (totalHours / arr.length).toFixed(1));
    console.log(
        "Day with most hours worked:",
        `${days[maxDayIndex]} (Day ${maxDayIndex + 1})`
    );
    console.log("Number of days worked:", daysWorked);

    const employeeType = totalHours > 35 ? "Full Time Employee" : "Part Time Employee";

    console.log("Employee Type:", employeeType);

};

// TEST
tracker([7.5, 8, 6.5, 0, 8.5, 4, 0]);
