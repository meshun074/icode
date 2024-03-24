package com.fdmgroup.icode.library.music;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;





@Controller
@RequestMapping("/library/music")
public class MusicController {

    @Autowired
    private MusicService musicService;

    @Autowired
    private MusicRepository musicRepository;

    public MusicController(MusicService musicService, MusicRepository musicRepository) {
        super();
        this.musicService = musicService;
        this.musicRepository = musicRepository;
    }


    	
@GetMapping("/allMusic")
public String goToAllMusic(Model model) {
		List<Music> music = musicService.findAll();
		model.addAttribute("music", music);
		return "/library/music/allMusic";
}
	
@GetMapping("/createAlbumForm")
public String goToCreateAlbumForm(Model model) {
    model.addAttribute("album", new Album());
    return "/library/music/createAlbum";
}

@PostMapping("/createAlbum")
public String addMusicAlbum(Album album) {
   musicService.addAlbum(album);
   return "redirect:/library/music/allMusic";
}

@GetMapping("/createRecordForm")
public String goToCreateRecordForm(Model model) {
    model.addAttribute("record", new Record());
    return "/library/music/createRecord";
}

@PostMapping("/createRecord")
public String addMusicRecord(Record record) {
   musicService.addRecord(record);
   return "redirect:/library/music/allMusic";
}

@GetMapping("/deleteAlbumForm")
public String goToDeleteAlbumForm() {
    return "/library/music/deleteAlbum";
}

@PostMapping("/deleteAlbumById")
public String postDeleteAlbumById(@RequestParam Long musicId, Model model) {
    Music music = musicService.searchByMusicId(musicId);
    if (music != null) {
        musicRepository.deleteAlbumById(musicId);
        model.addAttribute("message", "Album deleted successfully");
    } else {
        model.addAttribute("errorMessage", "Album not found for ID: " + musicId);
    }
    
    return "redirect:/library/music/allMusic";
}

@GetMapping("/deleteRecordForm")
public String goToDeleteRecordForm() {
    return "/library/music/deleteRecord";
}

@PostMapping("/deleteRecordById")
public String postDeleteRecordById(@RequestParam Long musicId, Model model) {
    Music music = musicService.searchByMusicId(musicId);
    if (music != null) {
        musicRepository.deleteAlbumById(musicId);
        model.addAttribute("message", "Record deleted successfully");
    } else {
        model.addAttribute("errorMessage", "Record not found for ID: " + musicId);
    }
    
    return "redirect:/library/music/allMusic";
}

@GetMapping("/updateAlbumDescriptionForm")
public String goToUpdateAlbumDescriptionForm() {
    return "/library/music/updateAlbumDescriptionById";
}

@GetMapping("/searchAlbumDescription")
public String goToSearchAlbumDescriptionForm(@RequestParam Long musicId, Model model) {
    Album album = (Album) musicService.searchByMusicId(musicId);
    if(album != null) {
        model.addAttribute("album", album);
    } else {
        model.addAttribute("errorMessage", "Album not found for ID: " + musicId);
    }
    return "/library/music/updateAlbumDescriptionById";
}

@PostMapping("/{musicId}/updateAlbumDescription")
public String postUpdateAlbumDescription(@PathVariable Long musicId, @RequestParam String description, Model model) {
    Album album = (Album) musicService.searchByMusicId(musicId);
    musicService.updateAlbumDescription(musicId, description);
    model.addAttribute("album", album);
    return "redirect:/library/music/allMusic";
}


@GetMapping("/updateRecordDescriptionForm")
public String goToUpdateRecordDescriptionForm() {
    return "/library/music/updateRecordDescriptionById";
}

@GetMapping("/searchRecordDescription")
public String goToSearchRecordDescription(@RequestParam Long musicId, Model model) {
    Music music = musicService.searchByMusicId(musicId);
    if(music != null) {
        model.addAttribute("record", music);
    } else {
        model.addAttribute("errorMessage", "Record not found for ID: " + musicId);
    }
    return "/library/music/updateRecordDescriptionById";
}

@PostMapping("/{musicId}/updateRecordDescription")
public String postUpdateRecordDescription(@PathVariable Long musicId, @RequestParam String description, Model model) {
    Record record = (Record)musicService.searchByMusicId(musicId);
    musicService.updateRecordDescription(musicId, description);
    model.addAttribute("record", record);
    return "redirect:/library/music/allMusic";
}

@GetMapping("/searchByGenreForm")
public String goToSearchByAlbumTitleForm() {
    return "/library/music/searchByGenre";
}

@GetMapping("/searchByGenre")
public String searchByGenre(@RequestParam String genre, Model model) {
    List<Music> music = musicService.searchByGenre(genre);
    model.addAttribute("music", music);
    return "/library/music/searchByGenre";
}

@GetMapping("/searchByTitleForm")
public String goToSearchByTitle() {
    return "/library/music/searchByTitle";
}

@GetMapping("/searchByTitle")
public String searchByTitle(@RequestParam String title, Model model) {
    List<Music> music = musicService.searchByTitle(title);
    model.addAttribute("music", music);
    return "/library/music/searchByTitle";
}

@GetMapping("/searchByArtistNameForm")
public String goToSearchByArtistNameForm() {
    return "/library/music/searchByArtistName";
}

@GetMapping("/searchByArtistName")
public String searchByArtistName(@RequestParam String artistName, Model model) {
    List<Music> music = musicService.searchByArtistName(artistName);
    model.addAttribute("music", music);
    return "/library/music/searchByArtistName";
}





}

