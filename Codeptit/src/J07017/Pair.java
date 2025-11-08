package J07017;

public class Pair<S, T> {
    private S first;
    private T second;

    public Pair(S first, T second) {
        this.first = first;
        this.second = second;
    }

    public boolean check(int n) {
        int sqr = (int)Math.sqrt(n);
        for (int i = 2; i <= sqr; ++i) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public boolean isPrime() {
        return check((Integer) this.first) && check((Integer)this.second);
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.first, this.second);
    }

}
