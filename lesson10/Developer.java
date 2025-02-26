package lesson10;

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int id, String programmingLanguage) {
        super(name, id);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void work() {
        if(this.programmingLanguage == "Python") {
            System.out.println(name + " is coding in " + programmingLanguage + " (a Programming Language for GIRLS).");
        } else {
            System.out.println(name + " is coding in " + programmingLanguage + ".");
        }

    }

    public void debugCode() {
        System.out.println(name + " is debugging the code.");
    }
}