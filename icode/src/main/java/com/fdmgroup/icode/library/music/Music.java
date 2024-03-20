package com.fdmgroup.icode.library.music;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public abstract class Music {
	
	private Long musicId;

	
	private static Long nextId = 600000L;
	
	public Music() {
		this.musicId = generateUniqueId();
		
	}

	public Long getMusicId() {
		return musicId;
	}

	public void setMusicId(Long id) {
		musicId = id;
	}

	public Long generateUniqueId() {
		nextId += 4;
		return nextId;
	}

	public abstract String getType();

    public abstract String getArtistName();

	public abstract String getGenre();

    public abstract String getDescription();

	public abstract String getTitle();

	

}
