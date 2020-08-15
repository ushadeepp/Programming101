def countFreq(A):
    freq={}

    for i in A:
        print('------')
        print(i)
        print(freq)
        if i in freq:
            freq[i]+=1
        else:
            freq[i]=1
        print(freq)

    for k in freq:
        print("key:"+str(k)+" freq:"+str(freq[k]))


A = [1,1,2,4,5,2,2]

countFreq(A)