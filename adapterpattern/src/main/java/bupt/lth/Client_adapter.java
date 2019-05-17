package bupt.lth;

public class Client_adapter {
    public static void main(String[] args) {
        ScoreOperation scoreOperation = new OperationAdapter();
        //scoreOperation = (ScoreOperation) XMLUtil_adapter.getBean();
        int[] scores = {1,2,3,4,5,9,7,8,6};
        int[] result;
        int score;
        result = scoreOperation.sort(scores);
        score = scoreOperation.search(scores, 5);
        for(int i:result){
            System.out.println(i);
        }
        System.out.println(score);
    }
}
