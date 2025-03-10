package com.belajar.fetch.demo.fetch.controller;

import com.belajar.fetch.demo.fetch.entity.Customer;
import com.belajar.fetch.demo.fetch.repository.CustomerRepository;
import com.belajar.fetch.demo.fetch.service.GunungService;
import com.belajar.fetch.demo.fetch.service.KotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class HomeController {

    @Autowired
    private KotaService kotaService;

    @Autowired
    private GunungService gunungService;
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/home")
    public String home() {

        return "home";
    }

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("kotaList", kotaService.getAllKota());
        model.addAttribute("gunungList", gunungService.getAllGunung());
        return "customer-form";
    }

    @PostMapping("/save")
    public String saveCustomer(@ModelAttribute Customer customer) {
        customerRepository.save(customer);
        return "redirect:/customer/form?success";
    }
}
