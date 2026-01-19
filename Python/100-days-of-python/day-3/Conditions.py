# height = int(input("Enter your height in cm: "))
# print(height)

# height_input = input("Enter your height in cm: ")
# if height_input.endswith("cm"):
#     height_input = height_input.replace("cm", "")
# height = int(height_input)
# print(height)


# height_input = input("Enter your height in cm: ").lower().strip()
# height_input = height_input.replace("cm", "")
# if height_input.isdigit():
#     height = int(height_input)
#     print(height)
# else:
#     print("Please enter a valid number")


# Roller Coaster:

# print("Welcome to the theme park!")
# height = int(input("Enter your height in cm: "))
#
# if height >= 120:
#     print("You are allowed to take a ride in the roller coaster")
# else:
#     print("You have to grow to take a roller coaster ride.")


# Odd or Even:

# num = int(input("Enter a number: "))
# if num % 2 == 0:
#     print("The given number", num, "is EVEN!")
# else:
#     print("The given number", num, "is ODD!")


# Roller Coaster pricing with nested loop:
#
# height = int(input("Enter your height in cm: "))
# bill = 0
# if height >= 120:
#     print("You can ride the rollercoaster!")
#     age = int(input("Enter your age: "))
#     if age < 12:
#         bill = 5
#         print("You have to pay $5.")
#     elif 12 >= age <= 18:
#         bill = 7
#         print("You have to pay $7.")
#     elif 45 <= age <= 55:
#         print("Everything is going to be Okay. Have a free ride!")
#     else:
#         bill = 12
#         print("You have to pay $12.")
#     want_photo = input("Do you want photos? type y for yes, and n for no: ")
#     if want_photo == 'y':
#         bill += 3
#     print(f"Your final bill amount is ${bill}")
# else:
#     print("Sorry! you cannot have a ride in the rollercoaster")


# Pizza order

# print("Welcome to Python Pizza Deliveries!")
# size = input("What size pizza do you want? S, M or L: ")
# pepperoni = input("Do you want pepperoni on your pizza? Y or N: ")
# extra_cheese = input("Do you want extra cheese? Y or N: ")
#
# bill = 0
#
# if size == 'S':
#     bill = 15
# elif size == 'M':
#     bill = 20
# elif size == 'L':
#     bill = 25
# else:
#     print("You entered a wrong input!.")
#
# if pepperoni == 'Y':
#     if size == 'S':
#         bill += 2
#     else:
#         bill += 3
#
# if extra_cheese == 'Y':
#     bill += 1
#
# print(f"Your final bill amount is ${bill}")


a = 5
print(not a)

print(1_000_000)