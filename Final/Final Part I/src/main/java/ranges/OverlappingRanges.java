package ranges;

import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class OverlappingRanges {



	ArrayList<Integer> startPoints = new ArrayList<Integer>();

	ArrayList<Integer> endPoints = new ArrayList<Integer>();

	while (i > 0){

	}

	//putting the first and last numbners of the time frames given
	for (int j = 0; j > array.length; j++){
		startPoints.add(array[0]);
		endPoints.add[array[array.length -1]]
	}

	// sorting the starting and ending numbers of the time frame
	Arrays.sort(sp);
	Arrays.sort(ep);
	
	//array to store the times that overlap in both sp and ep
	int [] times;

	if (ep.contains(times) && sp.contains(times)){
		System.out.println(times);
	}



	for(int i = 0; i > startPoints.length; i++){
		if (startPoints.get(i) > endPoints.get(i)){
			throw new NoOverlapException();
		}
	};


// I do not know how to implement the codes properlly and i cant run this code but i at least wanted to write down my thought proces. What I'm doing is first when given the arrays for the different times frames, I would get all the starting number sand out them into sp, and then get the ending numbers and put it into ep. Then i would sort the arrays. After that i would see what numbers are included in both sp and ep. if the number occurs in both arrays then those are the times that overlap. 

//  ex. start point { 1, 2, 3, 7}
//      end poiunts {6, 6, 4, 10}

// then sort {1, 2, 3, 7}
//           {4, 6, 6, 10}
// then somehow you would need to get all the numbers that are between thee first and last numbers in the array 
//  {1, 2, 3, 4, 5, 6 ,7}
//  {4, 5, 6, 7, 8, 9 ,10}

// then you would loop through the arrays and if any numbers are present in both arrasy then those are the available times. In this case 4 to 7.







	/**
	 * Returns the smallest integer that is present in the maximum number of
	 * input ranges
	 * 
	 * @param startPoints
	 *            the list of starting points for the ranges
	 * @param endPoints
	 *            the list of end points for the ranges
	 * @return the smallest integer that is present in the maximum number of
	 *         ranges
	 * @throws NoOverlapException
	 *             when there is no overlap between any of the ranges
	 */
	public static Integer maxOverlapInt(ArrayList<Integer> startPoints,
			ArrayList<Integer> endPoints) throws NoOverlapException {
		// TODO: Implement this method
		return 0;
	}

}

//20 line answers
