package Model.Project;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface ProjectRepository extends CrudRepository<Model.Project.ProjectController, String> {

    Optional<Model.Project.ProjectController> findById(int id);
    @Transactional
    Optional<Model.Project.ProjectController> deleteById(int id);

    @Query(value = "FROM ProjectController e WHERE \n" +
            "e.name LIKE %:searchTerm% " )
    List<Model.Project.ProjectController> findBySearchTermNative(@Param("searchTerm") String searchTerm);
}