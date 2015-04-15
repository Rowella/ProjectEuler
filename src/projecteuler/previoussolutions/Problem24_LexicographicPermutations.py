def lexicographicPerm(currentNum, soFar, depth):
    currentSoFar = soFar
    if depth == 9:
        for i in range(10):
            if str(i) not in currentNum:
                currentSoFar += 1
                currentWord = currentNum + str(i)
                #print(currentWord, "depth :", depth)
                if currentSoFar == 1000000:
                    print("Word is:", currentWord)
                    return 5, True
            #print(currentSoFar)
        return currentSoFar, False
    else:
        for i in range(10):
            if str(i) not in currentNum:
                #print(currentNum + str(i), "depth :", depth)
                currentSoFar, done = lexicographicPerm(currentNum + str(i), currentSoFar, depth+1)
                if done == True:
                    return 5, True
        return currentSoFar, False

print(lexicographicPerm("", 0, 0))
input()
