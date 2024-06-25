package hibmock;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class IPL
{
private String team;
private String captain;
@Id
@GeneratedValue (strategy=GenerationType.IDENTITY)
private int captain_jersey;
private String place;
public String getTeam() {
	return team;
}
public void setTeam(String team) {
	this.team = team;
}
public String getCaptain() {
	return captain;
}
public void setCaptain(String captain) {
	this.captain = captain;
}
public int getCaptain_jersey() {
	return captain_jersey;
}
public void setCaptain_jersey(int captain_jersey) {
	this.captain_jersey = captain_jersey;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}
public IPL(String team, String captain, int captain_jersey, String place) {
	super();
	this.team = team;
	this.captain = captain;
	this.captain_jersey = captain_jersey;
	this.place = place;
}
public IPL() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "IPL [team=" + team + ", captain=" + captain + ", captain_jersey=" + captain_jersey + ", place=" + place
			+ "]";
}

}
