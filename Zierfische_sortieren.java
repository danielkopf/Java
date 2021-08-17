
public class Zierfische_sortieren {
	
	public static void main (String [] args) {
		
		int [] zierfische = {9,5,1,8,6,3};
		
		System.out.println("Zierfische unsortiert: ");
		for (int i = 0; i<zierfische.length; i++) {
			System.out.print(zierfische[i] + "| ");
		}
		System.out.println();
		
		int [] nachAlter = selectionSort(zierfische);
		
		System.out.println("Zierfische sortiert: ");
		for (int i = 0; i<nachAlter.length;i++) {
			System.out.print(nachAlter[i] + "| ");
		}
	}
	
	public static int [] selectionSort (int [] sort) {
	
	for (int i = 0; i<sort.length; i++) {
		
		for(int j = i+1; j<sort.length; j++) {
			
			if (sort[j] < sort[i]) {
				int speicher = sort [i];
				sort [i] = sort [j];
				sort[j] = speicher;
				}
			}
		}
	return sort;
	}
}
