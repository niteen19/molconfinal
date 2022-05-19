package com.molcon.cci.clientAuthController;

import com.molcon.cci.clientRepository.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientapi")
public class ClientController {

    @Autowired
    private ClientRepo ClientIpRepository;

    @GetMapping("/test")
    public String test() {
        return "success";
    }


}
