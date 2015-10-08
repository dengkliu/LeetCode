public class Uniquepath {
    public int uniquePaths(int m, int n) {
        
        if(n==1||m==1) return 1;
        if(n==0||m==0) return 0;
        
        long result=1;
        
        if(m<n){int t=m; m=n; n=t;}
        
        for(int i=0; i<n-1; i++){
            result*=n+m-2;
            m--;
        }
        
        for(int i=1; i<=n-1; i++){
            result/=i;
        }
        
        return (int) result;
    }
}
    