package practice_6;


public class practice6_1 {

	public static void main(String[] args) {
		// 1) 0, 1, 2, 중 난수를 생성해서 0이면 "가위", 1이면 "바위", 2이면 "보"를 표시하는 코드 작성
		double num = (Math.random() * 3);
		int randNum = (int)num;
		
		RockPaperScissors games = null;
		switch(randNum) {
		case 0: games = RockPaperScissors.SCISSORS;
		System.out.println(games + " = 가위");
		break;
		case 1: games = RockPaperScissors.ROCK; 
		System.out.println(games+ " = 바위");
		break;
		case 2: games = RockPaperScissors.PAPER; 
		System.out.println(games+ " = 보");
		break;
		}
	}
}
