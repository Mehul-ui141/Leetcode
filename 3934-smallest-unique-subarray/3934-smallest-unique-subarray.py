class Solution:
    def smallestUniqueSubarray(self, nums: List[int]) -> int:
        n=len(nums)
        base=max(max(nums),n)+2
        rk=nums[:]
        sa=list(range(n))
        k=1
        while True:
            key=[rk[i]*base+(rk[i+k]+1 if i+k<n else 0) for i in range(n)]
            sa.sort(key=key.__getitem__)
            new=[0]*n
            for i in range(1,n):
                new[sa[i]]=new[sa[i-1]]+(key[sa[i]] != key[sa[i-1]])
            rk=new
            if rk[sa[-1]]==n-1:
                break
            k<<=1
        lcp=[0]*(n+1)
        h=0
        for i in range(n):
            if rk[i]==0:
                h=0
                continue
            j=sa[rk[i]-1]
            while i+h<n and j+h<n and nums[i+h]==nums[j+h]:
                h+=1
            lcp[rk[i]]=h
            if h>0:
                h-=1
        ans=n
        for r in range(n):
            mx=max(lcp[r],lcp[r+1] if r+1<n else 0)
            if mx+1<=n-sa[r]:
                ans=min(ans,mx+1)
        return ans