package Java_basics;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= "madac";
		/*System.out.println(a.charAt(1));
		System.out.println(a.indexOf("h"));
		System.out.println(a.substring(0,2));
		System.out.println(a.concat(" Jagmohan"));
		String arr[]=a.split("e");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replace("l", "m"));*/
		String b="";
		
		for (int i=0; i<5; ++i)
		{
			System.out.println(i);
		}
		
		for (int i=a.length()-1; i>=0;i--)
		{
		
		b=b+a.charAt(i);
		

	}
		System.out.println(b);
		
		if(a.contentEquals(b))
		{
			System.out.println("Pallindrome hurrah!");
		}
		

}
}

