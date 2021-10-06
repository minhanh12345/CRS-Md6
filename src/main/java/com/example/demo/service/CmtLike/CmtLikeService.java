package com.example.demo.service.CmtLike;

import com.example.demo.model.CmtLike;
import com.example.demo.repository.ICmtLikeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class CmtLikeService implements ICmtLikeService{
    @Autowired
    ICmtLikeRepository iCmtLikeRepository;
    @Override
    public Iterable<CmtLike> findAll() {
        return iCmtLikeRepository.findAll();
    }

    @Override
    public Optional<CmtLike> findById(long id) {
        return Optional.empty();
    }

    @Override
    public CmtLike save(CmtLike cmtLike) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
