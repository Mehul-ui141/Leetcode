class Solution:
    def findSubtreeSizes(self, parent: List[int], s: str) -> List[int]:
        n=len(parent)
        adj=[[] for _ in range(n)]
        tree=[[] for _ in range(n)]
        ans=[0]*n
        last=[-1]*26
        for i in range(1, n):
            adj[parent[i]].append(i)
        def dfs(u):
            c=ord(s[u])-ord('a')
            old=last[c]
            if u and old !=-1:
                parent[u]=old
            last[c] = u
            for v in adj[u]:
                dfs(v)
            last[c]=old
        def calc(u):
            ans[u]=1
            for v in tree[u]:
                ans[u]+=calc(v)
            return ans[u]
        dfs(0)
        for i in range(1,n):
            tree[parent[i]].append(i)
        calc(0)
        return ans