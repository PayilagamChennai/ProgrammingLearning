package payilagam.looping;

public class ForLooping2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=0;row<3;row++)
		{
			for(int column=3;column>row;column--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
