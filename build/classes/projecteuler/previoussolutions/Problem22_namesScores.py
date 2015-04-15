nameList = open("names.txt").read()
nameList = nameList.replace('"', "")
names = nameList.split(',')
names.sort()
fullSum = 0
for i in range(len(names)):
    sumOfLetters = 0
    for letter in names[i]:
        sumOfLetters += ord(letter)-64
    fullSum += sumOfLetters*(i+1)
print(fullSum)
