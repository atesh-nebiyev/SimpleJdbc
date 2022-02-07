package az.developia.Repository;

import az.developia.Job;

import java.util.List;
import java.util.Optional;

public interface JobRepository {
    List<Job> findAll();

    Job save(Job j);

    Optional<Job> finfByTitlt(String title);
}
