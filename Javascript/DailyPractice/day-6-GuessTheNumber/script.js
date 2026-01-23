/* GAME LOGIC */
let randomNumber = Math.trunc(Math.random() * 20) + 1;
// const randomNumber = Math.floor(Math.random() * 20) + 1;
let score = 20;
let highScore = 0;

console.log(randomNumber); // DEVELLOPMENT PURPOSE

const displayMessage = function (message) {
  document.querySelector(".message").textContent = message;
};

document.querySelector(".check").addEventListener("click", function () {
  user_number = Number(document.querySelector(".guess").value);
  // output_message = document.querySelector(".message"); // Created a function for this above

  // If user clicks the check button without entering any value/number
  if (!user_number) {
    displayMessage("Enter a number!");
  }
  // If the user guessed the correct number
  else if (user_number === randomNumber) {
    if (highScore < score) {
      document.querySelector(".highscore").textContent = score;
    }
    document.querySelector(".number").textContent = randomNumber;
    displayMessage("You Got that right!");
    document.body.style.backgroundColor = "green";
    document.querySelector(".number").style.width = "20rem";
  } else if (user_number !== randomNumber) {
    displayMessage(user_number > randomNumber ? "Too High" : "Too Low");
    score--;
    document.querySelector(".score").textContent = score;
  }
  // // If the user guess is too high
  // else if (user_number >= randomNumber) {
  //   if (score > 0) {
  //     output_message.textContent = "Too High";
  //     score--;
  //     document.querySelector(".score").textContent = score;
  //   }
  // }
  // // If the user guess is too low
  // else if (user_number <= randomNumber) {
  //   if (score > 0) {
  //     output_message.textContent = "Too Low";
  //     score--;
  //     document.querySelector(".score").textContent = score;
  //   }
  // }
  // If the user guess wrong answers 20 times in a row
  if (score === 0) {
    document.querySelector(".number").textContent = randomNumber;
    displayMessage("You have lost.");
    document.body.style.backgroundColor = "red";
  }
});

// When the user click the again button
document.querySelector(".again").addEventListener("click", function () {
  score = 20;
  randomNumber = Math.trunc(Math.random() * 20) + 1;
  displayMessage("Start guessing...");
  document.querySelector(".score").textContent = score; // score = 20
  document.querySelector(".number").textContent = "?";
  document.querySelector(".number").style.width = "15rem";
  document.querySelector(".guess").value = "";
  document.querySelector("body").style.backgroundColor = "#222";
});
/* END */

// const dq = document.querySelector.bind(document);
// console.log(dq(".message").textContent);
// document.querySelector('.message').textContent = "Correct Number"

// document.querySelector('.number').textContent = 15;
// console.log(document.querySelector('.number').textContent);
// document.querySelector('.score').textContent = 10;

// document.querySelector('.guess').value = 11;
// console.log(document.querySelector('.guess').value);

// document.querySelector('.label-highscore').innerHTML = "Changed";

// document.querySelector(".message").onclick = function () {
//     this.textContent = "Again!"
// }

// const heading = document.querySelector("h1");
// heading.addEventListener("click", function () {
//     heading.textContent = "Changed!"
// })

// document.querySelector(".check").onclick = function () {
//     this.style.backgroundColor = "black"
// }

// document.querySelector(".check").addEventListener('click', function () {
//     const guess = document.querySelector(".guess").value;
//     console.log(guess, typeof guess);
//     if(!guess) {
//         document.querySelector(".message").textContent = "No number entered"
//     }
// })
