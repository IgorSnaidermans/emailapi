package lv.igors.lottery.emailapi;

import lombok.AllArgsConstructor;
import net.sargue.mailgun.Configuration;
import net.sargue.mailgun.Mail;
import net.sargue.mailgun.MailgunException;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class EmailService {
    Configuration configuration;

    public void sendEmail(RequestEmail requestEmail) throws MailgunException {
        Mail.using(configuration)
                .to("igors.snaidermans@icloud.com")
                .subject("Test")
                .text("Hello world!")
                .build()
                .send();
    }
}
