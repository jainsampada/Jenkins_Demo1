

public class Bubble1 {
	 int[] ar={5,4,10,3,1};
		int a;
		public void display(){
			System.out.println("Array is: {5,4,10,3,1}");
			
			for (int k=0;k<ar.length-1;k++){
				System.out.println("Step "+(k+1));
			for(int i=0;i<ar.length-k-1;i++)
			{	
		       if(ar[i]>ar[i+1])
		         { 
		    	   a=ar[i];
		    	   ar[i]=ar[i+1];
		    	   ar[i+1]=a;
		         }  
		      for(int j=0;j<5;j++)
		           {
		    	   System.out.print(ar[j] +" ");
		    	   }
		       System.out.println();
		       }	
			System.out.println("---*****---");
		}
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Bubble1 o=new Bubble1();
			o.display();
			
		}

	}

