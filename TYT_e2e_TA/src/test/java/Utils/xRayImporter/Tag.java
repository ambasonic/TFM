package Utils.xRayImporter;

public class Tag {

    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Tag{" +
            "name='" + name + '\'' +
            ", type='" + type + '\'' +
            '}';
    }

}
