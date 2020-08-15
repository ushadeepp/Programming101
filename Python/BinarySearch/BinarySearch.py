def binarySearch(A,x):

    l=0
    r=len(A)-1

    while(l<=r):
        mid = l + ((r-l)//2)

        if A[mid]==x:
            return mid
        if A[mid] < x:
            l = mid+1
        else:
            r = mid-1
    
    return -1

A = [1,2,4,6,7,9]

print(binarySearch(A,10))