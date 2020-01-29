int n,r;
int reverseInteger(int x) {
    n= x<0?x*-1:x;
    r=Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString());
    return x<0?r*-1:r;
}
