public class a5 {
    private int numofentries=0;
    a4[]board;
    public a5(int capy)
    {
        board=new a4[capy];
    }

    public a4[] getBoard() {
        return board;
    }
    public void add(a4 e){
        int newscor=e.getScore();
        if (numofentries < board.length || newscor > board[numofentries - 1].getScore()) {
            if (numofentries< board.length)
                numofentries++;
            int j=numofentries-1;
            while (j>0&&newscor>board[j-1].getScore())
            {
                board[j]=board[j-1];
                j--;
            }
            board[j]=e;
        }

    }
    public a4 remove(int index)
    {
        if (index<0||index>numofentries)
            throw new ArrayIndexOutOfBoundsException("invalid index "+index);
        a4 deleted=board[index];
        for (int i = index; i < numofentries-1; i++) {
            board[i]=board[i+1];

        }
        board[numofentries-1]=null;
        numofentries--;
        return deleted;
    }
}
