package com.gitProject.logic;

import com.gitProject.dto.TaliLagrissi;
import com.gitProject.entities.TaliLagrissiEntity;
import com.gitProject.repositories.ITaliLagrissiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaliLagrissiLogic {

    @Autowired
    private ITaliLagrissiRepository taliLagrissiRepository;

    public long createTaliLagrissi(TaliLagrissi taliLagrissi) {
        // validations
        TaliLagrissiEntity taliLagrissiEntity = new TaliLagrissiEntity(taliLagrissi);
        taliLagrissiRepository.save(taliLagrissiEntity);
        return taliLagrissiEntity.getId();
    }

    public void updateTaliLagrissi(TaliLagrissi taliLagrissi) {
        // validations
        TaliLagrissiEntity taliLagrissiEntity = new TaliLagrissiEntity(taliLagrissi);
        taliLagrissiRepository.save(taliLagrissiEntity);
    }

    public TaliLagrissi getTaliLagrissiById(long id) {
        TaliLagrissiEntity taliLagrissiEntity = taliLagrissiRepository.findById(id).get();
        TaliLagrissi taliLagrissi = new TaliLagrissi(taliLagrissiEntity);
        return taliLagrissi;
    }

    public List<TaliLagrissi> getAllTaliLagrissies() {
        List<TaliLagrissi> taliLagrissiesList = new ArrayList<>();
        Iterable<TaliLagrissiEntity> taliLagrissiesEntityIterable = taliLagrissiRepository.findAll();
        for (TaliLagrissiEntity taliLagrissiEntity : taliLagrissiesEntityIterable) {
            TaliLagrissi taliLagrissi = new TaliLagrissi(taliLagrissiEntity);
            taliLagrissiesList.add(taliLagrissi);
        }
        return taliLagrissiesList;
    }

    public void deleteTaliLagrissiById(long id) {
        taliLagrissiRepository.deleteById(id);
    }
}
