package com.spring.music.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;

import com.spring.music.model.Song;
import com.spring.music.repository.MongoDbRepository;

// annotation to define controller
@Controller
public class HomeController {

    // annotation to inject the repository
    @Autowired
    private MongoDbRepository mongoRepo;

    
    @GetMapping("/songs")
    public String showSongs(Model model) {
        List<Song> songs = mongoRepo.findAll();
        model.addAttribute("songs", songs);
        return "songs";
    }

    @GetMapping("/songs/new-song")
    public String newSongForm(Model model) {
        model.addAttribute("song", new Song());  
        return "new-song";
    }
    

    @PostMapping("/songs")
    public String addSong(@ModelAttribute Song song) {  
        mongoRepo.save(song);  
        return "redirect:/song";  
    }
}
