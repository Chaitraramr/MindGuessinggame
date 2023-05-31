import java.util.*;
class game1{  
    public static void main(String args[]){  
        Scanner sc= new Scanner(System.in);
    //declaring and initializing 2D array  
    System.out.println("save the one name on your mind:"); 
    System.out.println("how many letters have in your name:"); 
  int letters= sc.nextInt();
    char arr[][]={
                  {'a','b','c','d','e'},
                  {'f','g','h','i','j'},
                  {'k','l','m','n','o'},
                  {'p','q','r','s','t'},
                  {'u','v','w','x','y'}
                };

    char arr1[]={arr[0][0],arr[1][0],arr[2][0],arr[3][0],arr[4][0]};
    char arr2[]={arr[0][1],arr[1][1],arr[2][1],arr[3][1],arr[4][1]};
    char arr3[]={arr[0][2],arr[1][2],arr[2][2],arr[3][2],arr[4][2]};
    char arr4[]={arr[0][3],arr[1][3],arr[2][3],arr[3][3],arr[4][3]};
    char arr5[]={arr[0][4],arr[1][4],arr[2][4],arr[3][4],arr[4][4]};

    char name[]=new char[10];
    char name2[]=new char[10];
    char name3[]=new char[10];
    char name4[]=new char[10];
    char name5[]=new char[10];
      
    for(int i=0;i<5;i++){  
     for(int j=0;j<5;j++){  
       System.out.print(arr[i][j]+" ");   
     }  //j loop
     System.out.println();
    }//i loop  
    int l1;
    //int m=letters-1;
    int l2[]=new int[letters];

    for(int i=0;i<letters;i++)
    {
        int n=i+1;
    System.out.println("enter the column number "+n+" letter:");   
     l1= sc.nextInt();
     l2[i]=l1;
   if(l1==1)
        {
            //System.out.println(arr1);
            name=arr1;
        }
        else if (l1==2)
        {
           // System.out.println(arr2);
           name2=arr2;
        }
        else if (l1==3)
        {
           // System.out.println(arr3);
            name3=arr3;
        }
        else if (l1==4)
        {
            //System.out.println(arr4);
            name4=arr4;
        }
        else if (l1==5)
        {
           // System.out.println(arr5);
           name5=arr5;
        }
}//for letters
    //System.out.println(l2[0]);
    int m =letters;
    int n=5;
    char store[][]=new char[m][n];
   
    for(int i=0;i<letters;i++)
    {
        if(l2[i]==1)
        {
          for(int o=0;o<5;o++)
            System.out.print(name[o]+" ");
            System.out.println();
          for( m=0;m<1;m++)
          for( n=0;n<5;n++)
          store[m+i][n]=name[n];
            
        }
        else if (l2[i]==2)
        {
          for(int o=0;o<5;o++)
          System.out.print(name2[o]+" ");
          System.out.println();
          for( m=0;m<1;m++)
          for( n=0;n<5;n++)
          store[m+i][n]=name2[n];
        }
        else if (l2[i]==3)
        {
          for(int o=0;o<5;o++)
          System.out.print(name3[o]+" ");
          System.out.println();
          for( m=0;m<1;m++)
          for( n=0;n<5;n++)
          store[m+i][n]=name3[n];
        }
        else if (l2[i]==4)
        {
          for(int o=0;o<5;o++)
          System.out.print(name4[o]+" ");
          System.out.println();
        for( m=0;m<1;m++)
          for( n=0;n<5;n++)
          store[m+i][n]=name4[n];
        }
        else if (l2[i]==5)
        {
          for(int o=0;o<5;o++)
          System.out.print(name5[o]+" ");
          System.out.println();
          for( m=0;m<1;m++)
          for( n=0;n<5;n++)
          store[m+i][n]=name5[n];
        }
    }//name printing loop

    //store 
    //System.out.println("Store value"+store[0][0]);
    System.out.println("Enter again");
    int l3[]=new int[letters];
    for(int i=0;i<letters;i++)
    {
      
    System.out.println("enter the column number "+(i+1)+" letter:");   
     l1= sc.nextInt();
     l3[i]=l1;
   if(l1==1)
        {
            //System.out.println(arr1);
            name=arr1;
        }
        else if (l1==2)
        {
           // System.out.println(arr2);
           name2=arr2;
        }
        else if (l1==3)
        {
           // System.out.println(arr3);
            name3=arr3;
        }
        else if (l1==4)
        {
            //System.out.println(arr4);
            name4=arr4;
        }
        else if (l1==5)
        {
           // System.out.println(arr5);
           name5=arr5;
        }
}//for letters

for(int i=0;i<letters;i++)
{
  int k=l3[i]-1;
  System.out.print(store[i][k]);
}
//for(int i=0;i<letters;i++){
//for(int j=0;j<5;j++)
//System.out.print(store[i][j]);
//System.out.println();
//}
    

}
}