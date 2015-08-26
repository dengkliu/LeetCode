public class atoi{
	public int myAtoi(String str){
		if(str==null||str.length()==0){
			return 0;
		}

		str=str.trim();
		char flag='+';
		long result=0;
		int i=0;

		if(str.charAt(0)=='+'){
			i++;
		}
		if(str.charAt(0)=='-'){
			flag='-';
			i++;
		}

		while(i<str.length() && str.charAt(i)>='0' && str.charAt(i)<='9'){
			result=result*10+ (str.charAt(i)-'0');
			i++;
		}

		if(flag=='-'){
			result=-result;
		}

		if(result > Integer.MAX_VALUE){
			return Integer.MAX_VALUE;
		}
		else if(result < Integer.MIN_VALUE){
			return Integer.MIN_VALUE;
		}
		else {
			return (int)result;
		}
}
}