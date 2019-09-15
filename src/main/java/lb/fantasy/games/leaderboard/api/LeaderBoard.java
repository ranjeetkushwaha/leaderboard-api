package lb.fantasy.games.leaderboard.api;

public class LeaderBoard {

	private Long teamId;
	private String teamName;
	private int userId;
	private int matchId;
	private int captainId;
	private int vcaptainId;
	private float totalScore;
	private int rank;

	public LeaderBoard() {
		// TODO Auto-generated constructor stub
	}
	
	public LeaderBoard(long teamId, String name, int userId, int matchId, int captainId, int vcaptionId, float totalScore, int rank){
		super();
		this.teamId=teamId;
		this.teamName=name;
		this.userId=userId;
		this.matchId=matchId;
		this.captainId=captainId;
		this.vcaptainId=vcaptionId;
		this.totalScore=totalScore;
		this.rank=rank;
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

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

}
