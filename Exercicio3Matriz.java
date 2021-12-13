package Arrays;

public class Exercicio3Matriz {

	public static void main(String[] args) {
		int mat1[][]={{1,2,3,4,5,6},{6,4,3,2,1},{1,2,3,4,5,6},{6,6,4,3,2,1}};
		int mat2[][]={{1,2,3,4,5,6},{6,4,3,2,1},{1,2,3,4,5,6},{6,6,4,3,2,1}};
		int m1[][]= new int [4][6];
		int m2[][]= new int [4][6];
	
		
				for (int linha=0;linha<4;linha++)
				{
					for(int coluna=0;coluna<6;coluna++)
					{
		                m1[linha][coluna]=mat1[linha][coluna] + mat2[linha][coluna];
						m2[linha][coluna]=mat1[linha][coluna]- mat2[linha][coluna];
					}
				}

	

}
	}

