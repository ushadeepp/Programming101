def listRotation(A, d):

    for i in range(d):
        temp=A[0]
        for j in range(len(A)-1):
            A[j]=A[j+1]
        A[len(A)-1]=temp

A = [1,2,3,4,5,6]
print(A)
listRotation(A,3)
print(A)