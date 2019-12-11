package com.hrmodule.service;

import com.hrmodule.dao.DataBaseAccessInterface;
import com.hrmodule.model.Holiday;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HolidayService {

    @Autowired
    DataBaseAccessInterface db;

    public void addHoliday(Holiday holiday){
        db.addHoliday(holiday);
    }

    public void updateHolidayByID(int ID, Holiday holiday){
        db.updateHolidayByID(ID,holiday);
    }

    public void deleteHolidayByID(int ID){
        db.deleteHolidayByID(ID);
    }

    public Holiday getHolidayByID(int ID){
        return db.getHolidayByID(ID);
    }

    public List<Holiday> getAllHolidays(){
        return db.getAllHolidays();
    }
}
