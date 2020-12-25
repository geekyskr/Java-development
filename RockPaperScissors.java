package com.sunil;

import java.util.*;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//total round should be less than 100
		int totalRound = scan.nextByte();
		int playerFirst=0, playerSecond=0;
		while(totalRound--!=0) {
			//give either R, P or S
			String playerFirstChoise = scan.next();
			String playerSecondChoise = scan.next();
			char firstPlayerChoise = playerFirstChoise.charAt(0);
			char secondPlayerChoise = playerSecondChoise.charAt(0);
			if((firstPlayerChoise=='R' && secondPlayerChoise=='S')||
					(firstPlayerChoise=='S' && secondPlayerChoise=='P')||
					(firstPlayerChoise=='P' && secondPlayerChoise=='R')) {
				playerFirst++;
			}
			else if(firstPlayerChoise==secondPlayerChoise)continue;
			else {
				playerSecond++;
			}
		}
		if(playerFirst<playerSecond)System.out.println("Second player won");
		else if(playerFirst>playerSecond)System.out.println("First player won");
		else System.out.println("Match draw");
		scan.close();
	}

}
