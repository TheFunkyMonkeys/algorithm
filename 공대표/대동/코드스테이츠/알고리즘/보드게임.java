package 대동.코드스테이츠.알고리즘;

public class 보드게임 {
    public static void main(String[] args) {
        int[][] board3 = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0}
        };
        int output3 = boardGame(board3, "DDRRRUDUDUD");
        System.out.println(output3);
    }

    public static Integer boardGame(int[][] board, String operation) {
        // TODO:
        int result = 0;

        int row = 0;
        int col = 0;
        for (int i = 0; i < operation.length(); i++) {
            char command = operation.charAt(i);

            switch (command) {
                case 'U':
                    row -= 1;
                    if (row < 0) {
                        return null;
                    }
                    break;
                case 'D':
                    row += 1;
                    if (row > board.length - 1) {
                        return null;
                    }
                    break;
                case 'R':
                    col += 1;
                    if (col > board[row].length - 1) {
                        return null;
                    }
                    break;
                case 'L':
                    col -= 1;
                    if (col < 0) {
                        return null;
                    }
                    break;
            }

            result += board[row][col];
        }

        return result;
    }
}
