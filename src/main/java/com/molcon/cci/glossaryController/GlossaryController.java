package com.molcon.cci.glossaryController;

import com.molcon.cci.clientAuthModel.ClientAuthResponse;
import com.molcon.cci.clientAuthService.imple.RequestServiceImple;
import com.molcon.cci.glossaryModel.Glossary;
import com.molcon.cci.glossaryRepository.glossaryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/glossary")
public class GlossaryController {
    @Autowired
    RequestServiceImple requestServiceImple;
    @Autowired
    private glossaryRepo glossaryRepo;

    @GetMapping("/readAll")
    public ResponseEntity<ClientAuthResponse> readAll(HttpServletRequest request) {

        return new ResponseEntity<ClientAuthResponse>(
                new ClientAuthResponse<List<Glossary>>
                        (HttpStatus.OK.value(), "success", glossaryRepo.findAll()),
                HttpStatus.OK);
    }

}






