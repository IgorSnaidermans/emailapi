package lv.igors.lottery.emailapi;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
@AllArgsConstructor
public class EmailController {
    EmailService emailService;

    @GetMapping("/send-email")
    public EntityResponse<String> sendEmail() {
        return null;
    }

    @ExceptionHandler
    public EntityResponse<String> exceptionHandler() {
        return null;
    }

}
