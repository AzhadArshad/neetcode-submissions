class Solution:
    def isPalindrome(self, s: str) -> bool:

        string = ''.join(c.lower() for c in s if c.isalnum())

        i , j = 0,len(string)-1

        while i < j:
            if string[i] != string[j]:
                return False
            i += 1
            j -= 1
        return True

        