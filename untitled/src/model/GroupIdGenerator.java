package model;

public final class GroupIdGenerator {
    private static int CURRENT = 0;

    public static int getNextIdT() {
        return ++CURRENT;
    }

    private GroupIdGenerator() {
    }
}
