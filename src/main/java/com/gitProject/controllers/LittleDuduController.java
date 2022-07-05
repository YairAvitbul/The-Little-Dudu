package com.gitProject.controllers;

import com.gitProject.dto.LittleDudu;
import com.gitProject.logic.LittleDuduLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("littleDudu")
public class LittleDuduController {
    @Autowired
    private LittleDuduLogic littleDuduLogic;

    @PostMapping
    public long createLittleDudu(@RequestBody LittleDudu littleDudu) {
       long id = littleDuduLogic.createLittleDudu(littleDudu);
       return id;
    }

    @PutMapping
    public void updateLittleDudu(@RequestBody LittleDudu littleDudu) {
        littleDuduLogic.updateLittleDudu(littleDudu);
    }

    @DeleteMapping("/{id}")
    public void deleteLittleDudu(@PathVariable("id") long id) {
        littleDuduLogic.deleteLittleDudu(id);
    }

    @GetMapping("/{id}")
    public LittleDudu getLittleDuduById(@PathVariable("id") long id) {
        return littleDuduLogic.getLittleDuduById(id);
    }

    @GetMapping
    public List<LittleDudu> getAllLittleDudus() {
        return littleDuduLogic.getAllLittleDudus();
    }
}
