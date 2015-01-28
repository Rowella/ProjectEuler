numList = []
sumOfNums = 0
while True:
    num = input("> ")
    if num == "stop":
        break
    else:
        numList.append(num)
for item in numList:
    sumOfNums += int(item)
print(sumOfNums)
