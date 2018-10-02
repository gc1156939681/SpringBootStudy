package com.example.spring_data_jpa.controller;

import com.example.spring_data_jpa.entity.Album;
import com.example.spring_data_jpa.service.AlbumService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by guocui on 2018/9/29.
 */
@RestController
@CrossOrigin
@RequestMapping(value = "album")
public class AlbumController {
    @Resource
    private AlbumService albumService;



    @GetMapping("/list")
    public List<Album> findHotAlbums(){
        return albumService.findHotAlbums();
    }

    @GetMapping("/all")
    public List<Album> getAlbums(){
        return albumService.getAll();
    }

    @GetMapping("/{id}")
    public Album getIDAlbum(@PathVariable Integer id){
        return albumService.get(id);
    }

}
