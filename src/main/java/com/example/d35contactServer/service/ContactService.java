package com.example.d35contactServer.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.d35contactServer.repositories.ContactRepository;

public class ContactService {
    
    @Autowired
    private ContactRepository contactRepo;
}
