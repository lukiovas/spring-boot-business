package Model.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    public ProjectRepository projectRepository;

    public List <ProjectController> getAllProjects() {

        List<Model.Project.ProjectController> Projects = new ArrayList<>();
        projectRepository.findAll()
                .forEach(Projects::add);
        return Projects;
    }

    public List<Model.Project.ProjectController> getProjects(String id) {

        List <Model.Project.ProjectController> Projects = new ArrayList<>();
        projectRepository.findBySearchTermNative(id)
                .forEach(Projects::add);
        return Projects;
    }


    public Optional<Model.Project.ProjectController> getProject(int id) {
        return projectRepository.findById(id);
    }


    public void createProject(@Valid Model.Project.ProjectController Project) {
        projectRepository.save(Project);
    }

    public void updateProject(@Valid Model.Project.ProjectController Project, String id) {
        projectRepository.save(Project);

    }

    public void deleteProject(int id) {

        projectRepository.deleteById(id);
    }
}
