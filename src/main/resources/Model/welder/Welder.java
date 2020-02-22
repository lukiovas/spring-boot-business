package Model.welder;

import Model.Project.ProjectController;

import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
public class Welder extends ProjectController {
    ArrayList<String> skills = new ArrayList<>();

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }
}
