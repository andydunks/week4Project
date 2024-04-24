
public class week4Project {

	public static void main(String[] args) {
		
		//Problem 1a
		int [] ages = new int[] {3,9,23,64,2,8,28,93};
		int lastNum = ages[(ages.length-1)];
		int ans = lastNum - ages[0];
		System.out.println("-----QUESTION 1-----");
		System.out.println("The answer for Question 1-a is: " + ans);
		System.out.println();
		
		//Problem 1b
		
		int[] ages2 = new int[] {1,2,3,4,5,6,7,8,9};
		int lastNumB = ages2[(ages2.length-1)];
		int ansB = lastNumB - ages2[0];
		
		System.out.println("The answer for Question 1-b is: "+ ansB);
		System.out.println();
		
		//Problem 1c
		double ageSum=0;
		double ageIndex =ages.length;
		double avgAge =0;
		for (int age:ages) {
			ageSum+=age;
			
		}
		avgAge = ageSum/ageIndex;
		System.out.println("The answer for Question 1-c is: " + avgAge);
		System.out.println();
		
		//Problem 2
		
		String [] names = new String[] {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//Problem 2a
		double letterSum = 0.0;
		double letterIndex = names.length;
		
		for (String name:names) {
			letterSum+= name.length();
		}
		System.out.println("-----QUESTION 2-----");
		System.out.println("The answer for Question 2-a is: " + letterSum/letterIndex);
		System.out.println();
		
		//Problem 2b
		
		String allNames = "";
		
		for (String name:names) {
			allNames += name +" ";
		}
		System.out.println("The answer for Question 2-b is: "+allNames);
		System.out.println();
		
		//Problem 3
		System.out.println("-----QUESTION 3-----");
		System.out.println("The answer for Question 3 is: You access the last element of an array by using the .length method and subtracting 1 from it to get the correct index i.e. 'ages[(ages.length-1)]'");
		System.out.println();
		
		//Problem 4
		System.out.println("-----QUESTION 4-----");
		System.out.println("The answer for Question 4 is: You access the first element of an array by using the index 0 i.e. 'ages[0]'");
		System.out.println();
		
		//Problem 5
		
		int[] nameLengths = new int[6];
		System.out.println("-----QUESTION 5-----");
		System.out.println("The results for Question 5 are: ");
		for (int i=0;i<names.length;i++) {
			nameLengths[i]=names[i].length();
			System.out.println(nameLengths[i]);
		}
		System.out.println();
		
		//Problem 6
		int nameLengthSum =0;
		
		for (int nameLength:nameLengths) {
			nameLengthSum+=nameLength;
		}
		System.out.println("-----QUESTION 6-----");
		System.out.println("The answer for Question 6 is: " + nameLengthSum);
		System.out.println();
		
		//Problem 7
		System.out.println("-----QUESTION 7-----");
		System.out.println("The answer for Question 7 is: " + concatString("Hello", 3));
		System.out.println();
		
		//Problem 8
		System.out.println("-----QUESTION 8-----");
		System.out.println("The answer for Question 8 is: " + concatName("Andrew", "Duncan"));
		System.out.println();
		
		//Problem 9
		System.out.println("-----QUESTION 9-----");
				int [] nums = new int[] {100,10,10};
				System.out.println("The values of the first array are: 100, 10, 10");
				System.out.println("The answer for Question 8 is: " + greaterThan100(nums));
				int [] nums2 = new int[] {10,10,10};
				System.out.println("The values of the second array are: 10, 10, 10");
				System.out.println("The answer for Question 8 is: " + greaterThan100(nums2));
				System.out.println();
		
		//Problem 10
				System.out.println("-----QUESTION 10-----");
				double [] arr = new double[] {1.5, 1.5,2.5, 2.5};
				System.out.println("The values in the array are 1.5, 1.5, 2.5, 2.5");
				System.out.println("The answer for Question 10 is: " + avgOfArray(arr));
				System.out.println();
				
		//Problem 11
				double [] arr1 = new double[] {1.5, 1.5,2.5, 2.5};
				double [] arr2 = new double[] {3.5, 3.5,4.5, 4.5};
				System.out.println("-----QUESTION 11-----");
				System.out.println("The values of Array 1 are: 1.5, 1.5, 2.5, 2.5");
				System.out.println("The values of Array 2 are: 3.5, 3.5, 4.5, 4.5");
				System.out.println("The answer for Question 10 is: " + compareArrs(arr1, arr2));
				System.out.println();
				
		//Problem 12
				boolean isHotOutside = true;
				double moneyInPocket = 11.00;
				System.out.println("-----QUESTION 12-----");
				System.out.println("isHotOutside = true, moneyInPocket = 11.00");
				System.out.println("The answer for Question 11 is: " + willBuyDrink(isHotOutside, moneyInPocket));
				System.out.println();
				
		//Problem 13
				boolean isWarm = true;
				boolean isDry = true;
				boolean teeTimeAvailable = true;
				System.out.println("-----QUESTION 13-----");
				System.out.println("For Question 13 I am passing in 3 boolean variables to a method called 'shouldIGolf' that returns 'Yes, You should golf' if isWarm, isDry, and teeTimeAvailable all equal true.");
				System.out.println("I set all variable to true.");
				System.out.println("The answer to Question 13 is: " + shouldIGolf(isWarm, isDry, teeTimeAvailable));
	
	
	}
	
	//METHODS
	
	//Problem 7
	static String concatString(String word, int n) {
		String newString ="";
		for (int i=1;i<=n;i++) {
			newString+= word;
		}
		return newString;
	}
	
	//Problem 8
	static String concatName(String firstName, String lastName) {
			String fullName =firstName + " " + lastName;
			return fullName;
	}
	
	//Problem 9
		static boolean greaterThan100(int[] nums) {
				int sumOfNums=0;
				for(int num:nums) {
					sumOfNums+=num;
				}
				if (sumOfNums>100) {
					return true;
				}else {
					return false;
				}
		}
		
	//Problem 10
		static double avgOfArray (double [] arr) {
			double sumOfArr =0;
			double avgOfArr =0;
			for (double num:arr) {
				sumOfArr+=num;
			}
			avgOfArr = sumOfArr/(arr.length);
			return avgOfArr;
		}
		
	//Problem 11
			static boolean compareArrs (double [] arr1, double []arr2) {
			double sumOfArr1 =0;
			double avgOfArr1 =0;
			double sumOfArr2 =0;
			double avgOfArr2 =0;
			for (double num1:arr1) {
				sumOfArr1+=num1;
			}
			avgOfArr1 = sumOfArr1/(arr1.length);
			for (double num2:arr2) {
				sumOfArr2+=num2;
			}
			avgOfArr2 = sumOfArr2/(arr2.length);
			
			if (avgOfArr1 > avgOfArr2) {
				return true;
			}else {
				return false;
			}
			
			
		}
			
	//Problem 12
			static boolean willBuyDrink (boolean isHot, double pocketMoney) {
			if (isHot == true && pocketMoney > 10.5) {
				return true;
			}else {
				return false;
			}
			}
			
	//Problem 13
			static String shouldIGolf (boolean isWarm, boolean isDry, boolean teeTimeAvailable) {
				if (isWarm ==true && isDry == true && teeTimeAvailable == true) {
					return "Yes, you should golf!";
				}else {
					return "No, don't golf today";
				}
			}
			
			
		

}
