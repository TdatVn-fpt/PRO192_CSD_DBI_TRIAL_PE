
package demob7;

public class GenericClass<T> {
    private T n;

    public GenericClass() {
    }

    public GenericClass(T n) {
        this.n = n;
    }

    public T getN() {
        return n;
    }

    public void setN(T n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "GenericClass{" + "n=" + n + '}';
    }
    
    
}
