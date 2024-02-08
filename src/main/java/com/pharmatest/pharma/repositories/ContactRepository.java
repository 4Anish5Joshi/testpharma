package com.pharmatest.pharma.repositories;

import org.springframework.data.repository.CrudRepository;

import com.pharmatest.pharma.model.Contact;

public interface ContactRepository extends CrudRepository<Contact, Integer> {
}
