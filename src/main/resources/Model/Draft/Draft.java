package Model.Draft;

import Model.Project.ProjectController;
import Model.constructor.Constructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Draft {
    @Id
    @GeneratedValue
    int Id;
    @OneToOne
    ProjectController project;
    @OneToMany
    Constructor constructor;
}
