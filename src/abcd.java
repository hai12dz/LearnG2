import java.util.Objects;

public class abcd {
    private String a;
    private String b;
    private int v;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        abcd abcd = (abcd) o;
        return v == abcd.v && Objects.equals(a, abcd.a) && Objects.equals(b, abcd.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, v);
    }





}
