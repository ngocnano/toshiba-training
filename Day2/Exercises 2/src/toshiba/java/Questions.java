package toshiba.java; 

/**
* the Questions class provides content questions and check answer
*/
public class Questions 
{
    private String answer          = new String();
    private String questionContent = new String();
    /**
    * setquestionID set các thuộc tính của Questions
    */
    public void setquestionID(String answer, String questionContent)
    {
    	this.answer          = answer;
    	this.questionContent = questionContent;
    	
    }
    /**
     * checkAnswer check đáp án với đáp án của người chơi
     */
    public boolean checkAnswer(String answer) 
    {
    	if (this.answer.equals(answer) == true)
    	{
    		return true;
    	}
    	else 
    	{
    		return false;
    	}
    }
    /**
     * In nội dung câu hỏi
     */
    public String toString() 
    {
    	return questionContent;
	}
}


