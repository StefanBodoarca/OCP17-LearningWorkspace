package interfacemembers.default_methods;

public interface Walk {
    public default int getSpeed() {
        return 5;
    }
}
