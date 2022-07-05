package com.gitProject.logic;

import com.gitProject.dto.LittleDudu;
import com.gitProject.entities.LittleDuduEntity;
import com.gitProject.repositories.ILittleDuduRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class LittleDuduLogic {

    @Autowired
    private ILittleDuduRepository littleDuduRepository;

    public void createLittleDudu(LittleDudu littleDudu) {
        LittleDuduEntity littleDuduEntity = new LittleDuduEntity(littleDudu);
        littleDuduRepository.save(littleDuduEntity);
    }

    public void updateLittleDudu(LittleDudu littleDudu) {
        LittleDuduEntity littleDuduEntity = new LittleDuduEntity(littleDudu);
        littleDuduRepository.save(littleDuduEntity);
    }

    public void deleteLittleDudu(long id) {
        littleDuduRepository.deleteById(id);
    }

    public LittleDudu getLittleDuduById(long id) {
        LittleDuduEntity littleDuduEntity = littleDuduRepository.findById(id).get();
        LittleDudu littleDudu = new LittleDudu(littleDuduEntity);
        return littleDudu;
    }

    public List<LittleDudu> getAllLittleDudus() {
        List<LittleDudu> littleDuduList = new ArrayList<>();
        Iterable<LittleDuduEntity> littleDuduIterable = littleDuduRepository.findAll();
        for (LittleDuduEntity littleDuduEntity : littleDuduIterable) {
            LittleDudu littleDudu = new LittleDudu(littleDuduEntity);
            littleDuduList.add(littleDudu);
        }
        return littleDuduList;
    }
}
