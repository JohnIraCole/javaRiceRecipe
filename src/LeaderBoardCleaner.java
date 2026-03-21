import java.util.Arrays;

public class LeaderBoardCleaner {
    public static void main(String[] args) {
        System.out.println("NOTE: You are assigned to clean up the leaderboards");
		System.out.println("      Your task is to clean up any duplicate scores,");
	    System.out.println("      remove placeholders that are zeros and present the top 3 scorers");

		int[] scores = {150, 0, 200, 150, 75, 0, 300, 200};
		int[] newScores = new int[scores.length];

		int j = 0;

        //removes zeros
		for(int i = 0; i < scores.length; i++){
			if(scores[i] == 0)
				continue;			
			else
		    	newScores[j++] = scores[i];
		}

		newScores = Arrays.copyOf(newScores,j);

        int[] finalScore = new int[newScores.length];
         
		int unique = 0;

        //removes duplicates
        for(int i = 0; i < newScores.length; i++){
            boolean isDuplicate = false;
            for(int k = 0; k < newScores.length; k++){
                if(newScores[i] == finalScore[k] && i != k){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                finalScore[unique++] = newScores[i];
            }
        }

        Arrays.sort(finalScore);

        System.out.println("Top 3 Scores: ");
        //I just copied this from gpt cuz I was having a headache
        for (int i = finalScore.length - 1; i >= finalScore.length - 3; i--) {
            System.out.println(finalScore[i]);
        }
		
				
    }			
}
