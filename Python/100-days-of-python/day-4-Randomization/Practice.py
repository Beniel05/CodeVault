import random

random_number = random.randint(1,10)
print(random_number)

random_float = random.random()*100
print(random_float)

random_float1 = random.uniform(1,10)
print(random_float1)

random_choice = random.choice(["rock", "paper", "scissor"])
print(random_choice)


# Heads or Tails
head_or_tail = ["HEAD", "TAIL"]

random_toss = random.randint(0,1)
if random_toss == 0:
    print(f"You got {head_or_tail[0]}")
else:
    print(f"You got {head_or_tail[1]}")


# Random person to pay:
friends = ['Alice', 'Bob', 'Charlie', 'David', 'Emanuel']
who_is_gonna_pay = random.randint(0, len(friends) - 1)
# random.choice(friends) => to get a random item from the list
print(f"{friends[who_is_gonna_pay]} is gonna pay today!")


# List Operation:
fruits = ["Strawberries", "Apples", "Grapes", "Cherries", "Pears"]
vegetables = ["Spinach", "Tomatoes", "Potatoes"]

dirty_dozen = [fruits, vegetables]

print(dirty_dozen)
print(dirty_dozen[1][1]) # it's like a matrix ( second list's second element! ) - Nested List