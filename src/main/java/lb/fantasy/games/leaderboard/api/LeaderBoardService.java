package lb.fantasy.games.leaderboard.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import lb.fantasy.games.leaderboard.player.Player;
import lb.fantasy.games.leaderboard.player.PlayerRepository;
import lb.fantasy.games.leaderboard.team.Team;
import lb.fantasy.games.leaderboard.team.TeamRepository;
import lb.fantasy.games.leaderboard.team.TeamSortRepository;

@Service
public class LeaderBoardService {
	
	@Autowired
	private TeamRepository teamRepository;
	
	@Autowired
	private TeamSortRepository teamsortRepository;
	
	@Autowired
	private PlayerRepository playerRepository;
	
	@Autowired
	private LeaderBoardRepository leaderBoardRepository;

	public List<Team> getTeamList(){
		List<Team> teamList=new ArrayList<Team>();
		teamsortRepository.findAll(Sort.by(Sort.Direction.ASC, "rank")).forEach(teamList::add);
		return teamList;

	}
	
	public List<LeaderBoard> getLeaderBoard(){
		List<Team> teamList=new ArrayList<Team>();
		List<LeaderBoard> leaderBoard=new ArrayList<LeaderBoard>();
		teamList=leaderBoardRepository.findAllWithRank();
		for (Team team : teamList) {
			leaderBoard.add(new LeaderBoard(team.getTeamId(), team.getTeamName(), team.getUserId(), team.getMatchId(), team.getCaptainId(), team.getVcaptainId(), team.getTotalScore(), team.getRank()));
		}
		return leaderBoard;

	}
	public Team addTeam(Team team) {
		return teamRepository.save(team);
	}
	
	public List<Player> getPlayers(){
		List<Player> playerList=new ArrayList<Player>();
		playerRepository.findAll().forEach(playerList::add);
		return playerList;

	}
	
	public Player addPlayer(Player player) {
		return playerRepository.save(player);
	}

}
