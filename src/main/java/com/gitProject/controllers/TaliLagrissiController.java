package com.gitProject.controllers;

import com.gitProject.dto.TaliLagrissi;
import com.gitProject.logic.TaliLagrissiLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/talies")
public class TaliLagrissiController {

    @Autowired
    private TaliLagrissiLogic taliLagrissiLogic;

    @PostMapping
    public long createTaliLagrissi(@RequestBody TaliLagrissi taliLagrissi) {
        return taliLagrissiLogic.createTaliLagrissi(taliLagrissi);
    }

    @PutMapping
    public void updateTaliLagrissi(@RequestBody TaliLagrissi taliLagrissi) {
        taliLagrissiLogic.updateTaliLagrissi(taliLagrissi);
    }

    @GetMapping("/{id}")
    public TaliLagrissi getTaliLagrissiById(@PathVariable(name = "id") long id) {
        return taliLagrissiLogic.getTaliLagrissiById(id);
    }

    @GetMapping
    public List<TaliLagrissi> getAllTaliLagrissies() {
        return taliLagrissiLogic.getAllTaliLagrissies();
    }

    @DeleteMapping("/{id}")
    public void deleteTaliLagrissiById(@PathVariable(name = "id") long id) {
        taliLagrissiLogic.deleteTaliLagrissiById(id);
    }
}
