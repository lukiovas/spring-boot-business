package Model.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping("/api")
public class ProjectController {

        @Autowired
        private ProjectService projectService;


        @RequestMapping("/Projects")
        public List<ProjectController> getAllProjects() {
            return  projectService.getAllProjects();
        }

        @RequestMapping("/Projects/{id}")
        public Optional<ProjectController> getProject(@PathVariable int id) {
            return projectService.getProject(id);
        }
        @RequestMapping("/Projects/search={id}")
        public List<Model.Project.ProjectController> getProjects(@PathVariable String id) {
            return projectService.getProjects(id);
        }

        @RequestMapping(method= RequestMethod.POST, value="/Projects", consumes = MediaType.APPLICATION_JSON_VALUE)
        public void addProject(@RequestBody Model.Project.ProjectController Project) {
            projectService.createProject(Project);
        }

        @RequestMapping(method=RequestMethod.PUT, value="/Projects/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
        public void updateProject(@RequestBody Model.Project.ProjectController Project, @PathVariable String id) {
            projectService.updateProject(Project, id);
        }

        @RequestMapping(method=RequestMethod.DELETE, value="/Projects/{id}")
        public void deleteProject(@PathVariable int id) {
            projectService.deleteProject(id);
        }
}
