package MultiSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableSorting {
    public static void main(String[] agrs){

        List<Score> scores = new ArrayList<>();
        scores.add(new Score(100, 50));
        scores.add(new Score(90, 50));
        scores.add(new Score(100, 60));
        scores.add(new Score(80, 100));
        scores.add(new Score(95, 95));

        Collections.sort(scores, new ScoreComparator());
        // 기본적으로 sort 함수는 오름 차순으로 정렬 해주고 있으나 Score 클래스에서 comparable 함수를 사용자 지정으로 설정하였기에 내림 차순으로 보임

        // 다음의 방법도 가능
        //Collections.sort(scores);

        for(Score score : scores){
            System.out.println(score.toString());
        }
    }
}

class Score implements Comparable<Score>{
    int english;
    int math;

    public Score(int english, int math){
        this.english = english;
        this.math = math;
    }

    @Override
    public String toString(){
        return "English : " + this.english + "  Math : " + math;
    }

    @Override
    public int compareTo(Score o){
        if(this.english == o.english){
            return o.math - this.math;
        }  
        return o.english - this.english;
    }
}

class ScoreComparator implements Comparator<Score>{
    @Override
    public int compare(Score score1, Score score2){
        if(score1.english == score2.english){
            return score2.math - score1.math;
        }
        return score2.english - score1.english;
    }


}
