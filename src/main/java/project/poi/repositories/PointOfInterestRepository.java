package project.poi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import project.poi.entities.PointOfInterestEntity;

import java.util.List;

public interface PointOfInterestRepository extends JpaRepository<PointOfInterestEntity, Long> {
    @Query("""
            SELECT p FROM PointOfInterestEntity p
            WHERE (p.x >= :xMin AND p.x <= :xMax AND p.y >= :yMin AND p.y <= :yMax)
            """)
    List<PointOfInterestEntity> findNearMe(@Param("xMin") long xMin,
                                           @Param("xMax") long xMax,
                                           @Param("yMin") long yMin,
                                           @Param("yMax") long yMax);
}
