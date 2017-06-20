//question 2
package cs3300_Final_Exam;

public class Person implements Airplane, Vehicle
{
	private String dateOfBirth;
	private String jobTitle;
	
	@Override
	public void CruiseDrive() 
	{
		
		
	}

	@Override
	public void ManualDrive() 
	{
		
		
	}

	@Override
	public void autoPilot() 
	{
		
		
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public int combineDriveFlyMiles()
	{
		return 0;
		
	}
	public int onlyFlyMiles()
	{
		return 0;
		
	}

}
