package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ProgramDataWithCalendar {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		//obter o minuto de uma data
		int minutes = cal.get(Calendar.MINUTE);
		int month = cal.get(Calendar.MONTH);
		
		cal.add(Calendar.HOUR_OF_DAY, 4);//Adiciono +4 na data
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		
		System.out.println("Minutos: " + minutes);
		System.out.println("Mês: " + month);

	}

}
