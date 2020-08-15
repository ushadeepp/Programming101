def printInitials(s):
    names = s.split()

    res = ''

    for i in range(len(names)-1):
        res+=names[i][0].upper()
        res+='.'
    
    res+=names[-1]

    return res


print(printInitials('mahendra singh dhoni'))