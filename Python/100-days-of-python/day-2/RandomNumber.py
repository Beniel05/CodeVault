import random;

random_number = random.randint(1,6)
print(random_number)

user_input = int(input("Enter the guess: "))

while(user_input != random_number):
    print("Oops, that's not!")
    user_input = int(input("Enter the guess again: "))

print("Great!")