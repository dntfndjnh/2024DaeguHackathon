package com._Daegu._DaeguHackathon.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {

    @GetMapping("data_list")
    @ResponseBody
    public String data_list(@RequestParam("reason") String reason)
    {
       return "g"+reason;
    }

}
