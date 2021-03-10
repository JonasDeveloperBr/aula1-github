package br.com.profNelio.aula142.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

	private Integer room;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation(Integer room, Date checkIn, Date checkOut) {
		this.room = room;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public void setRoom(Integer room) {
		this.room = room;
	}
	
	public Integer getRoom() {
		return room;
	}
	
	public Date getCheckIn() {
		return checkIn;
	}
	
	public Date getCheckOut() {
		return checkOut;
	}
	
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void updateDates(Date checkIn, Date checkOut) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Room ");
		sb.append(room);
		sb.append(", check-in: ");
		sb.append(sdf.format(checkIn));
		sb.append(", check-out: ");
		sb.append(sdf.format(checkOut));
		sb.append(", ");
		sb.append(duration());
		sb.append(" nights");
		
		return sb.toString();
	}
}
