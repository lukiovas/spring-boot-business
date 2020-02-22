package Model.employee;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import javax.transaction.Transactional;

public interface EmployeeRepository extends CrudRepository<Employee, String> {

    Optional<Employee> findById(int id);
    @Transactional
    Optional<Employee> deleteById(int id);

    @Query(value = "FROM EmployeeController e WHERE \n" +
            "e.name LIKE %:searchTerm% " )
    List<Employee> findBySearchTermNative(@Param("searchTerm") String searchTerm);
}