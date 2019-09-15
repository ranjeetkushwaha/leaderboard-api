package lb.fantasy.games.leaderboard.team;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "team")
public class Team {

	@Id
	@GeneratedValue
	private Long teamId;
	private String teamName;
	private int userId;
	private int matchId;
	private int captainId;
	private int vcaptainId;
	private float totalScore;
	private int rank;

//	@OneToMany(fetch = FetchType.LAZY)
//	@JoinColumn(name="playerId",updatable = false, insertable = false)
//	private Player player;
//	
//	@Column(name="playerId")
//	private Long playerId;

	public Team() {
	}

	public Team(Long id, String name, int userId, int matchId, int captainId, int vcaptainId, float score) {
		super();
		this.teamId = id;
		this.teamName = name;
		this.userId = userId;
		this.matchId = matchId;
		this.captainId = captainId;
		this.vcaptainId = vcaptainId;
		this.totalScore = score;
	}

	public Long getTeamId() {
		return teamId;
	}

	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public int getCaptainId() {
		return captainId;
	}

	public void setCaptainId(int captainId) {
		this.captainId = captainId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getVcaptainId() {
		return vcaptainId;
	}

	public void setVcaptainId(int vcaptainId) {
		this.vcaptainId = vcaptainId;
	}

	public float getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(float totalScore) {
		this.totalScore = totalScore;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	

//	public Long getPlayerId() {
//		return playerId;
//	}
//
//	public void setPlayerId(Long playerId) {
//		this.playerId = playerId;
//	}
//
//	public Player getPlayer() {
//		return player;
//	}
//
//	public void setPlayer(Player player) {
//		this.player = player;
//	}

}
