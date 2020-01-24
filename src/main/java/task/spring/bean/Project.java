package task.spring.bean;

public class Project {

    private String name;
    private Developer teamLead;

    public Project() {
    }

    public Project(String name, Developer teamLead) {
        this.name = name;
        this.teamLead = teamLead;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Developer getDeveloper() {
        return teamLead;
    }

    public void setDeveloper(Developer developer) {
        this.teamLead = developer;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", teamLead=" + teamLead +
                '}';
    }
}