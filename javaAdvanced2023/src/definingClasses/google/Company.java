package definingClasses.google;

public class Company extends Person{

        private String companyName;
        private String department;
        private double salary;

        public Company(String companyName, String department,
                       double salary, String name){
            super(name);
            this.companyName = companyName;
            this.department = department;
            this.salary = salary;
        }
    }

