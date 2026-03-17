class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        res = []
        def dfs(i,cur,total):
            if total == target:
                res.append(list(cur))
                return
            
            if i >= len(candidates) or total > target:
                return
            
            for j in range(i,len(candidates)):
                if (j > i and candidates[j] == candidates[j-1]):
                    continue
                cur.append(candidates[j])                
                dfs(j+1,cur,total+candidates[j])
                cur.pop()
        
        candidates.sort()
        dfs(0,[],0)
        return res