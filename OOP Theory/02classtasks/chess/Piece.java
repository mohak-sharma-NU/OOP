public abstract class Piece implements Movable{

    public static class Position{
        private int row;
        private int column;

        public Position(){

        }
        public Position(int row,int column){
            this.row = row;
            this.column = column;
        }

        public boolean isWithinBounds(int row,int column){
            return (row>=0&&row<=7)&&(column>=0&&column<=7);
        }
        
        public int getRowPosition(){return this.row;}

        public int getColumnPosition(){return this.column;}

    }

    //P,K,R,B,Q,K
    private String color;
    private Position position;
    private boolean hasMoved;

    public abstract char getSymbol();
    public String getColor(){
        return this.color;
    }


    public String getInfo(){
        return "[" +this.color+" at ";
    }



}