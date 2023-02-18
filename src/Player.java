public class Player {
    private int total;          // Total from current round
    private int wins;           // Rounds won
    private String name;        // Their name, duh

    public Player(String newName)
    {
        total = 0;
        wins = 0;
        name = newName;
    }

    public void setTotal(int newTotal)
    {
        total = newTotal;
    }

    public void increaseWins()
    {
        wins++;
    }
    public int getTotal()
    {
        return total;
    }
    public int getWins()
    {
        return wins;
    }
    public String getName()
    {
        return name;
    }

}
