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
