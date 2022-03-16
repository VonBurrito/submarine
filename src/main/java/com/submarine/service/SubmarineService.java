package com.submarine.service;

import com.submarine.model.Submarine;
import jdk.jshell.spi.ExecutionControl;
import org.hibernate.cfg.NotYetImplementedException;

import java.util.List;

public interface SubmarineService {

    Submarine saveSubmarine(Submarine submarine);

    void deleteSubmarine(Long id);

    Submarine updateSubmarine(Submarine submarine);

    List<Submarine> getAllSubmarines();

    Submarine getSubmarineById(Long id);
}
