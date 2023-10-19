package definingClasses.google;

public class Parents extends Person{
    private String parentName;
    private String parentBirthday;

    public Parents(String parentName, String parentBirthday, String name) {
        super(name);
        this.parentName = parentName;
        this.parentBirthday = parentBirthday;
    }
}