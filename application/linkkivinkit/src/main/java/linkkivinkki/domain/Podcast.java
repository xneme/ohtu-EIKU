package linkkivinkki.domain;

public class Podcast extends Item {
    private String name;

    public Podcast(String name, String title, String description) {
        super(title, description);
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getId() + " " + name + " - " + this.getTitle() + "\n" + getDescription();
    }
}