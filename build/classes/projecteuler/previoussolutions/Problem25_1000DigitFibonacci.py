

found = False
previousNum = 0
num = 1
i = 1
while not found:
    previousNum, num = num, num+previousNum
    numWord = str(num)
    i += 1
    if len(numWord) == 1000:
        print(i)
        found = True
