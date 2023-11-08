package lotto.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LottoReceipt {
    public List<Lotto> lottoTickets;
    public Map<Rank, Integer> winningStatistics = new HashMap<>();

    public LottoReceipt(List<Lotto> lottoTickets) {
        this.lottoTickets = lottoTickets;
        for (Rank rank : Rank.values()) {
            winningStatistics.put(rank, 0);
        }
    }

    public List<Lotto> getLottoTickets() {
        return lottoTickets;
    }

    public Map<Rank, Integer> getWinningStatistics() {
        return winningStatistics;
    }
}
