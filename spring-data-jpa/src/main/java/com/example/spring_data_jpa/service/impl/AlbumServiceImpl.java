package com.example.spring_data_jpa.service.impl;

import com.example.spring_data_jpa.dao.AlbumRepository;
import com.example.spring_data_jpa.entity.Album;
import com.example.spring_data_jpa.service.AlbumService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by guocui on 2018/9/29.
 */
@Service
public class AlbumServiceImpl implements AlbumService {
    @Resource
    private AlbumRepository albumRepository;

    @Override
    @Transactional
    public Album save(Album album) {
        return albumRepository.save(album);
    }

    @Override
    public List<Album> getAll() {
        return albumRepository.findAll();
    }

    @Override
    @Transactional
    public Album get(int id) {
        return albumRepository.findById(id).get();
    }

    @Override
    public void delete(int id) {
        albumRepository.deleteById(id);
    }
}
