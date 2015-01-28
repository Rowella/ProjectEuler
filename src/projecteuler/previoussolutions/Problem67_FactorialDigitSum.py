num = 0
sumOfNum = 0
rows = []
newRows = []
for row in open("triangle1.txt"):
    rows.append(row)
for row in rows:
    row = row.strip()
    newRows.append(row.split(" "))

rows = newRows
newRows = []
for row in rows:
    newRowsRow = []
    for num in row:
        newRowsRow.append(int(num))
    newRows.append(newRowsRow)
rows = newRows

oldNumbers = []
oldSums = []
numbers = []
sums = []
possibleNumbers = []
possibleSums = []
def routeCalc (row, numbers, sums):
    print("row:", row)
    print("current Numbers:", numbers)
    print("current Sums", sums)
    oldNumbers = numbers
    oldSums = sums
    possibleNumbers = []
    possibleSums = []
    numbers = []
    sums = []
    for i in range(len(oldNumbers)):
        if oldNumbers[i] == 0:
            possibleNumbers.append(oldNumbers[i])
            possibleSums.append(oldSums[i] + rows[row][oldNumbers[i]])
        elif oldNumbers[i] == len(rows[row])-1:
            possibleNumbers.append(oldNumbers[i]-1)
            possibleSums.append(oldSums[i] + rows[row][oldNumbers[i]-1])
        else:
            possibleNumbers.append(oldNumbers[i])
            possibleSums.append(oldSums[i] + rows[row][oldNumbers[i]])
            possibleNumbers.append(oldNumbers[i]-1)
            possibleSums.append(oldSums[i] + rows[row][oldNumbers[i]-1])
    print("possible Numbers:", possibleNumbers)
    print("possible Sums:", possibleSums)    
    for k in range(len(possibleNumbers)):
         betterNum = True
         if not possibleNumbers[k] in numbers:
             if not possibleNumbers[k] == -1000:
                for j in range(k, len(possibleNumbers)):
                    if possibleNumbers[k] == possibleNumbers[j]:
                         if possibleSums[k] < possibleSums[j]:
                            numbers.append(possibleNumbers[j])
                            sums.append(possibleSums[j])
                            betterNum = False
                            possibleNumbers[j] = -1000
                if betterNum == True:
                        numbers.append(possibleNumbers[k])
                        sums.append(possibleSums[k])
    if row > 0:
        routeCalc(row-1, numbers, sums)
                
for i in range(len(rows[len(rows)-1])-1):
    numbers.append(i)
    sums.append(rows[len(rows)-1][i])
numbers.append(len(rows[len(rows)-1])-2)
sums.append(rows[len(rows)-1][len(rows[len(rows)-1])-1])
routeCalc(len(rows)-2, numbers, sums)
