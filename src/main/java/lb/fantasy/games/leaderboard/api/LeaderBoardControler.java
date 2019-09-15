package lb.fantasy.games.leaderboard.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lb.fantasy.games.leaderboard.player.Player;
import lb.fantasy.games.leaderboard.team.Team;

@RestController
@RequestMapping("/")
public class LeaderBoardControler {

	@Autowired
	private LeaderBoardService leaderBoardService;
	
	@RequestMapping("api/v1/leaderboard")
	public List<LeaderBoard> leaderBoard() {
		return leaderBoardService.getLeaderBoard();		
	}
	
	@RequestMapping("api/v1/team")
	public List<Team> getTeam() {
		return leaderBoardService.getTeamList();		
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "api/v1/team")
	public Team addTeam(@RequestBody Team team) {
		return leaderBoardService.addTeam(team);		
	}
	
	@RequestMapping("api/v1/player")
	public List<Player> getPlayer() {
		return leaderBoardService.getPlayers();		
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "api/v1/player")
	public Player addPlayer(@RequestBody Player player) {
		return leaderBoardService.addPlayer(player);		
	}
}
