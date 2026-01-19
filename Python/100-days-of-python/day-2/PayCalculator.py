# print("Hello"[-1])
#
# print(type("String"))
# print(type(123))
# print(type(12.3))
# print(type(True))
#
# print("Number of letters in your name: " + str(len(input("Enter your name: "))))

# print(3 * (3 + 3) / 3 - 3)

# print(3 ** 2)
# print(3 * 2)


# score = 0
# score += 1
# print(score)

# score = 10
# name = 'ben'
# print(f"Your name is {name} and your score is {score}!")


# print("Welcome to the tip calculator!")
# total_bill = int(input("What was the total bill? $"))
# tip = int(input("How much tip would you like to give? 10, 12, or 15? "))
# total_people = int(input("How many people to split the bill? "))
# print("Each person should pay: $", (total_bill + tip) / total_people)

# age = 12
# print(f"You are {age} years old")


# print("Welcome to the tip calculator!")
# total_bill = float(input("What was the total bill? $"))
# # tips are in percentage -> 12 = 0.12
# tip = int(input("How much tip would you like to give? 10, 12 or 15? "))
# total_people = int(input("How many people to split the bill? "))
#
# bill_with_tip = total_bill + (total_bill * tip / 100)
#
# price_for_each_person = round(bill_with_tip / total_people, 2)
#
# print(f"Each person should pay: ${price_for_each_person}")


print("Welcome to the tip calculator!")
bill = float(input("What was the total bill? $"))
tip = int(input("How much tip would you like to give? 10, 12 or 15? "))
people = int(input("How many people to split the bill? "))
tip_percentage_value = tip / 100
bill_with_tip_percent = bill + (bill * tip_percentage_value)
per_person = bill_with_tip_percent / people
print(f"Each person should pay: ${round(per_person, 2)}")

# Final Output;
# What was the total bill? $124.56
# How much tip would you like to give? 10, 12 or 15? 12
# How many people to split the bill? 7
# Each person should pay: $19.93

# bill = 150
# tip = bill * 1.12
# print(round(tip, 2))

# just_print_this = "hello"
# print(just_print_this)