public class reverseInteger {
	public class reverse(int s){
		long result=0;

		while(s!=0){
			result=result*10 + s%10;
			s=s/10;
		}

		return (result > Interger.MAX_VALUE || result < Interger.MIN_VALUE)? 0 : int(s);
	}
}