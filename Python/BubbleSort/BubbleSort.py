def BubbleSort(A):

    for i in range(len(A)):
        print('------')
        for j in range(len(A)-i-1):
            print(A[j], end=" ")
            print(A[j+1])
            print(A)
            if A[j]>A[j+1]:
                A[j],A[j+1]=A[j+1],A[j]
            print(A)

A = [6,4,2,9,1]

BubbleSort(A)

print(A)