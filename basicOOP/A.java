package basicOOP;
import java.util.Objects;

public class A {
    private int aInt;
    private String aString;

    public A(int aInt, String aString){
        this.aInt = aInt;
        this.aString = aString;
    }

    public int getAInt() {
        return this.aInt;
    }

    public void setAInt(int aInt) {
        this.aInt = aInt;
    }

    public String getAString() {
        return this.aString;
    }

    public void setAString(String aString) {
        this.aString = aString;
    }

    public A aInt(int aInt) {
        setAInt(aInt);
        return this;
    }

    public A aString(String aString) {
        setAString(aString);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof A)) {
            return false;
        }
        A a = (A) o;
        return aInt == a.aInt && Objects.equals(aString, a.aString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aInt, aString);
    }

    @Override
    public String toString() {
        return "A {" +
            " aInt='" + getAInt() + "'" +
            ", aString='" + getAString() + "'" +
            "}";
    }
    
}
