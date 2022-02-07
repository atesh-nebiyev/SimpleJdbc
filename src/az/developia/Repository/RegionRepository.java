package az.developia.Repository;

import az.developia.Region;

import java.util.Optional;

public interface RegionRepository {
    Optional<Region> findById(long id);

    boolean deleteByName(String name);
}
