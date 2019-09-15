package lb.fantasy.games.leaderboard;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lb.fantasy.games.leaderboard.api.LeaderBoard;
import lb.fantasy.games.leaderboard.api.LeaderBoardService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LeaderboardApiDataApplicationTests {
	
	@InjectMocks
	LeaderBoardService leaderBoardService;
	
	@Mock
	LeaderBoard leaderBoard;
	
	@Test
	public void insertTeam() {
//		leaderBoardService.addTeam(team)
		
	}
	
	@Test
	public void insertPlayer() {
		
	}
	
	@Test
	public void getAllTeam() {
		
	}
	
	@Test
	public void getAllPlayr() {
		
	}
	
	@Test
	public void getLeaderBoard() {
		
	}
	
	@Test
	public void contextLoads() {
	}

}
