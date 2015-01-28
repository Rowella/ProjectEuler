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
    
def routeCalc(row, num):
    if row == len(rows)-1:
        if num == (len(rows[row]) -1):
            return int(rows[row][num])
        return int(max(rows[row][num], rows[row][num+1]))
    else:
        return int(max(routeCalc(row+1, num), routeCalc(row+1, num+1)) + int(rows[row][num].strip()))



print (routeCalc(0,0))
