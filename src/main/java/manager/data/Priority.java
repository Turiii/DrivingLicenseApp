package manager.data;

public enum Priority {
    HIGH(3),NORMAL(2),LOW(1);
    private final int value;

    Priority(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
