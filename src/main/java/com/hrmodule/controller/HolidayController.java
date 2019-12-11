package com.hrmodule.controller;

import com.hrmodule.model.Holiday;
import com.hrmodule.service.HolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HolidayController {

    @Autowired
    HolidayService holidayService;

    @PostMapping(value = "/holidays", consumes = "application/json")
    public void addHoliday(@RequestBody Holiday holiday){
        holidayService.addHoliday(holiday);
    }

    @PutMapping(value = "/holidays/{id}",consumes = "application/json")
    public void updateHoliday(@PathVariable("id") int ID, @RequestBody Holiday holiday){
        holidayService.updateHolidayByID(ID, holiday);
    }

    @DeleteMapping(value = "/holidays/{id}")
    public void deleteHoliday(@PathVariable("id") int ID){
        holidayService.deleteHolidayByID(ID);
    }

    @GetMapping(value = "/holidays/{id}")
    public Holiday getHoliday(@PathVariable("id") int ID){
        return holidayService.getHolidayByID(ID);
    }

    @GetMapping(value = "/holidays")
    public List<Holiday> getAllHolidays(){
        return holidayService.getAllHolidays();
    }
}
