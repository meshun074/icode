package com.fdmgroup.icode.library.music;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicService {
	
	@Autowired
	private MusicRepository musicRepository;
	
	public MusicService(MusicRepository musicRepository) {
		super();
		this.musicRepository = musicRepository;
	}

	
	
	public List<Music> findAll() {
		List<Music> music = musicRepository.findAll();
		return music;
	}



    public void addAlbum(Album album) {
		musicRepository.addAlbum(album);
    }



    public void addRecord(Record record) {
		musicRepository.addRecord(record);
    }



	public Music searchByMusicId(Long musicId) {
		Music music = musicRepository.searchByMusicId(musicId);
		return music;
	}

	public void deleteAlbumById(Long musicId) {
		musicRepository.deleteAlbumById(musicId);
	}



	public void updateAlbumDescription(Long musicId, String description) {
		musicRepository.updateAlbumDescription(musicId, description);
	}



	public void updateRecordDescription(Long musicId, String description) {
		musicRepository.updateRecordDescription(musicId, description);
	}



    public List<Music> searchByArtistName(String artistName) {
		List<Music> music = musicRepository.searchByArtistName(artistName);
		return music;
    }



	public List<Music> searchByGenre(String genre) {
		List<Music> music = musicRepository.searchByGenre(genre);
		return music;
	}



	public List<Music> searchByTitle(String title) {
		List<Music> music = musicRepository.searchByTitle(title);
		return music;
	}






}
