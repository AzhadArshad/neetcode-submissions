# Definition for a pair.
# class Pair:
#     def __init__(self, key: int, value: str):
#         self.key = key
#         self.value = value
class Solution:
    def mergeSort(self, pairs: List[Pair]) -> List[Pair]:
        return self.mergeSortHelper(pairs,0,len(pairs)-1)
    def mergeSortHelper(self,pairs,s,e):
        #base case
        if e-s+1 <= 1:
            return pairs

        #middle index
        m = (s+e)//2

        #sort left side
        self.mergeSortHelper(pairs,s,m)
        #sort right side
        self.mergeSortHelper(pairs,m+1,e)

        #merge
        self.merge(pairs,s,m,e)

        return pairs

    def merge(self,pairs,s,m,e):

        L = pairs[s:m+1]
        R = pairs[m+1:e+1]

        i = 0 #L pointer
        j = 0 #R pointer
        k = s #arr pointer

        while i<len(L) and j<len(R):
            if L[i].key <= R[j].key:
                pairs[k] = L[i]
                i+=1
            else:
                pairs[k] = R[j]
                j+=1
            k+=1

        while i < len(L):
            pairs[k]=L[i]
            i+=1
            k+=1

        while j < len(R):
            pairs[k]=R[j]
            j+=1
            k+=1
        

        
        
        
