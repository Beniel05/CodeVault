mylist = ['a','b','c','d','e']
myorder = [3,2,0,1,4]
mylist = [mylist[i] for i in myorder]
print(mylist)

fruits = ['apple', 'grape', 'orange']
for fruit in fruits:
    print(fruit)
print(fruits)

marks = [100, 80, 58, 98, 39]

# Total Sum:
# Pythonic way
print(sum(marks))
# or
total = 0
for mark in marks:
    total += mark
print(total)

# Highest Score:
print(max(marks))
# or
highest = 0
for mark in marks:
    if mark > highest:
        highest = mark
print(highest)


# Adding natural numbers;
num = 0
count = 1
while count <= 100:
    num += count
    count += 1
print(num)

# another type using formula
# n * (n + 1) / 2
n = int(input("Enter the end number: "))
print(n * (n + 1) / 2) # Inclusive that ending number
print(n * (n - 1) / 2) # Exclusive that ending number


# Range function with for loop
for i in range (1,11,2): # Initial value, Final value + 1, Step up (optional)
    print(i)
# Adding 1 to 100 using for loop and range:
final_sum = 0
for i in range(1, 101):
    final_sum += i
print(final_sum)