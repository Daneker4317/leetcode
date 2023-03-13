class DivideTwoIntegers {
public:
    int divide(int dividend, int divisor) {
         if (dividend == INT_MIN) {
        if (divisor == -1) {
            return INT_MAX;
        }
        if (divisor == INT_MIN) {
            return 1;
        }
    }
    if (divisor == INT_MIN) {
        if (dividend == INT_MIN) {
            return 1;
        }
    }
        long long res = dividend / divisor;
        return res;
    }
    
};