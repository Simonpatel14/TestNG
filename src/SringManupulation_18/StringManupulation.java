package SringManupulation_18;

public class StringManupulation {
	public static void main(String[] args) {
		System.out.println("----3rd Occurrence---------");
		String s = "Hi This is my java code and I am so happy ";
		System.out.println(s.indexOf("i"));// 1st Occurrence
		
		System.out.println(s.indexOf("i", s.indexOf("i")+1));// 2nd Occurrence
		
		System.out.println(s.indexOf("i", s.indexOf("i")+5));//3rd Occurrence
		
	//WAP to to do addition of 100A +20 to get output 120.
		System.out.println("------to get output 120 from 120A------ ");
		String s1 = "100A";
		String s2 = s1.substring(0, 3);
		int k = Integer.parseInt(s2);
		System.out.println(k);
		
		
	//WAP to reverse JAVA_PYTHON_RUBY_JAVASCRIPT
		String a = "JAVA_PYTHON_RUBY_JAVASCRIPT";
		String rev = "";
		String a1 [] = a.split("_");
		
		System.out.println(a1.length);
		for(int i =0;i<a1.length;i++) {
			for (int j=a1[i].length()-1;j>=0;j--) {
			rev = rev +a1[i].charAt(j);
			
			}
			rev = rev + "_";
			
		}
		System.out.println(rev);
		
		System.out.println("---------------------");
		for(String e : a1) {
			System.out.println(e);
		}
		
		
		
		
		
		
		String test = "xXtestingxXXjavaXxXseleniumxXxpython";
		String myTest[] = test.split("xX");
		System.out.println(myTest[0]);
		System.out.println(myTest[1]);
		System.out.println(myTest[2]);
		System.out.println(myTest[3]);
		System.out.println(myTest[4]);
		
		String cred = "testing|test123|admin";
		String cr [] = cred.split("//|");
		System.out.println(cred.split("\\|")[0]);
		System.out.println(cred.split("\\|")[1]);
		System.out.println(cred.split("\\|")[2]);
		//String cr = cred.split(cred, k)

		
		
		
		
	

		//int k = Integer.parseInt((i.subSequence(0, i.length()-1));
		
		
		
		
		
		
		
		
		
		
	
	}
}
