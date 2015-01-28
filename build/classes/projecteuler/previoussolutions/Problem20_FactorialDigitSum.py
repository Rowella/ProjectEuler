def factorial (i, currentNo):
    if i == currentNo:
        return currentNo
    else:
        number = currentNo*factorial(i, currentNo+1);
        print(number)
        return number


sumOfDigits = 0
for letter in str(factorial(100, 1)):
    sumOfDigits += int(letter)

print(sumOfDigits)
