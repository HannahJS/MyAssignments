package week1.day2;

public class LearnMethods {



		//methodName - ctrl+space
		public void browserName() {
	System.out.println("Chrome");
		}
		
		private void browserVersion(int version) {
		System.out.println("version :"+version);
		}
		
		//default accesmodifier  - return method(){}
		void browserLogo(char logo) {
			System.out.println("Logo :"+ logo);
		}
		
		protected  int age(int a,int b) {
			return a+b;
			
		}
		
		public String name(int age,String name) {
			return age +" "+ name;
			
		}
		
		public static void main(String[] args) {
			//ClassName objectName=new ClassName();
			LearnMethods lm=new LearnMethods();
			
			//objectName.methodName()
			
			lm.browserLogo('c');
			lm.browserName();
			lm.browserVersion(123);
			
			
			//if you have used data types
			//type 1 you can assign this into local variable
			//ctrl + 2 -l
			int value = lm.age(10,10);
			System.out.println(value);
			//type 2
	System.out.println(lm.name(2024, "TestLeaf"));	




		}
		
	}

