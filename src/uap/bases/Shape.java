package uap.bases;

public abstract class Shape {
    protected String name;

    public void setName(String inputName) {
        this.name = inputName;
    }

    public String getName() {
        return name;
    }
    
    public abstract void printInfo();
}