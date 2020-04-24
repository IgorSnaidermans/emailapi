package lv.igors.lottery.emailapi;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class RequestEmail {
    String subject;
    String recipient;
    String lotteryCode;
    String lotteryTitle;
}
