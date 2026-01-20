import random

letters = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']
numbers = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']
symbols = ['!', '#', '$', '%', '&', '(', ')', '*', '+']

print("Welcome to the PyPassword Generator!")
nr_letters = int(input("How many letters would you like in your password?\n"))
nr_symbols = int(input(f"How many symbols would you like?\n"))
nr_numbers = int(input(f"How many numbers would you like?\n"))

password_list = []

for letter in range(nr_letters):
    random_item = random.randint(0, 51)
    password_list.append(letters[random_item])

for symbol in range(nr_symbols):
    random_item = random.randint(0, 8)
    password_list.append(symbols[random_item])

for number in range(nr_numbers):
    random_item = random.randint(0, 9)
    password_list.append(numbers[random_item])

print(password_list)

# Shuffle
random.shuffle(password_list)
print(password_list)
# END




# String version (Using the declared lists of numbers, symbols and letters)
password_string = ""

for i in range(nr_letters):
    password_string += random.choice(letters)

for i in range(nr_symbols):
    password_string += random.choice(symbols)

for i in range(nr_numbers):
    password_string += random.choice(numbers)

print(password_string)

shuffled_list = list(password_string) # Strings are immutable.
# print(shuffled_list) # So we created this list to use the shuffle function
random.shuffle(shuffled_list)
shuffled_string = ''.join(shuffled_list)
print(shuffled_string)
