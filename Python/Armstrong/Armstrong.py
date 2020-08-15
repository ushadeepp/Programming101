
def orderNumber(n): #153
    noOfDigits=0 #

    while n>0: # 0 >0
        noOfDigits+=1 # 3
        n=n//10 # 1//10 =0

    return noOfDigits


def sumOfPowers(n,o): # 153,3
    powerSum=0 # 153

    while n>0: # 0 > 0
        digit = n%10 # 1
        powerSum += digit**o # 1 ** 3 1
        n//=10 # 1 //10 = 
    
    return powerSum


def isArmStrong(n): # 153
    order=orderNumber(n) #3
    powerSum = sumOfPowers(n,order) #153

    return powerSum==n


print(isArmStrong(371))