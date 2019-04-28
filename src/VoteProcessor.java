import java.util.ArrayList;

public class VoteProcessor {

	public Object calculateElectionWinner(ArrayList<String> votes) {
		// TODO Auto-generated method stub
		int first = 0;
		int second = 0;
		for (int i = 0; i < votes.size(); i++) {
			if(votes.get(i).charAt(0) == 'p' || (votes.get(i).charAt(0) == 'P' )){
				first++;
			}
			else {
				second++;
			}
		}
		if(first > second) {
			return "pope francis";
		}
		else if(first == second){
			return "TIE";
		}
		return "edward snowden"
				;
	}

}
