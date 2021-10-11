package AkshaysirAssignment;

public class Stock_Problem_2 {

	public static void main(String[] args) {
		
		
		
		int[] prices = {7,11,1,2,4};
		 int[] arr= new int[prices.length];
			int n=0;
			int num =0;
			int result=0;
			int n1=0;
			int count =0;
			int min =0;
			int output1=0;
			int output2=0;
	        int output3 =0;
			for(int i=0;i<prices.length;i++) {
				for(int j =i+1;j<prices.length;j++) {
					if(prices[i]<prices[j]) {
						arr[n]=prices[i];
						n++;
						count++;
						break;
					}else {
						arr[n]=0;
						n++;
						break;
					}
				}
			}

			if(count == 0) {
				System.out.println(num);
			}else {

				int[] req = new int[count];
				for(int i=0;i<prices.length;i++) {
					for(int j =i+1;j<prices.length;j++) {
						if(prices[i]<prices[j]) {
							req[n1]=prices[i];
							n1++;
							break;
						}else {
							break;
						}
					}
				}

				min = req[0];
				for(int i=0;i<req.length;i++) {
					if(req[i]<min) {
						min= req[i];
					}
					
				}
				for(int i=0;i<prices.length;i++) {
					if (prices[i] == min) {
						result = i;
					}
				}
				int resultarr[]=new int[prices.length];
					for(int j =result;j<prices.length;j++) {
						resultarr[j]=prices[j];
					}
					int max=resultarr[0];

					for(int k =0;k<resultarr.length;k++) {
						if(resultarr[k]>max) {
							max = resultarr[k];
						}
					}
					output1=(max-min);
						
				
			//new method;
			int[] prices1 = new int[prices.length];
			int n2=0;
			int num1 =0;
			int result1=0;
	        int count1=0;
			
			for(int i=0;i<prices.length;i++) {
				for(int j =i+1;j<prices.length;j++) {
					if(prices[i]<prices[j]) {
						prices1[n2]=prices[i];
						result1=prices[i];
	                    count1++;
						n2++;
						break;
					}else {
						prices1[n2]=0;
						n2++;
						break;
					}
				}if(count1>0) {
					num1=num1+i;
					break;
				}
				//arr2[i]=arr1[i];
			}//System.out.println(num);
			if(count1==0) {
				System.out.println(result1);
			}else {
				for(int j =num1+1;j<prices.length;j++) {
					prices1[j]=prices[j];
				}
				int max1=prices1[0];

				for(int k =0;k<prices1.length;k++) {
					if(prices1[k]>max1) {
						max1 = prices1[k];
					}
				}
				output2=(max1-result1);
					
			}
			int[] prices3 = new int[prices.length];
			int n3=0;
			int num3 =0;
			int result3=0;
	        int count3=0;
			
			for(int i=0;i<prices.length;i++) {
				for(int j =i+1;j<prices.length;j++) {
					if(prices[i]<prices[j]) {
						prices3[n3]=prices[i];
						result3=prices[i];
	                    count3++;
						n3++;
						break;
					}else {
						prices3[n3]=0;
						n3++;
						break;
					}
				}if(count3>1) {
					num3=num3+i;
					break;
				}
				//arr2[i]=arr1[i];
			}//System.out.println(num);
			if(count3==0) {
				System.out.println(result3);
			}else {
				for(int j =num3+1;j<prices.length;j++) {
					prices3[j]=prices[j];
				}
				int max1=prices3[0];

				for(int k =0;k<prices3.length;k++) {
					if(prices3[k]>max1) {
						max1 = prices3[k];
					}
				}
				output3=(max1-result3);
					
			}
			
			}
	
			if(output1>output2&&output1>output3) {
				System.out.println(output1);
			}else if(output2>output1&&output2>output3) {
				System.out.println(output2);
			}else {
				System.out.println(output3);
			}
		
	}
		

}
