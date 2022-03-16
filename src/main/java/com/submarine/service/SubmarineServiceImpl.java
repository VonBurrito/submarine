package com.submarine.service;

import com.submarine.model.Submarine;
import com.submarine.repository.SubmarineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Hamza Amentag
 * @since 3/16/2022
 */
@Service
@Transactional
public class SubmarineServiceImpl implements SubmarineService {

    @Autowired
    SubmarineRepository submarineRepository;

    @Override
    public Submarine saveSubmarine(Submarine submarine) {
        return submarineRepository.save(submarine);
    }

    @Override
    public void deleteSubmarine(Long id) {
        submarineRepository.deleteById(id);
    }

    @Override
    public Submarine updateSubmarine(Submarine submarine) {
        return submarineRepository.save(submarine);
    }

    @Override
    public List<Submarine> getAllSubmarines() {
        return submarineRepository.findAll();
    }

    @Override
    public Submarine getSubmarineById(Long id) {
        return null;
    }
}
