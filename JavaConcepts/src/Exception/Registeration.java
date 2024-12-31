package Exception;

public class Registeration {
 
	void userRegisteraction(int age)
	{
		if(age<18) {
			try
			{
				throw new InvalidAgeException();
			}catch(InvalidAgeException e) {
				System.out.println("Invalid age ecception occured...");
			}
		}
			else {
				System.out.println("user successfully registered");
			}
		}
	}

