package com.greenfox.frontend.Controller;

import com.greenfox.frontend.Model.Entity.Yoda;
import com.greenfox.frontend.Service.YodaService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class YodaController {

    private YodaService service;

    public YodaController(YodaService service) {
        this.service = service;
    }

    @PostMapping("/sith")
    public ResponseEntity<? extends Object> sith(@RequestBody(required = false) Yoda yoda) {
        return service.sithStuff(yoda.getText());
    }
}
