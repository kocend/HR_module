package com.hrmodule.service;

import com.hrmodule.dao.DataBaseAccessInterface;
import com.hrmodule.model.Contract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ContractService {

    @Autowired
    private DataBaseAccessInterface db;

    public void addContract(Contract contract){
        db.addContract(contract);
    }

    public void updateContractByID(int ID, Contract contract){
        db.updateContractByID(ID,contract);
    }

    public void deleteContractByID(int ID){
        db.deleteContractByID(ID);
    }

    public Contract getContractByID(int ID){
        return db.getContractByID(ID);
    }

    public List<Contract> getAllContracts(){
        return db.getAllContracts();
    }
}
