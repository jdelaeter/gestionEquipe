package fr.badmintonLeDoulieu.api.repository;

import fr.badmintonLeDoulieu.api.Entity.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<TeamEntity, Long> {
}
