def printEqualParts(s,n):
    l=len(s)

    if l%n!=0:
        print("String cannot be divided eqaul")
        return 
    
    for i in range(l//n):
        print(s[n*i:n*(i+1)])

printEqualParts('abcdef',2)