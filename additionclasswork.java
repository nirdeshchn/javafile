package week3;

import java.util.Scanner;

public class additionclasswork {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("The sum of integers from 1 to 10 is " + sum);
 


int sum1 = 0;
for (int i = 20; i <= 30; i++) {
    sum1 += i;
}
System.out.println("The sum of integers from 20 to 30 is " + sum1);



int sum2 = 0;
for (int i = 35; i <= 45; i++) {
    sum2 += i;
}
System.out.println("The sum of integers from 35 to 45 is " + sum2);


int n;

Scanner r=new Scanner(System.in);

System.out.println("Enter length:");

n=r.nextInt();



String[] veg=new String[n];

System.out.println("Enter elements:");



for (int i=0; i<n; i++) {

	veg[i]=r.next();

}



System.out.println("The elements are:");

for (int i=0; i<n; i++) {

	System.out.println(veg[i]);

}

}

}

