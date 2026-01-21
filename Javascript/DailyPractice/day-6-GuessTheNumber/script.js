const dq = document.querySelector.bind(document);
console.log(dq(".message").textContent);
document.querySelector('.message').textContent = "Correct Number"

document.querySelector('.number').textContent = 15;
document.querySelector('.score').textContent = 10;

document.querySelector('.guess').value = 11;
console.log(document.querySelector('.guess').value);