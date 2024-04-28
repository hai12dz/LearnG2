import java.util.Objects;

public class ahsihd {
    private String a;
    public int abc;

    public ahsihd(String a, int abc) {
        this.a = a;
        this.abc = abc;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public int getAbc() {
        return abc;
    }

    public void setAbc(int abc) {
        this.abc = abc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ahsihd ahsihd = (ahsihd) o;
        return abc == ahsihd.abc && Objects.equals(a, ahsihd.a);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, abc);
    }
}
