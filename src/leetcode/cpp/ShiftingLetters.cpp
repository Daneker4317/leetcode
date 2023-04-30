#include <bits/stdc++.h>
using namespace std;
class Solution
{
public:
    string shiftingLetters(string S, vector<int> &shifts)
    {
        for (int i = shifts.size() - 2; i >= 0; i--)
        {
            shifts[i] += shifts[i + 1];
            shifts[i] %= 26;
        }
        for (int i = 0; i < S.size(); i++)
        {
            S[i] = (((S[i] - 'a') + shifts[i]) % 26 + 'a');
        }
        return S;
    }
};
main()
{
    vector<int> v = {1, 2, 3};
    Solution ob;
    cout << (ob.shiftingLetters("aaa", v));
}