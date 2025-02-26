package lesson10;

class Designer extends Employee {
    private String designTool;

    public Designer(String name, int id, String designTool) {
        super(name, id);
        this.designTool = designTool;
    }

    @Override
    void work() {
        System.out.println(name + " is designing using " + designTool + ".");
    }

    public void createMockups() {
        System.out.println(name + " is creating mockups for a new project.");
    }
}