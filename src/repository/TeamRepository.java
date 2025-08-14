package repository;

import entity.Team;

public class TeamRepository {
	
	
	//should return MI team Details
	
	public static Team getMITeamDetails() {
		
		Team team = new Team();
		team.setId(101);
		team.setTeamName("Mumbai Indians");
		team.setCaptainName("Hardik Pandya");
		team.setCoachName("Jaywardhan");
		team.setQualified(false);
		team.setnRR(2.3f);
		team.setShortname("MI");
		return team;
	}
	/// add similar methods for remaining 9 teams
	
     public static Team getRCBTeamDetails() {
		
		Team team = new Team();
		team.setId(102);
		team.setTeamName("Royal Challengers Benglore");
		team.setCaptainName("Rajat Patidar");
		team.setCoachName("Andy Flower");
		team.setQualified(false);
		team.setnRR(4.3f);
		team.setShortname("RCB");
		return team;
	}
     
     public static Team getCSKTeamDetails() {
 		
 		Team team = new Team();
 		team.setId(103);
 		team.setTeamName("Chennai Super Kings");
 		team.setCaptainName("Ruturaj Gaikwad");
 		team.setCoachName("Stephan Fleming");
 		team.setQualified(false);
 		team.setnRR(3.3f);
 		team.setShortname("CSK");
 		return team;

}
     public static Team getRRTeamDetails() {
 		
 		Team team = new Team();
 		team.setId(104);
 		team.setTeamName("Rajasthan Royals");
 		team.setCaptainName("Sanju Samson");
 		team.setCoachName("Rahul Dravid");
 		team.setQualified(false);
 		team.setnRR(5.3f);
 		team.setShortname("RR");
 		return team;
     
}
     public static Team getDCTeamDetails() {
 		
 		Team team = new Team();
 		team.setId(105);
 		team.setTeamName("Delhi Capitals");
 		team.setCaptainName("Rishabh Pant");
 		team.setCoachName("Kevin Peterson");
 		team.setQualified(false);
 		team.setnRR(5.3f);
 		team.setShortname("DC");
 		return team;
}
     
     public static Team getGTTeamDetails() {
 		
 		Team team = new Team();
 		team.setId(106);
 		team.setTeamName("Gujrat Titans");
 		team.setCaptainName("Shubhman Gill");
 		team.setCoachName("Ashish Nehrah");
 		team.setQualified(false);
 		team.setnRR(6.3f);
 		team.setShortname("GT");
 		return team;
}
     
     public static Team getSRHTeamDetails() {
 		
 		Team team = new Team();
 		team.setId(107);
 		team.setTeamName("Sunrisers Hydrabad");
 		team.setCaptainName("Pat Cummins");
 		team.setCoachName("Murlidharan");
 		team.setQualified(false);
 		team.setnRR(4.3f);
 		team.setShortname("SRH");
 		return team;
}
     
     public static Team getKKRTeamDetails() {
 		
 		Team team = new Team();
 		team.setId(108);
 		team.setTeamName("Kolkata Knight Riders");
 		team.setCaptainName("Ajinkya Rahane");
 		team.setCoachName("Gautam Gambhir");
 		team.setQualified(false);
 		team.setnRR(5.3f);
 		team.setShortname("KKR");
 		return team;
}
     
     public static Team getPBKSTeamDetails() {
 		
 		Team team = new Team();
 		team.setId(109);
 		team.setTeamName("Panjab Kings");
 		team.setCaptainName("Shreyash Iyer");
 		team.setCoachName("Rikey Ponting");
 		team.setQualified(false);
 		team.setnRR(6.3f);
 		team.setShortname("PBKS");
 		return team;
}
     
     public static Team getLSGTeamDetails() {
 		
 		Team team = new Team();
 		team.setId(110);
 		team.setTeamName("Lucknow Super Giants");
 		team.setCaptainName("KL Rahul");
 		team.setCoachName("Anil Kumble");
 		team.setQualified(false);
 		team.setnRR(4.3f);
 		team.setShortname("LSG");
 		return team;
     }
}