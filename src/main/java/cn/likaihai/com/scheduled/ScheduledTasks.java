package cn.likaihai.com.scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat(
			"HH:mm:ss");

	@Scheduled(fixedRate = 100)
	public void reportCurrentTime() {
		System.out.println("现在时间：" + dateFormat.format(new Date()));
	}

}
