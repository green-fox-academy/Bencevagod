package com.greenfox.frontend.Service;

import com.greenfox.frontend.Model.DTO.ErrorMessage;
import com.greenfox.frontend.Model.Entity.Doubler;
import com.greenfox.frontend.Model.Entity.Greeter;
import com.greenfox.frontend.Model.Entity.UntilResult;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    public Doubler doubler(Integer num) {
        if (num != null) {
            return new Doubler(num);
        }
        return new Doubler();
    }

    public ResponseEntity<? extends Object> greet(String name, String title) {
        if (name == null && title == null) {
            return ResponseEntity.status(400).body(new ErrorMessage("Please provide a name and a title!"));
        } else if (name == null){
            return ResponseEntity.status(400).body(new ErrorMessage("Please provide a name!"));
        }  else if (title == null){
            return ResponseEntity.status(400).body(new ErrorMessage("Please provide a title!"));
        }
        return ResponseEntity.status(200).body(new Greeter(name, title));
    }

    public ResponseEntity<? extends Object> until(String action, Integer until) {
        if (action.equals("sum") && until != null) {
            Integer result = 0;
            for (int i = 1; i <= until; i++) {
                result += i;
            }
            return ResponseEntity.status(200).body(new UntilResult(until, result));
        } else if (action.equals("factor") && until != null) {
            Integer result = 1;
            for (int i = 1; i <= until; i++) {
                result *= i;
            }
            return ResponseEntity.status(200).body(new UntilResult(until, result));
        }
        return ResponseEntity.status(404).body(new ErrorMessage("Please provide a number!"));
    }

}
