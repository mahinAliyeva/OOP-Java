package lesson10;

class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int id, int teamSize) {
        super(name, id);
        this.teamSize = teamSize;
    }

    @Override
    void work() {
        System.out.println(name + " is managing a team of " + teamSize + " employees.");
    }

    public void conductMeeting() {
        System.out.println(name + " is conducting a team meeting.");
    }
}