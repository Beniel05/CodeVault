import random

rock = '''
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)
'''

paper = '''
    _______
---'   ____)____
          ______)
          _______)
         _______)
---.__________)
'''

scissors = '''
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)
'''


random_action = random.randint(0,2)
user_input = int(input("What do you choose? Type 0 for Rock, 1 for Paper or 2 for Scissors."))

if random_action == user_input: # If both chooses the same number
    if random_action == 0:
        print(rock)
        print("Computer chose:")
        print(rock)
        print("Draw")
    elif random_action == 1:
        print(paper)
        print("Computer chose:")
        print(paper)
        print("Draw")
    elif random_action == 2:
        print(scissors)
        print("Computer chose:")
        print(scissors)
        print("Draw")

elif random_action == 0:
    print(rock)
    print('Computer chose:')
    if user_input == 1:
        print(paper)
        print("You Won")
    elif user_input == 2:
        print(scissors)
        print("You lose")

elif random_action == 1:
    print(paper)
    print('Computer chose:')
    if user_input == 0:
        print(paper)
        print("You lose")
    elif user_input == 2:
        print(scissors)
        print("You Won")

elif random_action == 2:
    print(scissors)
    print('Computer chose:')
    if user_input == 0:
        print(rock)
        print("You Won")
    elif user_input == 1:
        print(paper)
        print("You lose")

else:
    print("Invalid input. Choose a number between 0 - 2") 
    # End
    
    
# A slightly shorter version!
choices = [rock, paper, scissors]

# User input (safe)
try:
    user_choice = int(input("Type 0 for Rock, 1 for Paper or 2 for Scissors: "))
    if user_choice not in [0, 1, 2]:
        print("Invalid choice. Choose between 0–2.")
        exit()
except ValueError:
    print("Please enter a number.")
    exit()

computer_choice = random.randint(0, 2)

print("\nYou chose:")
print(choices[user_choice])

print("Computer chose:")
print(choices[computer_choice])

# Game logic
if user_choice == computer_choice:
    print("It's a Draw!")
elif (
    (user_choice == 0 and computer_choice == 2) or
    (user_choice == 1 and computer_choice == 0) or
    (user_choice == 2 and computer_choice == 1)
):
    print("You Win!")
else:
    print("You Lose.")