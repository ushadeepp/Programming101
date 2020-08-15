def numberOfVowels(s):
    vowels = ['A','E','I','O','U']
    noOfVowels = 0

    for ch in s:
        if ch.upper() in vowels:
            noOfVowels+=1
    
    return noOfVowels

s = 'HEllo'
# s[0] = 'a'

print(numberOfVowels(s))