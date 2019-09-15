package lb.fantasy.games.leaderboard.api;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import lb.fantasy.games.leaderboard.team.Team;

@Repository
public interface LeaderBoardRepository extends JpaRepository<Team, Long>{

	/*
	 * TODO: this query performance will vary based on database and number of records.
	 * Responsibility to generate rank of individual team can assign to Service layer also.
	 */
	@Query(nativeQuery = true,value = "SELECT captain_id, match_id, team_name, total_score, user_id, vcaptain_id, team_id, DENSE_RANK() OVER(ORDER BY total_score DESC) as rank FROM team ORDER BY rank ASC")
	List<Team> findAllWithRank();
	
}
