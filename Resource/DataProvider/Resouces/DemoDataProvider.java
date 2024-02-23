package DataProvider.Resouces;


public class DemoDataProvider {
	
@org.testng.annotations.DataProvider(name ="demo-data-provider")
	public Object[][] dataProvider1(){
		return new Object[][] {
			{"Somesh","Prajapati","Demo123@gmail.com","BitTorr"},
			{"Somesh","Prajapati","Demo123@gmail.com","BitTorr"}
		};
	}

@org.testng.annotations.DataProvider(name ="pricing-data-provider")
public Object[][] dataProvider2(){
	return new Object[][] {
		{"TCS","Demo123@gmail.com","134567890","Patel","Rakesh","20,000","12","01","2000","Hello! Everybody....."},
		{"Infytq","Demo123@gmail.com","134567890","Patel","Rakesh","20,000","12","01","2000","Hello! Everybody....."}
	};
}

@org.testng.annotations.DataProvider(name = "register-data-provider")
public Object[][] dataProvider3(){
	return new Object[][] {
		{"Somesh","Prajapati","Demo123@gmail.com","91","1324567890","BitTorr","Indore","Indore","Indore","Rajasthan","452015","India","123456789","Demo@123","Demo@123","The following errors occurred:","Correct"},
		{"Somesh","Prajapati","Demo123@gmail.com","91","1324567890","BitTorr","Indore","Indore","Indore","Rajasthan","452015","India","123456789","Demo@123","Demo@123","The following errors occurred:","Correct"}
		};
	}	
}