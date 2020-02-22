package Model.Project;

import Model.Draft.Draft;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Id;
    String name;
    @ManyToMany(targetEntity = Model.Project.Project.class)
    private List<Model.Project.Project> Projects = new ArrayList<>();
    @OneToOne
    private Draft draft;
    double materialCost;
    double price;
    int startDate;
    int endDate;
    String currentStage;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Model.Project.Project> getProjects() {
        return Projects;
    }

    public void setProjects(List<Model.Project.Project> Projects) {
        this.Projects = Projects;
    }

    public Draft getDraft() {
        return draft;
    }

    public void setDraft(Draft draft) {
        this.draft = draft;
    }

    public double getMaterialCost() {
        return materialCost;
    }

    public void setMaterialCost(double materialCost) {
        this.materialCost = materialCost;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public String getCurrentStage() {
        return currentStage;
    }

    public void setCurrentStage(String currentStage) {
        this.currentStage = currentStage;
    }

    public Project(String name, double price, int startDate, String currentStage) {
        this.name = name;
        this.price = price;
        this.startDate = startDate;
        this.currentStage = currentStage;
    }
}
