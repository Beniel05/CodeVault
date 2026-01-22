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

/* GAME LOGIC */
const randomNumber = Math.trunc(Math.random() * 20) + 1;
// const randomNumber = Math.floor(Math.random() * 20) + 1;
let score = 20;
let highScore = 0;
// document.querySelector(".number").textContent = randomNumber;
console.log(randomNumber);

document.querySelector(".check").addEventListener("click", function () {
  user_number = Number(document.querySelector(".guess").value);
  output_message = document.querySelector(".message");

  if (!user_number) {
    output_message.textContent = "Enter a number!";
  } else if (user_number === randomNumber) {
    if (highScore < score) {
      highScore = score;
    }
    output_message.textContent = "You Got that right!";
    document.body.style.backgroundColor = "green";
  } else if (user_number >= randomNumber) {
    if (score > 0) {
      output_message.textContent = "Too High";
      score--;
      document.querySelector(".score").textContent = score;
    }
  } else if (user_number <= randomNumber) {
    if (score > 0) {
      output_message.textContent = "Too Low";
      score--;
      document.querySelector(".score").textContent = score;
    }
  }
  if (score === 0) {
    document.querySelector(".number").textContent = randomNumber;
    output_message.textContent = "You have lost.";
    document.body.style.backgroundColor = "red";
  }
});
