package Model.Draft;

import Model.Draft.Draft;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface DraftRepository extends CrudRepository<Draft, String> {

    Optional<Draft> findById(int id);
    @Transactional
    Optional<Draft> deleteById(int id);

    @Query(value = "FROM DraftController e WHERE \n" +
            "e.name LIKE %:searchTerm% " )
    List<Draft> findBySearchTermNative(@Param("searchTerm") String searchTerm);
}