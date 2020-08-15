def printMinMax(A):
    minList=A[0]
    maxList=A[0]


    for i in range(len(A)):
        if minList > A[i]:
            minList = A[i]
        if maxList < A[i]:
            maxList = A[i]
    
    print("min:"+str(minList))
    print("max:"+str(maxList))

    A[0]=-1

A = [3,5,12,6,1,7]

print(A)
printMinMax(A)
print(A)
