package com.assignment_6.mysqlwork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


// make this a controller
@Controller
public class AddressController {

    //auto wire user repository
    @Autowired

    private AddressService service;

    //Added a keyword parameter
    @RequestMapping("/")
    public String viewHomePage(Model model, @Param("keyword") String keyword) {
        List<AddressBook> listAddressBookValues = service.listAll(keyword);
        model.addAttribute("listAddressBookValues", listAddressBookValues);
        model.addAttribute("keyword", keyword);

        return "index";
    }

    @RequestMapping("/new")
    public String showNewAddressBookPage(Model model) {
        AddressBook addressBook = new AddressBook();
        model.addAttribute("addressBook", addressBook);

        return "new_entry";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveAddressBook(@ModelAttribute("addressBook") AddressBook addressBook) {
        service.save(addressBook);

        return "redirect:/";
    }

    @RequestMapping("/delete/{id}")
    public String deleteEntry(@PathVariable(name = "id") long id) {
        service.delete(id);
        return "redirect:/";
    }

}
