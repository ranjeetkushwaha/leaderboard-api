package lb.fantasy.games.leaderboard.player;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Player {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String playingStyleDesc;
	private float score;

	public Player() {}
	
	public Player(Long id, String name, String style, float score) {
		super();
		this.id=id;
		this.name=name;
		this.playingStyleDesc=style;
		this.score=score;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlayingStyleDesc() {
		return playingStyleDesc;
	}

	public void setPlayingStyleDesc(String playingStyleDesc) {
		this.playingStyleDesc = playingStyleDesc;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float scroe) {
		this.score = scroe;
	}
}
