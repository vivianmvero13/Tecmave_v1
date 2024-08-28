/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tecmave.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author villa
 */
@Controller
public class ContactenosController {
    
    @GetMapping("/contactenos")
    public String contactenos(){
        return "contactenos/contactenos";
    }
    
}
