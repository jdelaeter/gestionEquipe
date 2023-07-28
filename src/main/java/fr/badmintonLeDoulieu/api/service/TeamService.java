package fr.badmintonLeDoulieu.api.service;

import fr.badmintonLeDoulieu.api.Entity.TeamEntity;
import fr.badmintonLeDoulieu.api.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class TeamService {

    private final TeamRepository teamRepository;

    @Autowired
    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public List<TeamEntity> findAll(){
        return teamRepository.findAll();
    }

    public TeamEntity findById(Long id){
        Optional<TeamEntity> result = teamRepository.findById(id);

        TeamEntity teamEntity = null;

        if(result.isPresent()){
            teamEntity = result.get();
        }
        else{
            throw new RuntimeException("Il y a pas Id :(" + id);
        }
        return teamEntity;
    }

    public TeamEntity insertTeam(TeamEntity teamEntity){
        return teamRepository.save(teamEntity);
    }

    public void deleteById(Long deleteId){
        teamRepository.deleteById(deleteId);
    }
}
