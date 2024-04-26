import java.util.Objects;

public class a {
private String a;

public a(){
    System.out.printf("sdad");

}

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        a a1 = (a) o;
        return Objects.equals(a, a1.a);
    }


    @Override
    public int hashCode() {
        return Objects.hashCode(a);
    }
}
