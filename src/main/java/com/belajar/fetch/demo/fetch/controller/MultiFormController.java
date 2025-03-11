package com.belajar.fetch.demo.fetch.controller;

import com.belajar.fetch.demo.fetch.entity.Gunung;
import com.belajar.fetch.demo.fetch.entity.Kota;
import com.belajar.fetch.demo.fetch.service.CustomerService;
import com.belajar.fetch.demo.fetch.service.GunungService;
import com.belajar.fetch.demo.fetch.service.KotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class MultiFormController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private KotaService kotaService;

    @Autowired
    private GunungService gunungService;

    @ModelAttribute("kotaList")
    public List<Kota> kotaList() {
        return kotaService.getAllKota();
    }

    @ModelAttribute("gunungList")
    public List<Gunung> gunungList() {
        return gunungService.getAllGunung();
    }

    // Halaman 1 - Input Nama
    @GetMapping("/form1")
    public String showForm1(Model model) {
        model.addAttribute("customer", customerService.getCustomer());
        return "form1";
    }

    @PostMapping("/form1")
    public String saveForm1(@RequestParam String nama) {
        customerService.setNama(nama);
        return "redirect:/customer/form2";
    }

    // Halaman 2 - Input Kota
    @GetMapping("/form2")
    public String showForm2(Model model) {
        model.addAttribute("customer", customerService.getCustomer());
        return "form2";
    }

    @PostMapping("/form2")
    public String saveForm2(@RequestParam String kota) {
        customerService.setKota(kota);
        return "redirect:/customer/form3";
    }

    // Halaman 3 - Input Gunung
    @GetMapping("/form3")
    public String showForm3(Model model) {
        model.addAttribute("customer", customerService.getCustomer());
        return "form3";
    }

    @PostMapping("/form3")
    public String saveForm3(@RequestParam String gunung) {
        customerService.setGunung(gunung);
        return "redirect:/customer/review";
    }

    // Halaman Review Sebelum Submit
    @GetMapping("/review")
    public String showReview(Model model) {
        model.addAttribute("customer", customerService.getCustomer());
        return "review";
    }

    // Simpan ke database
    @PostMapping("/submit")
    public String submitForm() {
        customerService.saveCustomer();
        return "success";
    }
}
