//matrix multiplication.
import java.util.*;
public class matrix {
    public static void main(String[] args) {
        new multiplication();
    }
    
}
class multiplication{
    public multiplication(){
        int row1,col1,row2,col2,i,j,k,sum=0;
        System.out.println("Enter row and column of first matrix : ");
        Scanner sc=new Scanner(System.in);
        row1=sc.nextInt();
        col1=sc.nextInt();
        int mat1[][]=new int[row1][col1];
        System.out.println("Enter elements of first matrix : ");
        for(i=0;i<row1;i++){
            for(j=0;j<col1;j++){
                System.out.println("Enter element of "+(i+1)+" row and "+(j+1)+" column : ");
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter row and column of second matrix : ");
        row2=sc.nextInt();
        col2=sc.nextInt();
        int mat2[][]=new int[row2][col2];
        int mat3[][]=new int[row1][col2];
        if(col1 != row2){
            System.out.println("Matrices of given order can't multiplied with each other!!");
        }
        else{
            System.out.println("Enter elements of second matrix : ");
            for(i=0;i<row2;i++){
                for(j=0;j<col2;j++){
                    System.out.println("Enter element of "+(i+1)+" row and "+(j+1)+" column : ");
                    mat2[i][j]=sc.nextInt();
                }
            }
            //perform product.
            for(i=0;i<row1;i++){
                for(j=0;j<col2;j++){
                    for(k=0;k<row2;k++){
                        sum+=mat1[i][k]*mat2[k][j];
                    }
                    mat3[i][j]=sum;
                    sum=0;
                }
            }
            System.out.println("Product of two matrices : ");
            for(i=0;i<row1;i++){
                for(j=0;j<col2;j++){
                    System.out.print(" | "+mat3[i][j]+" | ");
                }
                System.out.println();
            }
        }
    }
}
