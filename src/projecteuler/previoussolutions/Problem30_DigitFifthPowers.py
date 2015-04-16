fullSum = 0
for i in range(10, 1000000): #As 9999999 (the number which will have the highest sum of the fifth powers of its digits) can only reach a 6 digit number and any 1 digit numbers will not have a sum
    num = str(i)
    currentSum = 0
    for char in num:
        digit = int(char)
        currentSum += digit**5
    if currentSum == i:
        fullSum += currentSum
print(fullSum)
        
