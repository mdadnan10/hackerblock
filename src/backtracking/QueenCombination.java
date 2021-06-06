package backtracking;

public class QueenCombination {
    public static void main(String[] args) {

        queenCombination(new boolean[4], 0, 2, -1, "");

    }

    public static void queenCombination(boolean[] boxes, int qpsf, int tq, int livt, String ans) {

        if (qpsf == tq) {
            System.out.println(ans);
            return;
        }

        for (int i = livt + 1; i < boxes.length; i++) {

            boxes[i] = true;
            queenCombination(boxes, qpsf + 1, tq, i, ans + "q" + qpsf + "b" + i + " ");
            boxes[i] = false;


        }

    }

}
