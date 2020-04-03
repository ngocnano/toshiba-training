package toshiba.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
/**
 * Lớp WhoIsMillionaire chứa ngân hành câu hỏi và tính điểm người chơi
 */
public class WhoIsMillionaire 
{
	private int score = 0;
	private Questions questions[] = new Questions[10];
	/**
	 * loadQuestions load dữ liệu từ file txt vào ngân hàng
	 */
	public void loadQuestions(String file) 
	{
		try 
		{
			FileReader reader     = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader);
			
			for (int i = 0; i < 10; i++) 
			{
				String questionContent  = new String("");
				String answer           = new String("");
				for(int j = 0; j < 5; j++) 
				{
					questionContent     = questionContent.concat(buffer.readLine() + "\n");
				}
				answer                  = buffer.readLine();
				Questions tempQuestions = new Questions();
				tempQuestions.setquestionID(answer, questionContent);
				questions[i]            = tempQuestions;
			}
			buffer.close();
			reader.close();
			
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	/**
	 *  start Xuất ra màn hình câu hỏi
	 */
	public void start(int questionID) 
	{
		System.out.println(questions[questionID]);
	}
	/**
	 *  kiểm tra câu trả lời và tính điểm người chơi
	 */
	public boolean answer(String answer, int questionID) 
	{
		if (questions[questionID].checkAnswer(answer) == true)
		{
			this.score ++;
			return true;
		}
		else
		{
			return false;
		}
	}
	/**
	 *  Lấy điểm số người chơi
	 */
	    public int getScore() 
	    {
		return score;
		}

	public static void main(String[] args) {
		String nameString                 = new String();
		String file                       = "D:/question.txt";    //Link question file
		Scanner scanner                   = new Scanner(System.in);
		WhoIsMillionaire whoIsMillionaire = new WhoIsMillionaire();
		Random rdRandom = new Random();
		
		whoIsMillionaire.loadQuestions(file);
		System.out.println("Welcome to the game Who is millionaire!");
		System.out.println("I'm Lai Van Sam host of the show.");
		System.out.println("What is your name:");
		nameString = scanner.nextLine();
		System.out.println("Welcome player " + nameString + "Let's the game begin!");
		
		int count = 0;
		while (true)
		{   
			int id        = rdRandom.nextInt(10);
			boolean check = false;
			String answer = new String();
	        whoIsMillionaire.start(id);
	        System.out.print("Your answer:");
	        answer        = scanner.next();
	        check         = whoIsMillionaire.answer(answer, id);
	        if (count == 9) 
	        {
	        	System.out.println("You are millionaire " + whoIsMillionaire.getScore());
	        	break;
	        }
			if (check == false)
			{
				System.out.println("Wrong answer! You lose! Your Score is " + whoIsMillionaire.getScore());
				
				break;
			}
			else 
			{
			    System.out.println("Correct answer!");
			    count ++;
			}
			
		}
		scanner.close();
	}
}
