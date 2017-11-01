import java.util.Scanner;

public class MinusCalc {

	
	public static int minus(int a, int b)
	{

		return a-b;
	}



	public static void main(String args[]){
		String oper;

		Scanner sc = new Scanner(System.in);

		System.out.print("계산할 식을 입력하세요aa : ");
		oper = sc.nextLine();

		String result[] = new String[3];
		result = oper.split(" ");



		int sum = 0;
		int i , j;
		i = Integer.parseInt(result[0]);
		String operator = result[1];
		j = Integer.parseInt(result[2]);





		switch (operator) {
		case "-" : 
			sum = minus(i,j);
		default:
			break;
		}

		System.out.println(sum);
	}
}


