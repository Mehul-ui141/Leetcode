class Solution:
    def numOfWays(self, nums: List[int]) -> int:
        n=len(nums)
        ans=[-1]*(n+2)
        for t,x in enumerate(nums):
            ans[x]=t
        sizes,st=1,[0]
        for v in range(1,n+2):
            while ans[st[-1]]>ans[v]:  
                st.pop()
                sizes*=v-st[-1]-1
            st.append(v)
        return (factorial(n)//sizes-1) % (10**9+7)