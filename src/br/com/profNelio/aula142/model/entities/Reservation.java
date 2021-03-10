package br.com.profNelio.aula142.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import br.com.profNelio.aula142.model.exceptions.DomainException;

public class Reservation {

	private Integer room;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	//public Reservation(Integer room, Date checkIn, Date checkOut) throws DomainException {
	public Reservation(Integer room, Date checkIn, Date checkOut) { //Se a exceção que está sendo lançada for uma classe que extende RuntimeException então torna-se desnecessário a declaração 'throws DomainException'
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after Check-in date");
		}
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
	
	//public void updateDates(Date checkIn, Date checkOut) throws DomainException{ 	//Exception
	public void updateDates(Date checkIn, Date checkOut) {	//RuntimeException
		
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Reservation dates for update must be future date");
		} 
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after Check-in date");
		}
		
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
