package com.example.album.service.Impl;

import com.example.album.dao.AlbumRepository;
import com.example.album.entity.Album;
import com.example.album.service.AlbumService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {
    @Resource
    private AlbumRepository albumRepository;
    @Override
    public List<Album> getAll() {
        return albumRepository.findAll();
    }

    @Override
    public Album get(int id) {
        return albumRepository.findById(id).get();
    }

    @Override
    public List<Album> getHotAlbums() {
        return albumRepository.findHotAlbum();
    }
}
