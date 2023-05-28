import java.util.*;

//import javax.swing.event.SwingPropertyChangeSupport;

public class ArraysBasics {
	public static void main(String[] args) {
		// int arr[] = { 1, 2, 23, 3, 44, 5 };
		// // int sum = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		// // // double avg = 0;
		// // for (int i : arr) {
		// // sum += i;
		// // min = Math.min(min, i);
		// // max = Math.max(max, i);
		// // }
		// // System.out.println(min + "-" + max);
		// int key = 5;
		// int n = arr.length;
		// // for (int i = 0; i < n - 1; i++) {
		// // for (int j = i + 1; j < n; j++) {
		// // if (arr[i] > arr[j]) {
		// // int temp = arr[i];
		// // arr[i] = arr[j];
		// // arr[j] = temp;
		// // }
		// // }
		// // }
		// Arrays.sort(arr);
		// //PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->a-b);
		// int i=0,j=n;
		// while(i<j) {
		// int mid=i+(j-i)/2;
		// if(arr[mid]==key) {
		// System.out.println("Key Found at index "+ (mid+1));
		// break;
		// }
		// else if(arr[mid]<key) {
		// i=mid+1;
		// }
		// else {
		// j=mid-1;
		// }
		// }
		// System.out.println("Key Not Found = "+(-1));
		//// for (int i : arr) {
		//// System.out.println(i);
		//// }

		// int ascii[]=new int[] {67,98,114,110,100,120};
		// for(int i:ascii) {
		// System.out.println((char)i);
		// }

		// int arr[]= {34,4,65,234,56,1,89};
		// int max=-1,secMax=0,min=1000,secMin=999;
		// for(int i:arr) {
		// if(i>max) {
		// secMax=max;
		// max=i;
		// }
		// else if(i>secMax){
		// secMax=i;
		// }
		// if(i<min) {
		// secMin=min;
		// min=i;
		// }
		// else if(i<secMin){
		// secMin=i;
		// }
		// }
		// System.out.println("Max"+max+" ,"+"SecMax"+secMax);
		// System.out.println("Min"+min+" ,"+"SecMin"+secMin);

		// int arr[]= {12,34,12,12,45,67,89,34};
		// Arrays.sort(arr);
		// int uniqueArr[]=new int[arr.length];
		// int j=0;
		// for(int i=0;i<arr.length-1;i++) {
		// if(arr[i]!=arr[i+1]) {
		// uniqueArr[j++]=arr[i];
		// }
		// }
		// uniqueArr[j++]=arr[arr.length-1];
		// int finalArr[]=new int[j];
		// System.arraycopy(uniqueArr, 0, finalArr, 0, j);
		// for(int i:finalArr) {
		// System.out.println(i);
		// }
		//
		// BufferedReader br=new BufferedReader(InputStreamReader(System.in));
		// int n;
		// try {
		// n = br.read();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// Scanner sc=new Scanner(System.in);
		// int n=sc.nextInt();
		// int arr[]=new int[n];
		// for(int i=0;i<n;i++) {
		// arr[i]=sc.nextInt();
		// }
		// int sum=0,indexSeven=-1,indexSix=-1;
		// for(int i:arr) {
		// sum+=i;
		// }
		// for(int i=n-1;i>=0;i--) {
		// if(arr[i]==7) {
		// indexSeven=i;
		// }
		// if(arr[i]==6) {
		// indexSix=i;
		// }
		// }
		// System.out.println(indexSeven+"-"+indexSix);
		// for(int i=indexSix;i<=indexSeven;i++) {
		// sum-=arr[i];
		// }
		// System.out.println(sum);
		// //sc.close();

		// int arr[] = new int[] { 1, 99, 10, 2 };
		// int n = arr.length;
		// int uniqueArr[] = new int[n];
		// int j = 0;
		// for (int i : arr) {
		// if (i != 10) {
		// uniqueArr[j++] = i;
		// }
		// }
		// int finalArr[] = new int[j];
		// System.arraycopy(uniqueArr, 0, finalArr, 0, j);
		// for (int i : finalArr) {
		// System.out.println(i);
		// }

		// int arr[] = new int[] { 3, 2, 3 };
		// int n = arr.length;
		// int uniqueArr[] = new int[n];
		// int j = 0;
		// for (int i : arr) {
		// if (i % 2 == 0) {
		// uniqueArr[j++] = i;
		// } // } else {
		// // if (j < n) {
		// // uniqueArr[n--] = i;
		// // }
		// // }
		// }
		// for (int i : uniqueArr) {
		// System.out.println(i);
		// }

		System.out.println("The given array is :");
		int arr[][] = new int[3][3];
		int k = 0, max = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = Integer.parseInt(args[k++]);
				max = Math.max(arr[i][j], max);
			}
		}
		for (int i[] : arr) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println(max);
		// System.out.println(args[0] + " " + args[1]);
		// System.out.println(args[2] + " " + args[3]);
		// System.out.println("The reverse of the array is :");
		// System.out.println(args[3] + " " + args[2]);
		// System.out.println(args[1] + " " + args[0]);
	}
}
