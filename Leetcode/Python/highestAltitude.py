'''
  QUESTION: 1732. Find the Highest Altitude
'''
class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        altitude=0
        answer=0
        for i in gain:
            altitude+=i
            answer=max(answer,altitude)
        return answer
