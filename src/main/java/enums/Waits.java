package enums;

public enum Waits {

    MICRO_WAIT(1),
    SHORT_WAIT(5),
    NORMAL_WAIT(10),
    LONG_WAIT(20);

    private final int seconds;

    Waits(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }
}
