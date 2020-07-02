package com.day4.bankofsimba.controllers;

import com.day4.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class BankAccountController {

    List<BankAccount> bankAccounts = new ArrayList<>(Arrays.asList(
            new BankAccount("Pumba", 300, "Boar", false),
            new BankAccount("Evil Lion", 120000, "Lion", true),
            new BankAccount("Hyena", 1000, "Hyena", true),
            new BankAccount("Simba", 2000, "Lion", false)

    ));

    @GetMapping("/show")
    private String showAccountInfo(Model model) {
        model.addAttribute("bankAccounts", bankAccounts);
        //model.addAttribute("name", bankAccount.getName());
        //model.addAttribute("balance", bankAccount.getBalance());
        return "show";
    }

    @PostMapping("/save-bankAccount")
    private String addNewAccount(@ModelAttribute BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
        return "redirect:/show";
    }

    @PostMapping("/raise")
    private String raiseBalance() {
        bankAccounts.forEach(BankAccount::raiseBalance);
        return "redirect:/show";
    }
}
