package lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private List<Human> children;
    private Pet pet;

    // Static block
    static {
        System.out.println("Loading class: Family");
    }

    // Non-static block
    {
        System.out.println("Creating new Family object");
    }

    // Constructor
    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new ArrayList<>();
        mother.setFamily(this);
        father.setFamily(this);
    }

    // Getters & Setters
    public Human getMother() { return mother; }
    public void setMother(Human mother) { this.mother = mother; }

    public Human getFather() { return father; }
    public void setFather(Human father) { this.father = father; }

    public List<Human> getChildren() { return children; }

    public Pet getPet() { return pet; }
    public void setPet(Pet pet) { this.pet = pet; }

    // Methods
    public void addChild(Human child) {
        children.add(child);
        child.setFamily(this);
    }

    public boolean deleteChild(int index) {
        if (index >= 0 && index < children.size()) {
            children.get(index).setFamily(null);
            children.remove(index);
            return true;
        }
        return false;
    }

    public int countFamily() {
        return 2 + children.size();
    }

    // equals & hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;
        Family family = (Family) o;
        return mother.equals(family.mother) && father.equals(family.father) && children.equals(family.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father, children);
    }

    // toString
    @Override
    public String toString() {
        return String.format("Family{mother=%s, father=%s, children=%s, pet=%s}", mother, father, children, pet);
    }
}
