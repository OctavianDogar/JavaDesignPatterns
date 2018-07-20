package factory;

public abstract class Page {

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
