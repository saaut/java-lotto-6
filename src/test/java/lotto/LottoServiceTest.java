package lotto;

import lotto.Service.LottoService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LottoServiceTest {

    @Test
    void getTicketCountWithInvalidMoneyTest() {
        LottoService lottoService = new LottoService();

        assertThrows(IllegalArgumentException.class, () -> {
            lottoService.getTicketCount(500);
        });
    }
}
