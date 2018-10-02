package com.example.album.controller;

import com.example.album.entity.Album;
import com.example.album.service.AlbumService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/album")
public class AlbumController {
    @Resource
    private AlbumService albumService;

    @GetMapping("/all")
    public List<Album> getAlbums(){
        return albumService.getAll();
    }

    @GetMapping("/{id}")
    public Album getIDAlbum(@PathVariable Integer id) {
        return albumService.get(id);
    }
}
