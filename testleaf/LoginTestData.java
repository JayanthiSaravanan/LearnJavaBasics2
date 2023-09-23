package week3;

public class LoginTestData extends TestData {

	public void enterUserName() {

		System.out.println("UserName:Jayanthi");
	}

	public void enterPassword() {
		System.out.println("Password:Jayanthi@1");

	}

	public static void main(String[] args) {

		LoginTestData details = new LoginTestData();

		details.navigateToHomepage();
		details.enterCredentials();
		details.enterUserName();
		details.enterPassword();
	}
}
//Result:
//UserName:Jayanthi
//Password:Jayanthi@1
