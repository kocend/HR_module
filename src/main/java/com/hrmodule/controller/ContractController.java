package com.hrmodule.controller;

import com.hrmodule.model.Contract;
import com.hrmodule.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContractController {

    @Autowired
    ContractService contractService;

    @PostMapping(value = "/contracts", consumes = "application/json")
    public void addContract(@RequestBody Contract contract){
        contractService.addContract(contract);
    }

    @PutMapping(value = "/contracts/{id}", consumes = "application/json")
    public void updateContract(@PathVariable("id") int ID, @RequestBody Contract contract){
        contractService.updateContractByID(ID,contract);
    }

    @DeleteMapping(value = "/contracts/{id}")
    public void deleteContract(@PathVariable("id") int ID){
        contractService.deleteContractByID(ID);
    }

    @GetMapping(value = "/contracts/{id}")
    public Contract getContract(@PathVariable("id") int ID){
        return contractService.getContractByID(ID);
    }

    @GetMapping(value = "/contracts")
    public List<Contract> getAllContracts(){
        return contractService.getAllContracts();
    }

}
