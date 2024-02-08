package com.pharmatest.pharma.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.pharmatest.pharma.model.Contact;
import com.pharmatest.pharma.repositories.ContactRepository;

@Controller
public class ContactController {
  
  @Autowired
  private ContactRepository contactRepository;

  @PostMapping("/contact")
  public String saveContact(Contact contact) {
    contactRepository.save(contact);
    return "redirect:/contact";
  }

  @GetMapping("/contact")
  public String showContact(Model model) {
    model.addAttribute("contactForm", new Contact());
    return "contact_us";
  }

  @GetMapping("/contactd")
public String showContactDetails(Model model) {
    Iterable<Contact> contactsIterable = contactRepository.findAll();
    List<Contact> contacts = StreamSupport.stream(contactsIterable.spliterator(), false).collect(Collectors.toList());
    model.addAttribute("contacts", contacts);
    return "contactd";
}

}
