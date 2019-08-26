package dk.yakose.les.repository.concretes;
import dk.yakose.les.repository.abstracts.HelloRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author yakos
 */
@Repository
public class HelloRepositoryImpl implements HelloRepository {
    @Override
    public String get() {
        return "Hello JUnit 5";
    }
}
