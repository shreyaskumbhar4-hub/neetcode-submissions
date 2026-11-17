class Solution {
public:
    bool isAnagram(string s, string t) {
    sort(s.begin(), s.end());
    sort(t.begin(), t.end());
    
    bool is_same = (s == t);
    return is_same;
    }
};
