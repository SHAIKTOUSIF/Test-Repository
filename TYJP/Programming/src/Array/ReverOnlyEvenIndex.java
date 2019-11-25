package Array;

public class ReverOnlyEvenIndex {
	public static void main(String[] args) {
		int a[]= {10,20,32,54,21,30};
		int temp=0;
		for(int i=0;i<a.length/2;i++) {
			for(int j=a.length-1;j>=a.length/2;j--) {
				if(i%2==0&&j%2==0) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
			}
			else
			{
				i++;
			}
			}
			break;
		}
		
	}

}
