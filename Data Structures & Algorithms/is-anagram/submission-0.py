class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        is_same = sorted(s.lower())==sorted(t.lower())
        return is_same