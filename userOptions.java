package Phase3;

public enum  userOptions {
    chef, student;

    private userOptions() {
    }

    public String choice() {
        return name();
    }

    public static userOptions fromvalue(String choice) {
        return valueOf(choice);
    }
}
