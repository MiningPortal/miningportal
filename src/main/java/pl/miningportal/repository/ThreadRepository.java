package pl.miningportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.miningportal.domain.Thread;

public interface ThreadRepository extends JpaRepository<Thread, Long> {

}
