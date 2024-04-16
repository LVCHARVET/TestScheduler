package fr.diginamic.TestScheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TickerService {

	@Scheduled(cron = "* * * * * *")
	public void tick() {
		System.out.println("Tick : " + System.currentTimeMillis());
	}
}
