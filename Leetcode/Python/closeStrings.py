'''
QUESTION 1657: Determine if two strings are close
'''
class Solution:
    def closeStrings(self, word1: str, word2: str) -> bool:
        if len(word1)!=len(word2):
            return False
        str1=Counter(word1)
        str2=Counter(word2)
        if str1==str2:
            return True
        elif Counter(str1.values())==Counter(str2.values()) and Counter(str1.keys())==Counter(str2.keys()):
            return True
        return False
