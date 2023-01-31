package com.example.d35contactServer.repositories;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import com.example.d35contactServer.models.Contact;

@Repository
public class ContactRepository {
    
    @Autowired
    private JdbcTemplate template;


    public List<Contact> findContactsByName (String name) {
        List<Contact> savedContacts = new LinkedList<>(); 
        SqlRowSet rs = template.queryForRowSet(name);
        while (rs.next()) 
            contacts.add(Contact.create(rs));

        return contacts;
            
    }

}
