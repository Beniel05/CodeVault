# XOR to find the single number
a = [1,1,44,55,44,33,33]
result = 0
for i in a:
    result ^= i
print(result)