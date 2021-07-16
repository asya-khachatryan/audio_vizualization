import java.util.ArrayList;

public class Group {
    private int id;
    private String name;
    private ArrayList<Object> components;
    private int parentID;

    public Group(int id, String name, int parentID) {
        this.id = id;
        this.name = name;
        this.parentID = parentID;
        this.components = new ArrayList<>();
    }

    public Group(int id, String name) {
        this.id = id;
        this.name = name;
        this.components = new ArrayList<>();
        this.parentID = -1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Object> getComponents() {
        return components;
    }

    public void setComponents(ArrayList<Object> components) {
        this.components = components;
    }

    public int getParentID() {
        return parentID;
    }

    public void setParentID(int parentID) {
        this.parentID = parentID;
    }

    @Override
    public String toString() {
        if (this.parentID < 0) {
            return id + ") " + name.toUpperCase();
        } else {
            return "  - " + id + ". " + name;
        }
    }
}
