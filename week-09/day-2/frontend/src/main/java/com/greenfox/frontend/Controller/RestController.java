package com.greenfox.frontend.Controller;

import com.greenfox.frontend.Model.DTO.ErrorMessage;
import com.greenfox.frontend.Model.Entity.AppendA;
import com.greenfox.frontend.Model.Entity.Doubler;
import com.greenfox.frontend.Model.Entity.UntilResult;
import com.greenfox.frontend.Service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.apache.logging.log4j.message.MapMessage.MapFormat.JSON;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private MainService service;

    @Autowired
    public RestController(MainService service) {
        this.service = service;
    }

    @GetMapping("/doubling")
    public Doubler doubling(@RequestParam(value = "input", required = false) Integer num) {
        return service.doubler(num);
    }

    @GetMapping("/greeter")
    public ResponseEntity<? extends Object> greeting(@RequestParam (value = "name", required = false) String name, @RequestParam (value = "title", required = false) String title) {
        return service.greet(name, title);
    }

    @GetMapping("/appenda/{appendable}")
    public AppendA appendA(@PathVariable(value = "appendable") String appendable) {
        return new AppendA(appendable);
    }

    @GetMapping("/appenda")
    public ResponseEntity<? extends Object> appendNo() {
        return ResponseEntity.status(404).body(new ErrorMessage("404"));
    }

    @PostMapping("dountil/{action}")
    public ResponseEntity<? extends Object> dountil(@PathVariable (value = "action", required = false) String action, @RequestBody(required = false) UntilResult untilResult) {
        return service.until(action, untilResult.getUntil());
    }
}
