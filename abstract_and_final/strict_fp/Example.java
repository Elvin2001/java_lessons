package abstract_and_final.strict_fp;

// Strictfp access modifier
public strictfp class Example {
    private float number = 134.33f;

    public float method() {
        float res = number + 234.44f;
        return res;
    }
}
