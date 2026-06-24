class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:
        res=[]
        for x in asteroids:
            while res and x<0<res[-1]:
                if -x>res[-1]:
                    res.pop()
                    continue
                elif -x==res[-1]:
                    res.pop()
                break
            else:
                res.append(x)
        return res