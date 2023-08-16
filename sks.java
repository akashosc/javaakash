import java.util.*;

public class sks{
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        
	}
}




























// Define the interface
// interface Shape {
//     void draw();
// }

// // Implement classes that use the interface
// class Circle implements Shape {
//     @Override
//     public void draw() {
//         System.out.println("Drawing a circle");
//     }
// }

// class Rectangle implements Shape {
//     @Override
//     public void draw() {
//         System.out.println("Drawing a rectangle");
//     }
// }

// // Main class to demonstrate usage
// public class sks {
//     public static void main(String[] args) {
//         Shape circle = new Circle();
//         Shape rectangle = new Rectangle();

//         // Using the interface methods to draw different shapes
//         circle.draw();
//         rectangle.draw();
//     }
// }





   // all Shorting algorithum
// 	public static void bublesort(int arr[],int n){
// 		for(int i=0;i<n;i++){
// 		    for(int j=0;j<n-i-1;j++){
// 				if(arr[j]>arr[j+1]){
//                     int temp=arr[j+1];
// 					arr[j+1]=arr[j];
// 			        arr[j]=temp;
// 				}
// 			}
// 		}
// 	}
// 	public static void insertationsort(int arr[],int n){
// 		for(int i=0;i<n;i++){
// 			int present=i;
// 		     while(present>0&&arr[present-1]>arr[present]){
// 				int temp=arr[present-1];
// 				arr[present-1]=arr[present];
// 				arr[present]=temp;
// 				present--;
// 			 }
// 		}
// 	}
// 	public static void marge(int arr[],int low,int mid,int high){
//           int n1=mid-low+1;
//           int n2=high-mid;
// 		  int ar1[]=new int[n1];
// 		  int ar2[]=new int[n2];
//         for(int i=0;i<n1;i++){
//            ar1[i]=arr[low+i];
// 		}
// 		for(int i=0;i<n2;i++){
//            ar2[i]=arr[mid+1+i]; 
// 		}
// 		int i=0;int j=0;
//         int k=low;
// 		while(i<n1&&j<n2){
// 			if(ar1[i]<=ar2[j]){
// 				arr[k]=ar1[i];
// 				i++;
// 			}else{
// 				arr[k]=ar2[j];
// 				j++;
// 			}
// 			k++;
// 		}
// 		while(i<n1){
// 			arr[k]=ar1[i];
// 			i++;
// 			k++;
// 		}
// 		while(j<n2){
// 			arr[k]=ar2[j];
// 			j++;
// 			k++;
// 		}

// 	}
// 	public static void margesort(int arr[],int low,int high){
// 		 if(low>=high){
// 			return ;
// 		 }
//         int mid =(low+high)/2;
// 	     margesort(arr, low, mid);
// 		 margesort(arr, mid+1, high);

// 		marge(arr,low,mid,high);
// 	}
// 	public static int slidingwindow(int arr[],int n,int k){
// 		  int i=0;int j=0;
// 		  int sum=0;int ans=Integer.MIN_VALUE;
// 		  while(j<n){
				 
// 		  }
// 		  ans=Math.max(ans,sum);
// 		  return ans;
		  
// 	}
// // all Shorting algorithum









// // graph algorithum
//  public static void dfs(ArrayList<Integer> node,ArrayList<ArrayList<Integer>> adj,boolean visited[], ArrayList<Integer> ans){
	   
	   
//           for(int i=0;i<node.size();i++){
//               if(!visited[node.get(i)]){
// 				visited[node.get(i)]=true;
// 				ans.add(node.get(i));
// 				 dfs(adj.get(node.get(i)),adj,visited,ans);
//               }
//           }
//           return ;
           
//     }
//     public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
//           boolean visited[]=new boolean[V+1];
//           ArrayList<Integer> ans=new ArrayList<>();
// 		  ans.add(0);
//           for(int i=0;i<V;i++){
//               for(int j=0;j<adj.get(i).size();j++){
// 				  visited[i]=true;
//                    if(!visited[adj.get(i).get(j)]){
//                        dfs(adj.get(i),adj,visited,ans);
//                    }
//               }
//           }
// 		  return ans;
//     }









