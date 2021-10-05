package AkshaysirAssignment;

public class Even_Odd_Numbers_Arranging {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,17,19,20,43,32,56,77};
		int evencount = 0;
		int oddcount = 0;
		//using for loop counting Even and Odd Numbers present in the Array.
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evencount++;
			}else {
				oddcount++;
			}
			
		}
		//System.out.println(evencount+" "+oddcount);
		int[] EvenArray = new int[evencount];
		int[] OddArray = new int[oddcount];
		int n1=0;
		int n2=0;
		//using for loop pushing Even and Odd Numbers into corresponding Arrays.
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				EvenArray[n1]=arr[i];
				n1++;
			}else {
				OddArray[n2] = arr[i];
				n2++;
			}
		
			
		}
//		for(int j=0;j<EvenArray.length;j++) {
//			System.out.println(EvenArray[j]);
//		}
//		for(int k=0;k<OddArray.length;k++) {
//			System.out.println(OddArray[k]);
//		}
		//declaring new Arranged Array;
		int[] ArrangedArray = new int[evencount+oddcount];
		//pushing Even elements.
		for(int i=0;i<EvenArray.length;i++) {
			ArrangedArray[i]= EvenArray[i];
		}
		//pushing odd elements.
		for(int j=0;j<OddArray.length;j++) {
			ArrangedArray[evencount]= OddArray[j];
			evencount++;
		}
		//printing resulted array of Arranged.
		System.out.println("Arranged Array in Order of Even and Odd:");
		for(int i=0;i<ArrangedArray.length;i++) {
			System.out.print(ArrangedArray[i]+" ");
		}

	}

}
