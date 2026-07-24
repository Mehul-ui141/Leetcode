class Solution:
    def uniqueXorTriplets(self, nums: List[int]) -> int:
        Max=2048
        p=[False]*Max
        t=[False]*Max
        n=len(nums)
        for i in range(n):
            for j in range(i, n):
                p[nums[i]^nums[j]]=True
        for x in range(Max):
            if not p[x]:
                continue
            for v in nums:
                t[x^v]=True
        return sum(t)