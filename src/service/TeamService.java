package service;

import java.util.Scanner;

import entity.Team;
import repository.TeamRepository;

public class TeamService {
	
	
	public void selectOptions() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to ipl portal ");
		System.out.println("Please select following options - ");
		System.out.println("1. Get all team Details");
		System.out.println("2. Get Team details by name");
		System.out.println("3. Get Team details by ID");
		
		int input = sc.nextInt();
		System.out.println("You have selected option : " + input);
		
		switch (input) {
		case 1: {
			System.out.println("in case 1");
			System.out.println(TeamRepository.getMITeamDetails());
			System.out.println(TeamRepository.getRCBTeamDetails());
			System.out.println(TeamRepository.getCSKTeamDetails());
			System.out.println(TeamRepository.getDCTeamDetails());
			System.out.println(TeamRepository.getSRHTeamDetails());
			System.out.println(TeamRepository.getLSGTeamDetails());
			System.out.println(TeamRepository.getKKRTeamDetails());
			System.out.println(TeamRepository.getRRTeamDetails());
			System.out.println(TeamRepository.getGTTeamDetails());
			System.out.println(TeamRepository.getPBKSTeamDetails());
			
			break;
		}
		case 2:{
			System.out.println("in case 2");
			System.out.println("Please enter your fav teams short name : ");
			String teamShortName = sc.next();
			System.out.println("Entered team short name is : " + teamShortName);
			getTeamByShortName(teamShortName);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + input);
		}
		
		private void getTeamByShortName(String shortName) {
			switch(shortName) {
			case "MI": {
				System.out.println("MI team case executed");
				System.out.println(TeamRepository.getMITeamDetails());
				break;
			}
			case "RCB":{
				System.out.println("RCB team case executed");
				System.out.println(TeamRepository.getRCBTeamDetails());
				break;
			}
			case "CSK":{
				System.out.println("CSK team case executed");
				System.out.println(TeamRepository.getCSKTeamDetails());
				break;
			}
			case "KKR":{
				System.out.println("KKR team case executed");
				System.out.println(TeamRepository.getKKRTeamDetails());
				break;
			}
			case "LSG":{
				System.out.println("LSG team case executed");
				System.out.println(TeamRepository.getLSGTeamDetails());
				break;
			}
			case "GT":{
				System.out.println("GT team case executed");
				System.out.println(TeamRepository.getGTTeamDetails());
				break;
			}
			case "DC":{
				System.out.println("DC team case executed");
				System.out.println(TeamRepository.getDCTeamDetails());
				break;
			}
			case "RR":{
				System.out.println("RR team case executed");
				System.out.println(TeamRepository.getRRTeamDetails());
				break;
			}
			case "PBKS":{
				System.out.println("PBKS team case executed");
				System.out.println(TeamRepository.getPBKSTeamDetails());
				break;
			}
			case "SRH":{
				System.out.println("SRH team case executed");
				System.out.println(TeamRepository.getSRHTeamDetails());
				break;
			}
			
	
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + shortName);
			}
		
	
		
	}

	private void getTeamByShortName1(String teamShortName) {
		// TODO Auto-generated method stub
		
	}

}
