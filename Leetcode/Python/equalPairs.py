"""
Question : 2352. Equal Row and Column Pairs
"""
class Solution:
    def equalPairs(self, grid: List[List[int]]) -> int:
        n=len(grid)
        answer=0
        freq=defaultdict(int)
        for row in grid:
            freq[tuple(row)]+=1
        for i in range(n):
            col=[]
            for j in range(n):
                col.append(grid[j][i])
            answer+=freq[tuple(col)]
        return answer
