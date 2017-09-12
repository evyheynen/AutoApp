package be.vdab.auto;

public class Motor {
    public static final int MAX_TOERENTAL = 5800;
    private int toerental;

    public Motor() {
    }

    public int getToerental() {
        return toerental;
    }

    public void setToerental(int toerental) {
        this.toerental = toerental <= MAX_TOERENTAL ? toerental : MAX_TOERENTAL;
    }

    public void verhoogdToerental(int waarde) {
        this.setToerental(getToerental() + waarde);
    }
}



