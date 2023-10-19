package definingClasses.google;

public class Children extends Person {

        private String childrenName;
        private String childrenBirthday;
        public Children(String childrenName, String childrenBirthday, String name){
            super(name);
            this.childrenName = childrenName;
            this.childrenBirthday = childrenBirthday;
        }
}
