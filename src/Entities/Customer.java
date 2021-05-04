package Entities;
import java.time.LocalDate;

import Abstract.Entity;

public class Customer implements Entity {
	public int id;
	public String firstName;
	public String lastName;
	public LocalDate dateofbirth;
	public String nationalId;

}
