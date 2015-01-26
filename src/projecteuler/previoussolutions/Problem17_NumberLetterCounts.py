letters = 0
totalLetters = 0

ones = ["", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]
tens = ["", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"]
teens = ["", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"]



for i in range (1, 1001):
    if i%100 in range(11, 20):
        letters += len(teens[int(i%10)])
    else:
        letters += len(ones[int(i%10)])
        letters += len(tens[int(((i%100)-(i%10))/10)])
    if i > 99:
       if i%100 != 0:
           letters += len("and")
       if (i%1000)-(i%100) != 0:
            letters += len("hundred")
            letters += len(ones[int(((i%1000)-(i%100))/100)])
       if i == 1000:
           letters += len("thousand")
           letters += len("one")
    print(i, end= ": ")
    print(letters)
    totalLetters  += letters
    letters = 0

print("=",totalLetters)

