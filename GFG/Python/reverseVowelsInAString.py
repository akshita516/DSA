'''Reverse vowels present in a string'''
class Solution:
    def reverseVowels(self, s: str) -> str:
        vowels=['A','E','I','O','U','a','e','i','o','u']
        reverseVowels=[]
        answer=""
        for ch in s:
            if ch in vowels:
                reverseVowels.append(ch)
        i=len(reverseVowels)-1
        for ch in s:
            if ch in vowels:
                '''if ch.isupper():
                    answer+=reverseVowels[i].upper()
                else:'''
                answer+=reverseVowels[i]
                i-=1
            else:
                answer+=ch
        return answer
            
