public class isPalindrome{
	public boolean check(int num){
		if(num>=0 && num<10){return true;}
		if(num%10==0){return false;}

		int reverse=0;

		while(reverse<num){
			reverse=reverse*10+num%10;
			num=num/10;
		}

		if(reverse==num){return true;}
		else{return false;}
	}
}