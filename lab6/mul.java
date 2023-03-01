
class mul {
    int a, b;
    float c, d;

    void multi(int a1, int a2) {
        a = a1;
        b = a2;
        System.out.println("Multiplication is(int) :" + a * b);
    };

    void multi(float b1, float b2) {
        c = b1;
        d = b2;
        System.out.println("Multiplication is(float) :" + c * d);
    };
}